package app;

import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {

        char[][] taulell = new char[3][3];
        String[] nom = new String[2];
        char[] lletrajugador = new char[2];
        int fichasj = 0;
        int fichasm = 0;
        int y = 0;
        int x = 0;

        formatataulell(taulell);

        mostrabenvinguda(nom);

        String lletra = System.console().readLine("Tria quina ficha vols ser la (X) o la (O)\n Lletra:  ");

        lletresjugadors(lletra, lletrajugador, nom);

        String començament = System.console()
                .readLine("Si vols començar tu introdueix la lletra (p) si vols que comenci la màquina (m):  ");

        boolean entra = funciocomençament(començament);

        boolean surt = false;

        while (!surt) {

            if (entra) {

                if (fichasj == 3) {

                    System.out.println("#####---Moure Fitxa---#####\n\n");
                    String coordenadesusuari = System.console()
                            .readLine("Introdueix la coordenada de la fitxa que vols moure (y(numero))-(x(numero))");
                    boolean surtt = false;

                    while (!surtt) {
                        String[] arraycoordenadesUsuari = coordenadesusuari.split("-");
                        if (funciomoveusuari(taulell, arraycoordenadesUsuari, lletrajugador)) {
                            String coordenadesusuari2 = System.console()
                                    .readLine("Introdueix les coordenades en la que vols moure la fitxa");
                            if (comprovamoure(taulell, coordenadesusuari, lletrajugador)) {
                                eliminafitxa(taulell, coordenadesusuari);
                                moufitxa(taulell, coordenadesusuari2, lletrajugador);

                                surtt = true;
                            } else {

                            }
                        } else {
                            coordenadesusuari = System.console().readLine(
                                    "A les coordenades que has introduit no es troba que fitxa teva, torna a introduir una altre");
                        }
                    }
                } else {
                    boolean regexok = false;
                    String coordenadayx = System.console()
                            .readLine("Introdueix les coordenades (y(numero)-x(numero)):  ");
                    while (!regexok) {
                        regexok = true;

                        if (regex(coordenadayx)) {
                            boolean coordenadaok = false;
                            while (!coordenadaok) {
                                coordenadaok = true;
                                String[] arraycoordenadesj = coordenadayx.split("-");
                                y = Integer.parseInt(arraycoordenadesj[0]) - 1;
                                x = Integer.parseInt(arraycoordenadesj[1]) - 1;
                                if (comprovarposyx(y, x, taulell)) {
                                    fichasj = tornpersona(taulell, lletrajugador, fichasj, y, x);
                                } else {
                                    coordenadayx = System.console().readLine(
                                            "Aquest coordenada ja es troba ocupada, introdueix una altre (y(numero)-x(numero)) ");
                                    coordenadaok = false;
                                }
                            }
                        } else {
                            coordenadayx = System.console()
                                    .readLine("Has introduit les coordenades malament torna a introduirles:  ");
                            regexok = false;
                        }
                    }
                }
                entra = false;
            } else if (!entra) {

                if (fichasm == 3) {

                } else {
                    Random r = new Random();
                    boolean aleatoriposcok = false;
                    while (!aleatoriposcok) {
                        aleatoriposcok = true;
                        y = r.nextInt(taulell.length);
                        x = r.nextInt(taulell.length);
                        if (comprovarposyx(y, x, taulell)) {
                            fichasm = tornmaquina(taulell, lletrajugador, fichasm, y, x);
                        } else {
                            aleatoriposcok = false;
                        }

                    }

                }
                entra = true;
            }
        }

        mostrataulell(taulell);
    }

    // Formata Taulell
    public static void formatataulell(char[][] taulell) {

        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[0].length; j++) {
                taulell[i][j] = '█';
            }
        }

    }

    // Benvinguda

    public static void mostrabenvinguda(String[] nom) {
        System.out.println("--------|TRES EN RATLLA|--------");
        nom[0] = System.console().readLine("\n Abans de començar hauras de introduïr el teu nom \n Nom:  ");
        nom[1] = "Maquina";
    }

    // Mostra taulell

    public static void mostrataulell(char[][] taulell) {
        System.out.println();
        System.out.println("##############TAULELL##############\n");

        System.out.println("       " + "1" + "          " + "2" + "          " + "3" + "   \n");

        System.out.println("1" + "|    " + taulell[0][0] + "      |       " + taulell[0][1] + "    |      "
                + taulell[0][2] + "   |");
        System.out.println("--------------------------------");
        System.out.println("2" + "|    " + taulell[1][0] + "      |       " + taulell[1][1] + "    |      "
                + taulell[1][2] + "   |");
        System.out.println("--------------------------------");
        System.out.println("3" + "|    " + taulell[2][0] + "      |       " + taulell[2][1] + "    |      "
                + taulell[2][2] + "   |");
    }

    // Lletres jugadors

    public static void lletresjugadors(String lletra, char[] lletrajugador, String[] nom) {
        if (lletra.equals("X")) {
            lletrajugador[0] = 'X';
            lletrajugador[1] = 'O';

        } else {
            lletrajugador[0] = 'O';
            lletrajugador[1] = 'X';

        }

        for (int i = 0; i < nom.length; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + nom[i] + "  ---> " + lletrajugador[i]);
        }
    }

    // Qui comença

    public static boolean funciocomençament(String començament) {
        if (començament.equalsIgnoreCase("p")) {
            return true;

        }
        return false;

    }

    // Regex
    public static boolean regex(String coordenades) {

        if (coordenades.matches("[1-3]{1}-[1-3]{1}")) {

            return true;
        }
        return false;

    }

    // Coprova posoicó y i x

    public static boolean comprovarposyx(int y, int x, char[][] taulell) {
        if (taulell[y][x] == '█') {
            return true;
        }
        return false;
    }
    // Torn de la persona

    public static int tornpersona(char[][] taulell, char[] lletrajugador, int fichasj, int y, int x) {

        taulell[y][x] = lletrajugador[0];
        fichasj++;
        return fichasj;
    }
    // Torn de la maquina

    public static int tornmaquina(char[][] taulell, char[] lletrajugador, int fichasm, int y, int x) {

        System.out.println("Les coordenades que ha triat la maquina son " + (y + 1) + "-" + (x + 1));
        taulell[y][x] = lletrajugador[1];
        fichasm++;
        mostrataulell(taulell);
        return fichasm;
    }

    // Moure usuari

    public static boolean funciomoveusuari(char[][] taulell, String[] arraycoordenadesUsuari, char[] lletrajugador) {

        int cordenaday = Integer.parseInt(arraycoordenadesUsuari[0]);
        int cordenadax = Integer.parseInt(arraycoordenadesUsuari[1]);

        if (taulell[cordenaday - 1][cordenadax - 1] == '█') {
            return true;
        }
        return false;

    }

    // COmprovar per moure
    public static boolean comprovamoure(char[][] taulell, String coordenadesusuari, char[] lletrajugador) {
        String[] arrayusuari = coordenadesusuari.split("-");
        int cordenaday = Integer.parseInt(arrayusuari[0]);
        int cordenadax = Integer.parseInt(arrayusuari[1]);

        if (taulell[cordenaday][cordenadax] == '█') {
            return true;
        }
        return false;
    }

    // Mou la fitxa
    public static void moufitxa(char[][] taulell, String coordenadausuari, char[] lletrajugador) {

        String[] arrayusuari = coordenadausuari.split("-");
        int y = Integer.parseInt(arrayusuari[0]);
        int x = Integer.parseInt(arrayusuari[1]);

        taulell[y][x] = lletrajugador[0];

        mostrataulell(taulell);
    }

    // Eliminar la fitxa de la posicio anterior
    public static void eliminafitxa(char[][] taulell, String coord) {

        String[] arrayusuari = coord.split("-");
        int y = Integer.parseInt(arrayusuari[0]);
        int x = Integer.parseInt(arrayusuari[1]);

        taulell[y][x] = '█';

    }

}

