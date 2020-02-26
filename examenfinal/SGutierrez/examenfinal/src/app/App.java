package app;

public class App {
    public static void main(String[] args) throws Exception {

        //la variable pmoduls serveix per poder guardar la ultima posicio de modul que sha creat per no imprimir lloc de arrays buits
        //la variable palumnes serveix per lo mateix que moduls però amb alumnes
        //arraymoduls Aquesta es String ja que només la fare servir per emmagatzemar informació, aqui emmagatzemare el MP i el la descripcio del MP
        /* arraynus Aquesta es String ja que només la fare servir per emmagatzemar informació,aquesta emmagatzema 
        les ufs per columnes, cada fila es un modul. Els moduls i les ufs tenen la mateixa fila*/
        // arrayhufs Aquesta es de tipus int ja que necessetiré operar amb les hores de les unitats formatives
        // arrayalumnes aquesta es de tipus String ja que també servira per emmagatzemar informació de l'alumne 
        /*En aquest programa e fet la opcio 1, opcio 2, opcio3, opcio 4, opcio 5, opcio 8, m'ha faltat la opcio  6 i 7  la 6 esta a mitjes el que 
        faig es printar per seleccionar l'alumn, la uf i el modul, aquest també el puc escolir si escullo el modu 4 per exemple hem printa les ufs del modul 4
        pero no se la manera de organitzar les dades de la matricula i mha faltat dir que no printi les uf que falta null no mha donat temps hi ha una part similar amb el codi
        */


        boolean exit = false;
        int pmoduls = 0;
        int palumnes = 0;
        String arraymoduls[][] = new String[100][2];
        String arraynufs[][] = new String[100][6];
        int arrayhufs[][] = new int[100][6];
        String arrayalumnes[][] = new String[100][3];
        String arraymatricula[][] = new String[100][7];

        while (!exit) {

            System.out.println("----------------------------------");
            System.out.println("-------GESTIONES CIRVIANUM--------");
            System.out.println("----------------------------------");
            System.out.println("-----------MENU PRINCIPAL---------");
            System.out.println("----------------------------------");

            System.out.println("1 - Introduir Mòduls Professionals");
            System.out.println("2 - Introduir Unitats Formatives");
            System.out.println("3 - Veure currículum");
            System.out.println("4 - Introduir alumne");
            System.out.println("5 - Llistar alumnes");
            System.out.println("6 - Matricula de alumne a UF's");
            System.out.println("7 - Mostra matricula d'alumne");
            System.out.println("8 - Sortir");

            int opcio = Integer.parseInt(System.console().readLine());

            switch (opcio) {
            case 1:
                boolean opcio1;
                opcio1 = false;

                while (!opcio1) {
                    System.out.println("Introdueix el codi del MP (0 per tornar al menú)");
                    String codi = System.console().readLine();
                    if (codi.equals("0")) {
                        System.out.println();
                        opcio1 = true;
                    } else {
                        arraymoduls[pmoduls][0] = codi;

                        System.out
                                .println("Introdueix una descripció corresponent al codi: " + arraymoduls[pmoduls][0]);
                        arraymoduls[pmoduls][1] = System.console().readLine();
                        pmoduls++;
                    }
                }
                System.out.println();

                break;

            case 2:
                System.out.println("Selecciona el modul professional al que vols afegir UF's");
                for (int i = 0; i < pmoduls; i++) {
                    System.out.println((i + 1) + " - " + arraymoduls[i][0] + " - " + arraymoduls[i][1]);

                }
                int opciomodul = Integer.parseInt(System.console().readLine());
                System.out.println("Opció: " + opciomodul);
                boolean surtuf;
                surtuf = false;
                int uf = 0;

                while (!surtuf) {

                    String nom = System.console().readLine("Introdueix el nom de la UF" + (uf + 1) + " del "
                            + arraymoduls[opciomodul - 1][0] + " (0 per sortir) \n");

                    if (nom.equals("0")) {
                        surtuf = true;
                    } else {
                        arraynufs[opciomodul - 1][uf] = nom;
                        arrayhufs[opciomodul - 1][uf] = Integer
                                .parseInt(System.console().readLine("Introduiex el número d'hores de la UF" + (uf + 1)
                                        + " (implantació de programari específic) \n"));
                        System.out.println();
                    }

                    uf++;

                    if (uf == 6) {
                        surtuf = true;
                    }

                }
                System.out.println();

                break;
            case 3:
                for (int i = 0; i < pmoduls; i++) {
                    System.out.println(arraymoduls[i][0] + " - " + arraymoduls[i][1] + " Hores totals:  "
                            + (arrayhufs[i][0] + arrayhufs[i][1] + arrayhufs[i][2] + arrayhufs[i][3] + arrayhufs[i][4]
                                    + arrayhufs[i][5]));
                    for (int j = 0; j < arrayhufs[0].length; j++) {
                        if (arrayhufs[i][j] != 0) {
                            System.out.println("\t UF" + (j + 1) + " " + arraynufs[i][j] + " - " + arrayhufs[i][j]+" hores");
                        }

                    }
                }
                System.out.println();
                break;
            case 4:
                boolean surtnom;
                surtnom = false;
                while (!surtnom) {
                    String nom = System.console().readLine("Introdueix el nom (0 per sortir)\n");

                    if (nom.equals("0")) {
                        surtnom = true;
                    } else {
                        arrayalumnes[palumnes][0] = nom;
                        String cognom = System.console().readLine("Introdueix el cognom \n");
                        arrayalumnes[palumnes][1] = cognom;
                        System.out.print("Generant adreça e-mail");
                        System.out.print(".");
                        System.out.print(".");
                        System.out.print(".");
                        arrayalumnes[palumnes][2] = nom.toLowerCase() + "." + cognom.toLowerCase() + "@cirvianum.cat";
                        System.out.println("\n E-mail assignat: " + arrayalumnes[palumnes][2]);
                        palumnes++;
                    }
                    System.out.println();
                }

                break;
            case 5:
                System.out.println("Alumnes inscrits a l'aplicatiu");
                for (int i = 0; i < palumnes; i++) {
                    for (int j = 0; j < arrayalumnes[0].length; j++) {
                        if (j < 1) {
                            System.out.print((i + 1) + " - " + arrayalumnes[i][j] + "\t");
                        } else {
                            System.out.print(arrayalumnes[i][j] + "\t");
                        }
                        
                    }
                    System.out.println();
                }
                System.out.println();
                break;
            case 6:
                boolean surtinscripcio;
                surtinscripcio = false;

                while (!surtinscripcio) {
                    System.out.println("Introduiex l'alumne que vols matricular: (0 per menu) \n Alumnes inscrits a l'aplicatiu:");
                    
                    for (int i = 0; i < palumnes; i++){
                        for (int j = 0; j < arrayalumnes[0].length; j++){
                            if (j < 1) {
                                System.out.print((i + 1) + " - " + arrayalumnes[i][j] + "\t");
                            } else {
                                System.out.print(arrayalumnes[i][j] + "\t");
                            }

                        }
                        System.out.println();
                    }

                    int numeroalumne = Integer.parseInt(System.console().readLine());


                    if (numeroalumne == 0){
                        surtinscripcio = false;
                    }
                    else{
                        System.out.println("Introdueix el MP al qual els vols matricular:");
                        for (int i = 0; i < pmoduls; i++) {
                            System.out.println((i+1)+" - "+arraymoduls[i][0]+" "+arraymoduls[i][1]+"\t");

                        }

                        int opciomp = Integer.parseInt(System.console().readLine());

                        arraymatricula[numeroalumne-1][0] = arraymoduls[opciomp][0];

                        System.out.print("Ara introdueix la UF a la que et vols matricular a: "+arrayalumnes[numeroalumne][0]+"\n si vols fer matricula en totes les UF tecleja '0'");

                        for (int j = 0; j < arraynufs[0].length; j++){
                            System.out.println("UF"+(j+1)+" "+arraynufs[opciomp-1][j]);
                        }
                        
                        int opciouf = Integer.parseInt(System.console().readLine());

                        if (opcio == 0){
                            
                            for (int j = 0; j < arraymatricula[0].length; j++){
                                
                            }
                        }
                        else{

                        }

                        
                        
                        

                    }

                }

                break;
            case 7:
                break;
            case 8:
                exit = true;
                break;

            }

        }
    }
}