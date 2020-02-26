package app;

import java.util.Random;


public class bingorohit {
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

        // introduir zeros
        int arraynor[] = new int[9];
        int contador0 = 0;
        int contador1 = 0;
        int contador2 = 0;
        int iterador = 0;
        int random = 0;

        while (iterador < 9) {
            random = r.nextInt(3);
            if (random == 0 && contador0 < 3) {
                contador0++;
                arraynor[iterador] = random;
                iterador++;
            }
            if (random == 1 && contador1 < 3) {
                contador1++;
                arraynor[iterador] = random;
                iterador++;
            }
            if (random == 2 && contador2 < 3) {
                contador2++;
                arraynor[iterador] = random;
                iterador++;
            }
        }
        for (int i = 0; i < arraynor.length; i++) {
            array[arraynor[i]][i] = 0;
        }
        String arrayy[][] = new String[3][9];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                arrayy[i][j] = String.valueOf(array[i][j]);
            }
        }
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (arrayy[i][j].equals("0")) {
                    arrayy[i][j] = "x";
                }
            }
        }
        boolean bolatreta;
        int arraynumeros[] = new int[1000];
        for (int xd = 0; xd < arraynumeros.length; xd++) {
            int bola = r.nextInt(89)+1;
            bolatreta = false;
            if (!bolatreta) {
                for (int j = 0; j < arraynumeros.length;j++) {
                    if (arraynumeros[j] == bola) {
                        bolatreta = true;
                    }
                }
                if (!bolatreta) {
                    arraynumeros[xd] = bola;
                    for (int j = 0; j < array[0].length; j++) {
                        for (int i = 0; i < array.length; i++) {
                            String bolaString = String.valueOf(arraynumeros[xd]);
                            if (arrayy[i][j].equals(bolaString)) {
                                arrayy[i][j] = "x";
                                bolatreta = true;
                                System.out.println("El numero " + arraynumeros[xd] + " ha sigut taxat");
                                System.console().readLine();

                                mostraArray(arrayy);
                                System.out.println();
                                
                            }
                            // for(int dota=0; dota<arrayy.length;dota++){
                            //     int sumafila=0;
                            //     for(int lol=0; lol<arrayy[0].length;lol++){
                            //         if(arrayy[dota][lol].equals("x")){
                            //             sumafila++;
                            //             if(sumafila==9){
                            //                 System.out.println("Has completat la fila " + dota + " Bingo ");
                            //                 break;
                            //             }
                            //         }
  
                            //     }
                            // }
                        }
                    }
                    if (!bolatreta)
                        System.out.println("El numero " + arraynumeros[xd] + " no esta en el bingo");
                }
            }
            // if{
            // System.out.print();
            // }

        }
        mostraArray(arrayy);
        System.out.println();
    }

    public static void mostraArray(String[][] arrayNums) {
        for (int i = 0; i < arrayNums.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayNums[0].length; j++) {
                System.out.print(arrayNums[i][j] + "\t");
            }
        }
    }
}