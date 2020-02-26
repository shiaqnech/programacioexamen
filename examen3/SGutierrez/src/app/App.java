package app;

public class App {
    public static void main(String[] args) throws Exception {

        int filaclient = 0;
        int codiclient = 0;
        int numerofila = 0;
        String arrayproducte[][] = new String[30][2];
        int arrayunitats[] = new int[30];
        float arraypreu[] = new float[30];
        String arrayclients[][] = new String[100][5];
        String arraycarritodecompra[][] = new String[100][2];

        for (int j = 0; j < arrayproducte[0].length; j++) {
            for (int i = 0; i < arrayproducte.length; i++) {
                arrayproducte[i][j] = " ";
            }
        }

        String separacio = "-------------------------------------------------";
        boolean repetir = true;

        while (repetir) {
            System.out.println();
            System.out.println("Slecciona una de les següents opcions");
            System.out.println();
            System.out.println(
                    "Sortir (0) - Afegir material a l'inventari (1) - Visualitzar Stock (2) - Registrar client (3) - Fer una venda(4)");
            int opcio = Integer.parseInt(System.console().readLine());

            switch (opcio) {
            case 0:
                System.out.println("“Gràcies per fer servir l’aplicació FactuSoft. Fins un altra!");
                repetir = false;
                break;

            case 1:

                for (int i = 0; i < arrayproducte.length; i++) {
                    ;

                    if (i < numerofila) {
                        System.out.println("Numero de referencia: " + arrayproducte[i][0] + " || " + "Descripció "
                                + arrayproducte[i][1]);
                    }

                    else {
                        break;
                    }

                }

                System.out.println(separacio);
                System.out.println("Introdueix el numero de referencia");
                int referencia = Integer.parseInt(System.console().readLine());

                boolean prepetit;
                boolean noentra;

                prepetit = false;
                noentra = false;

                while (!prepetit) {

                    noentra = false;
                    for (int i = 0; i < arrayproducte.length; i++) {
                        if (Integer.toString(referencia).equals(arrayproducte[i][0])) {

                            System.out.println("Aquesta refenrecia ja existeix, correspon a " + arrayproducte[i][1]
                                    + ", introdueix el nombre  de unitats");
                            int producteafegir = Integer.parseInt(System.console().readLine());
                            arrayunitats[i] = arrayunitats[i] + producteafegir;
                            noentra = true;
                            prepetit = true;
                            break;

                        }

                    }

                    if (!noentra) {
                        arrayproducte[numerofila][0] = Integer.toString(referencia);
                        System.out.println(separacio);
                        System.out.println("Introdueix la descripció de l'article");
                        String descripcio = System.console().readLine();
                        arrayproducte[numerofila][1] = descripcio;
                        System.out.println(separacio);
                        System.out.println("Introdueix la quanitat de material");
                        int qmaterial = Integer.parseInt(System.console().readLine());
                        arrayunitats[numerofila] = qmaterial;
                        System.out.println(separacio);
                        System.out.println("Introduiex el preu per unitat");
                        float punitat = Float.parseFloat(System.console().readLine());
                        arraypreu[numerofila] = punitat;
                        System.out.println(separacio);
                        prepetit = true;
                        numerofila++;

                        break;

                    }

                }

                break;

            case 2:
                for (int i = 0; i < arrayproducte.length; i++) {
                    ;

                    if (i < numerofila) {
                        System.out.println("Numero de referencia: " + arrayproducte[i][0] + " || " + "Descripció "
                                + arrayproducte[i][1] + " || " + "Unitats: " + arrayunitats[i] + " || "
                                + "Preu unitat: " + arraypreu[i]);
                    }

                    else {
                        break;
                    }

                }
                break;
            case 3:

                codiclient++;
                arrayclients[filaclient][0] = Integer.toString(codiclient);

                System.out.println("Introdueix el nom de client ");
                arrayclients[filaclient][1] = System.console().readLine();
                System.out.println(separacio);

                System.out.println("Introdueix el cognom del client");
                arrayclients[filaclient][2] = System.console().readLine();
                System.out.println(separacio);

                System.out.println("Introdueix la seva població");
                arrayclients[filaclient][3] = System.console().readLine();
                System.out.println(separacio);

                System.out.println("Introduiex el seu numero de telefon");
                arrayclients[filaclient][4] = System.console().readLine();
                System.out.println(separacio);

                System.out.println("Registre finalitzat");
                System.out.println(separacio);

                filaclient++;

                System.out.println("CodClient    " + "Nom      " + "       Cognom       " + "  Població     "
                        + " Telefon      ");
                System.out.println();

                surt:

                for (int i = 0; i < arrayclients.length; i++) {
                    for (int j = 0; j < arrayclients[0].length; j++) {

                        if (i < filaclient) {
                            System.out.print("    " + arrayclients[i][j] + "\t" + "");

                        } else {
                            break surt;
                        }

                    }
                    System.out.println();
                }

                break;

            case 4:
                System.out.println(separacio);
                System.out.println("Introduir el numero de telefon");
                System.out.println(separacio);
                int carrito = 0;
                String telefon = System.console().readLine();

                boolean cventa;

                cventa = false;
                while (!cventa) {
                    cventa = true;

                    for (int i = 0; i < arrayclients.length; i++) {
                        if (telefon.equals(arrayclients[i][4])) {
                            System.out.println("Client :" + arrayclients[i][1]);
                            System.out.println();
                            System.out.println("Introdueix la referencia de l'article ");
                            int ref = Integer.parseInt(System.console().readLine());

                            for (int r = 0; r < arrayproducte.length; r++) {
                                if (Integer.toString(ref).equals(arrayproducte[r][0])) {
                                    arraycarritodecompra[carrito][0] = Integer.toString(ref);
                                    
                                    boolean unitatsf;
                                    unitatsf = false;

                                    while (!unitatsf) {
                                        unitatsf = true;

                                        System.out.println("Quantes unitats");
                                        int unitats = Integer.parseInt(System.console().readLine());
                                        for (int u = 0; u < arrayunitats.length; u++) {
                                            if (arrayunitats[r] < unitats) {
                                                System.out.println(
                                                "No hi han suficients unitats , es tornaran a demanar");
                                                unitatsf = false;
                                                break;
                                            }
                                            else {
                                                arrayunitats[r] = arrayunitats[r]-unitats;  
                                                unitatsf = true;
                                            }

                                        }
                                    }
                                }
                            }

                        } 

                    }
 
                    if (cventa) {
                        System.out.println("Tornaras al menu i hauras de registrar al client");
                        System.out.println(separacio);
                       
                        break;
                    }
                }

                break;

            }

        }
    }

}