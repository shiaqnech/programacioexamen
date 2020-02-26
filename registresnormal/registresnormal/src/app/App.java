package app;

public class App {
    public static void main(String[] args) throws Exception {

        String arrayproductes[][] = new String[40][4];
        boolean exit = false;
        int posicio = 0;

        while (!exit) {
            int opcio = Integer.parseInt(System.console().readLine(
                    "Inserir nous productes (1) - Eliminar productes (2) - Modificar un parametre (3) - Suert (4)"));

            switch (opcio) {
            case 1:

                arrayproductes[posicio][0] = System.console()
                        .readLine("Introdueix el numero de registre del producte:");
                arrayproductes[posicio][1] = System.console().readLine("Introdeuix el nom del producte: ");
                arrayproductes[posicio][2] = System.console().readLine("Intordueix el preu per unitat: ");
                int unitats = Integer.parseInt(System.console().readLine("Introdueix la quanitat de unitats"));
                arrayproductes[posicio][3] = Integer.toString(unitats);
                posicio++;

                for (int i = 0; i < posicio; i++) {
                    for (int j = 0; j < arrayproductes[0].length; j++) {

                        System.out.print("" + arrayproductes[i][j] + " - ");
                    }
                    System.out.println();
                }

                break;
            case 2:
                int linea = 0;
                String referencia = System.console().readLine("Introdueix la referencia del producte");

                for (int i = 0; i < arrayproductes.length; i++){

                    if (referencia.equals(arrayproductes[i][0])){
                        linea = i;
                        for (int j = 0; j < arrayproductes[0].length; j++){
                            System.out.print(arrayproductes[i][0]+" - ");                            
                        }
                        String validacio = System.console().readLine("Esteu segurs de que voler elimar el porducte Si (S) No (N)" );

                        if (validacio.equalsIgnoreCase("s")){
                            for (int x = linea; x < arrayproductes.length - 1; x++ ){
                                for (int k = 0 ; k < arrayproductes[0].length; k++){
                                    arrayproductes[x][k] = arrayproductes[x+1][k];
                                }
                            }
                            posicio--;
                            for (int x = 0; x < posicio; x++) {
                                for (int j = 0; j < arrayproductes[0].length; j++) {
            
                                    System.out.print("" + arrayproductes[x][j] + " - ");
                                }
                                System.out.println();
                            }
                            break;
                            
                        }
                        else{
                            System.out.println("S'ha cancelat la eliminacio del producte");

                        }
                    }
                    


                }
                break;
            case 3:
                for (int i = 0; i < posicio; i++) {
                    for (int j = 0; j < arrayproductes[0].length; j++) {

                    System.out.print("" + arrayproductes[i][j] + " - ");
                    }
                    System.out.println();
                }
            
                String breferencia = System.console().readLine("Introdeuix la referencia del producte que vols canviar: ");

                for (int i = 0; i < arrayproductes.length; i++){

                    if (breferencia.equals(arrayproductes[i][0])){
                        String modificar = System.console().readLine("Que vols modificar Referencia(r) -Nom producte(np) - Preu unitat (pu) - Unitats(u)");

                        if (modificar.equals("r")){

                        }
                        if (modificar.equals("np")){

                        }
                        if (modificar.equals("pu")){

                        }
                        if (modificar.equals("u")){
                            
                        }
                    }

                }

                break;
            case 4:
                System.out.println("Gracies per fer servir el programa ");
                exit = false;
                break;

            }
        }

    }

    public static void printaArray(String[][] arrayproductes, int posicio) {

    }
}