package shop;

import java.security.spec.MGF1ParameterSpec;
import java.time.LocalDateTime;
import java.util.ArrayList;

import shop.funcions.*;
public class botiga {

    public static void main(String[] args) {

        boolean surt = false;

        ArrayList<StockProducte> alps = new ArrayList<>();
        ArrayList<RegistraClient> cr = new ArrayList<>();
        ArrayList<Comanda> ca = new ArrayList<>();

        int idstock = 1;
        int idlinia = 1;
        int idcomanda = 1;

        while(!surt){

            Menu.printar();
            int opcio = Integer.parseInt(System.console().readLine("Introdueix el numero d'opció que vols escollir: "));

            switch(opcio){

                case 1:
                    StockProducte sp;
                    int quantiat = 0;                    
                    String referencia = System.console().readLine("Introdueix la referencia del producte: ");

                    if (Menu.checkProductInWarehouse(alps, referencia)){
                        
                        sp = Menu.checkSXPByRef(alps, referencia);
                        quantiat = Integer.parseInt(System.console().readLine("Introdueix la quanitat que vols afegir del producte: "));
                        sp.addNewStock(quantiat);  

                    }
                    else{
                        RegistraProducte rp = new RegistraProducte(referencia);
                        rp.setDescripcio(System.console().readLine("Introdueix la descripció del producte: "));
                        rp.setPreu(Float.parseFloat(System.console().readLine("Introdueix el preu d'quest producte: ")));
                        sp = new StockProducte(idstock);
                        sp.setProd(rp);
                        sp.setQuanitatstock(Integer.parseInt(System.console().readLine("Introdueix la quantiat de unitats: ")));
                        alps.add(sp);
                        idstock++;
                    }
                    break;
                case 2:
                    Menu.PrintarPorductes(alps);
                    break;
                case 3:
                    RegistraClient rc; 
                    String idclient = System.console().readLine("Introdueix el dni del client: ");

                    if(Comprovacions.CheckIfClientExist(cr, idclient)){
                        String canviardades = System.console().readLine("Aquest client ja existeix, vols canviar algunes dades d'aquest?(S)si (Qualsevol lletra) no: ");
                        
                        if(canviardades.equalsIgnoreCase("S")){
                            rc = new RegistraClient(idclient);
                            rc = Menu.checkClientByDNI(cr, idclient);
                            boolean exit = false;
                            while(!exit){
                                Menu.OptionsForChangeInfoUser();
                                int opciob = Integer.parseInt(System.console().readLine("Introdueix el numero d'opcio que vols escollir: "));
                                switch(opciob){
    
                                case 1:
                                    rc.addNewTelefon(Integer.parseInt(System.console().readLine("Introdueix el nou numero de telefon: ")));
                                    break;
                                case 2:
                                    rc.addNewDireccio(System.console().readLine("Introdueix la nova direcció: "));
                                    break;
                                case 3:
                                    rc.addNewPoblacio(System.console().readLine("Introdueix la nova població: "));
                                    break;
                                case 4:
                                    exit = true;
                                    break;
    
                                }                                
                            }  

                        }
                    }
                    else{
                        rc = new RegistraClient(idclient);
                        rc.setNom(System.console().readLine("Introdueix el nom del client: "));
                        rc.setCognom(System.console().readLine("Introdueix el cognom del client: "));
                        rc.setTelefon(Integer.parseInt(System.console().readLine("Introdueix el telefon del client: ")));
                        rc.setPoblacio(System.console().readLine("Introdueix la població del client: "));
                        rc.setDireccio(System.console().readLine("Introdueix la direcció del client: "));
                        cr.add(rc);
                    }

                    break;
                case 4:
                    String dnicomprovar = System.console().readLine("Introdueix el DNI del client que vols prinar((T) Si vols printar tots el clients): ");
                    if(dnicomprovar.equalsIgnoreCase("T")){
                        Menu.printarAllClients(cr);
                    }
                    else if(Comprovacions.CheckIfClientExist(cr, dnicomprovar)){
                        Menu.printarClientEspecific(cr, dnicomprovar);
                    }
                    else{
                        System.out.println("La opció que ha introduit es incorrecte: ");                        
                    }
                    break;
                case 5:
                
                    float preucomanda = 0;
                    ArrayList<LiniaComanda> lca = new ArrayList<>();
                    String dnicompra = System.console().readLine("Introdueix el el DNI del client amb el que es realitzara la compra: ");
                    if(Comprovacions.CheckIfClientExist(cr, dnicompra)){
                        boolean finalitzacompra = false;

                        while(!finalitzacompra){
                            LiniaComanda lc = new LiniaComanda(idlinia);
                            String producteacomprar = System.console().readLine("Introdueix la referencia del producte que vols comprar, (0) per finalitzar la compra: ");

                            if (Menu.checkProductInWarehouse(alps, producteacomprar)){
                                StockProducte qp = Menu.checkSXPByRef(alps, producteacomprar);
                                Menu.mostrarInfoPerComprar(qp);
                                int quanitat = Integer.parseInt(System.console().readLine("Introdueix la quanitat d'aquest producte: "));

                                if (Comprovacions.comprovarQuanitatSuficient(qp, quanitat)){
                                    int novaquanitat = qp.getQuanitatstock() - quanitat;
                                    qp.addNewStockAfterBuy(novaquanitat);
                                    Float totallinia = qp.getProd().getPreu() * novaquanitat;
                                    preucomanda = totallinia+preucomanda;
                                    lc.setLiniaPreu(totallinia);
                                    lc.setProducte(qp.getProd());
                                    lc.setQuanitat(quanitat);
                                    lca.add(lc);
                                    idlinia++;                                                                
                                }

                            }
                            else if(producteacomprar.equals("0")){
                                Comanda comanda = new Comanda(idcomanda);
                                comanda.setClient(Menu.takeClientForConsulta(dnicompra, cr));
                                comanda.setLdt(LocalDateTime.now());
                                comanda.setProducte(lca);
                                comanda.setPreutotal(preucomanda);
                                ca.add(comanda);
                                Menu.printarComandaFinalitzada(comanda);
                                idcomanda++;                               
                                finalitzacompra =  true;                                    
                            }
                            else{
                                System.out.println("Referencia no trobada a la BBDD");
                            }
                        }
                    }
                    
                    break;
                case 6:
                    break;


            }

        }

    }
}