package app;

import java.util.Random;

/**
 * practica13
 */
public class practica13 {

    public static void main(String[] args) {
        Random r = new Random();
        int[][] arrayBI= new int[2][10];
        int[] arrayUni=new int [10];

        for (int i=0;i<arrayBI.length;i++){
          for (int j=0;j<arrayBI[0].length;j++){
              arrayBI[i][j]=r.nextInt(10);
                         

          }


        }
        for (int j=0;j<arrayUni.length;j++){

            int resultat= arrayBI[0][j]+ arrayBI[1][j];

            arrayUni[j]=resultat;
        }

     System.out.println();

     }


    
}
