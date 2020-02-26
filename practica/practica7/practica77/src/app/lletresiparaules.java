package app;
import java.util.Random;

/**
 * lletresiparaules
 */
public class lletresiparaules {

    public static void main(String[] args) {

        String vocals = "aeiou";
        String consonants = "bcdfghjklmnpqrstvxyzç";
        
        char arraylletres[] = new char[9];
        String posicions ="cv";
        boolean repetit ;

        Random r = new Random(); 


        int comptadorv =0;
        int comptadorc =0;               

        for (int i = 0; i < arraylletres.length;i++){

            repetit = false;

            while (!repetit){
                char opcio = posicions.charAt(r.nextInt(2));
                if (opcio == 'v' && comptadorv < 4){
                    arraylletres[i] = vocals.charAt(r.nextInt(5));
                    comptadorv++;
                    repetit = true;
                }

                if (opcio == 'c' && comptadorc < 5){
                    arraylletres[i] = consonants.charAt(r.nextInt(21));
                    comptadorc++;
                    repetit = true;
                }
            }      

        }

        mostraArrayChar(arraylletres);
      
    }
            

    public static void mostraArrayChar(char[] arraychar) {

        for (int i = 0; i < arraychar.length; i++){

            System.out.println(arraychar[i]);
        }             
    }
}