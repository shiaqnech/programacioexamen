package app;

import java.util.Random;

public class bingo {
    public static void main(String[] args) {
        int array[][] = new int[3][9];
        Random r = new Random();
        boolean mateix = true;
        int numero = 0;
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                mateix = true;
                while (mateix) {
                    numero = r.nextInt(10) + 10 * j;
                    int p = 0; // vegades amb la comprobació correcte
                    for (int y = 0; y < array.length; y++) {
                        if (numero != array[y][j]) {
                            p++;
                        }
                    }
                    if (p == 3) {
                        mateix = false;
                    }

                }
                array[i][j] = numero;
            }
        }

        for (int o = 0; o < 2; o++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] > array[i + 1][j]) {
                        int guardar = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = guardar;
                    }
                }
            }
        }

        // introduir 9 numeros 
        int arraynew[] = new int[9];
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        boolean aleatori = false;
        int random = 0;

        for (int i = 0; i < arraynew.length; i++) {

            random = r.nextInt(3);
            aleatori = false;

            while (!aleatori) {
                random = r.nextInt(3);

                if (random == 0 && num0 < 3) {
                    num0++;
                    arraynew[i] = random;
                    aleatori = true;
                }
                if (random == 1 && num1 < 3) {
                    num1++;
                    arraynew[i] = random;
                    aleatori = true;

                }
                if (random == 2 && num2 < 3) {
                    num2++;
                    arraynew[i] = random;
                    aleatori = true;

                }

            }
        }

        // for (int i = 0; i < arraynew.length; i++) {
        // System.out.println(arraynew[i]);
        // }

        for (int i = 0; i < arraynew.length; i++) {

            array[arraynew[i]][i] = 0;

        }

        String[][] array2 = new String[3][9];

        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {

                array2[i][j] = String.valueOf(array[i][j]);

            }

        }

        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {

                if (array2[i][j].equals("0")) {
                    array2[i][j] = "x";
                }
            }
        }

        int arraybola[] = new int[10];
        int bola = 0;
        boolean guardar = true;
        boolean sortir = false;
        int posicio = 0;

        for (int a = 0; a < arraybola.length; a++) {
            guardar = true;
            sortir = false;

            while (!sortir) {
                bola = r.nextInt(9)+1;
                guardar = true;

                for (int k = 0; k < arraybola.length; k++) {
                    if (bola == arraybola[k]) {
                        guardar = false;
                        break;

                    }

                }
                if (guardar) {
                    arraybola[posicio] = bola;
                    posicio++;
                    
                }
                sortir = true;

            }

        }

        for (int i = 0; i < arraybola.length; i++) {
            System.out.print(arraybola[i] + "\t");
        }
        System.out.println();
        System.out.println();

        mostraArray(array2);
    }

    public static void mostraArray(String[][] arrayNums) {
        for (int i = 0; i < arrayNums.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayNums[0].length; j++) {
                System.out.print(arrayNums[i][j] + " \t");
            }
        }
    }
}