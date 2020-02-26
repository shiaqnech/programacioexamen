package shop.funcions;

import java.util.ArrayList;
import java.util.Map;
import shop.funcions.*;

public class Menu {

    public static void printar() {
        System.out.println("#############################");
        System.out.println("#  1. Registrar un prodcute #");
        System.out.println("#  2. Mostra Stock          #");
        System.out.println("#  3. Afegir client         #");
        System.out.println("#  4. Mostrar clients       #");
        System.out.println("#  5. Realitzar compra      #");
        System.out.println("#  6. Mostrar factures      #");
        System.out.println("#############################");
    }

    public static void OptionsForChangeInfoUser() {

        System.out.println("-------------------------------");
        System.out.println("|      1. Canviar telefon       |");
        System.out.println("|      2. Cnviar la direcció    |");
        System.out.println("|      3. Canviar població      |");
        System.out.println("|      4. Sortir                |");
        System.out.println("-------------------------------");
    }

    public static boolean checkProductInWarehouse(ArrayList<StockProducte> alps, String referencia) {

        for (StockProducte i : alps) {

            if (i.getProd().getReferencia().equals(referencia)) {
                return true;
            }
        }
        return false;
    }

    public static StockProducte checkSXPByRef(ArrayList<StockProducte> alps, String referencia) {
        for (StockProducte i : alps) {

            if (i.getProd().getReferencia().equals(referencia)) {
                return i;
            }
        }
        return null;
    }

    public static void PrintarPorductes(ArrayList<StockProducte> alps) {

        System.out.println("###############STOCK###############");
        for (StockProducte i : alps) {
            System.out.println("----------------------------");
            i.showStockProducte();

        }
        System.out.println("----------------------------");

    }

    public static RegistraClient checkClientByDNI(ArrayList<RegistraClient> cr, String dni) {
        for (RegistraClient i : cr) {

            if (i.getDni().equals(dni)) {
                return i;
            }
        }
        return null;
    }

    public static void printarClientEspecific(ArrayList<RegistraClient> cr, String dnibuscar) {

        for (RegistraClient i : cr) {

            if (i.getDni().equals(dnibuscar)) {
                System.out.println("------------------------------------------");
                System.out.println(i.getNom() + " " + i.getCognom());
                System.out.println(i.getDni());
                System.out.println(i.getPoblacio() + ", " + i.getDireccio());
                System.out.println(i.getTelefon());
                System.out.println("------------------------------------------");
            }
        }
    }

    public static void printarAllClients(ArrayList<RegistraClient> cr) {

        for (RegistraClient i : cr) {

            System.out.println(i.getNom() + " " + i.getCognom());
            System.out.println(i.getDni());
            System.out.println(i.getPoblacio() + ", " + i.getDireccio());
            System.out.println(i.getTelefon());

        }

    }

	public static RegistraProducte registrarProducteLiniaComanda(String referenciacomprar,ArrayList<StockProducte> alps) {

        for (StockProducte i : alps) {
            if(i.getProd().getReferencia().equals(referenciacomprar)){
                return i.getProd();
            }                       
        }
		return null;
	}


	public static RegistraClient takeClientForConsulta(String dnicomprobar, ArrayList<RegistraClient> cr) {
        for (RegistraClient i : cr) {
            if(i.getDni().equalsIgnoreCase(dnicomprobar)){
                return i;
            }             
        }
        return null;
	}

	public static void mostrarInfoPerComprar(StockProducte qp) {
        System.out.println("Descripcio: "+qp.getProd().getDescripcio()+" | Preu/U: "+qp.getProd().getPreu()+" | Quantiat: "+qp.getQuanitatstock());
	}

	public static void printarComandaFinalitzada(Comanda comanda) {
        System.out.println("############################################################");
        System.out.println("###########################FACTURA##########################");
        System.out.println("############################################################");
        System.out.println("                                                  "+comanda.getLdt().getHour()+":"+comanda.getLdt().getMinute()+"  "+comanda.getLdt().getDayOfMonth()+"/"+comanda.getLdt().getMonthValue()+"/"+comanda.getLdt().getYear());
        System.out.println("###########################CLIENT###########################");
        System.out.println("DNI: "+comanda.getClient().getDni());
        System.out.println("Nom: "+comanda.getClient().getCognom()+", "+comanda.getClient().getNom());
        System.out.println("Residencia: "+comanda.getClient().getPoblacio()+", "+comanda.getClient().getDireccio());
        System.out.println("Telefon: "+comanda.getClient().getTelefon());
        System.out.println();
        System.out.println("####################PRODUCTES   COMPRATS####################");
        comanda.showLiniaComanda();

	}

}