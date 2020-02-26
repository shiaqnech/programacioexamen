package app;

import java.util.Random;

/**
 * bingofinal
 */
public class bingofinal {

    public static void main(String[] args) {

        Random r = new Random();
        int arraybingo[][] = new int[3][9];
        boolean ok;
        int numr = 0;

        for (int j = 0; j < arraybingo[0].length; j++) {
            for (int i = 0; i < arraybingo.length; i++) {
                ok = false;
                while (!ok) {
                    ok = true;
                    numr = r.nextInt(10) + 10 * j;

                    for (int y = 0; y < arraybingo.length; y++) {
                        if (numr == arraybingo[y][j]) {
                            ok = false;
                        }
                    }

                }
                arraybingo[i][j] = numr;
            }
        }

        int guardar = 0;

        for (int x = 0; x < 2; x++) {
            for (int j = 0; j < arraybingo[0].length; j++) {
                for (int i = 0; i < arraybingo.length - 1; i++) {

                    guardar = arraybingo[i][j];

                    if (arraybingo[i + 1][j] < arraybingo[i][j]) {
                        arraybingo[i][j] = arraybingo[i + 1][j];
                        arraybingo[i + 1][j] = guardar;
                    }
                }
            }

        }

        int arraynou[] = new int[9];
        int numr2 = 0;
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        boolean nou = false;

        for (int i = 0; i < arraynou.length; i++) {
            nou = false;
            while (!nou) {
                numr2 = r.nextInt(3);
                if (numr2 == 0 && num0 < 3) {
                    arraynou[i] = numr2;
                    num0++;
                    nou = true;
                }
                if (numr2 == 1 && num1 < 3) {
                    arraynou[i] = numr2;
                    num1++;
                    nou = true;
                }
                if (numr2 == 2 && num2 < 3) {
                    arraynou[i] = numr2;
                    num2++;
                    nou = true;
                }
            }
        }

        // for (int i = 0; i < arraynou.length; i++){
        // System.out.println(arraynou[i]);
        // }

        for (int j = 0; j < arraybingo[0].length; j++) {
            for (int i = 0; i < arraybingo.length; i++) {

                arraybingo[arraynou[j]][j] = 0;
            }
        }

        mostraArrayString(arraytoString(arraybingo));
    }

    public static void mostraArrayString(String[][] arraybiingo) {
        for (int i = 0; i < arraybiingo.length; i++) {
            System.out.println();
            for (int j = 0; j < arraybiingo[0].length; j++) {
                System.out.print(arraybiingo[i][j] + "\t");
            }
        }
    }

    public static String[][] arraytoString(int[][] arrayint) {

        String arraybingostring[][] = new String[3][9];

        for (int j = 0; j < arraybingostring[0].length; j++) {
            for (int i = 0; i < arraybingostring.length; i++) {

                arraybingostring[i][j] = Integer.toString(arrayint[i][j]);

                if (arrayint[i][j] == 0) {
                    arraybingostring[i][j] = "x";
                }

            }
        }
        return (arraybingostring);

    }
}
