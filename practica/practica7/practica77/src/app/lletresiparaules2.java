package app;

import java.util.Random;

/**
 * lletresiparaules
 */
public class lletresiparaules2 {

    public static void main(String[] args) {

        String vocals = "AEIOU";
        String consonants = "BCDFGHJKLMNPQRSTVXYZÇ";
        System.out.println("Introdueix el numero de jugadors que jugaran");
        int jugadors = Integer.parseInt(System.console().readLine());
        System.out.println("Introduiu el numero de rondes que voleu jugar");
        int rondes = Integer.parseInt(System.console().readLine());
        String arraynomjugadors[] = new String[jugadors];    
     
        String arrayrondes[][] = new String [jugadors][rondes];
        
        char arraylletres[] = new char[9];

        boolean repetit;

        Random r = new Random();

        int comptadorv = 0;

        for (int i = 0; i < arraylletres.length; i++) {
            arraylletres[i] = ' ';
        }
        System.out.println("Aquest es el vostres tulell");

        for (int i = 0; i < arraylletres.length; i++) {
            repetit = false;
            while (!repetit) {
                int numeror = r.nextInt(9);
                if (arraylletres[numeror] == ' ' && comptadorv < 4) {
                    arraylletres[numeror] = vocals.charAt(r.nextInt(5));
                    repetit = true;
                    comptadorv++;
                }
                else {
                    if (arraylletres[numeror] == ' ') {
                        arraylletres[numeror] = consonants.charAt(r.nextInt(21));
                        repetit = true;

                    }
                }
            }
        }
        mostraArrayChar(arraylletres);
        
        System.out.println("Introdueix una paraula");

        String paraula;
        hola:        

        for (int j = 0; j < arrayrondes[0].length; j++){
            for (int i = 0; i < arrayrondes.length; i++){
                System.out.println("Jugador "+arraynomjugadors[i]+" Introdueix una paraula");
                paraula = System.console().readLine();                
                for (int l = 0; l < paraula.length(); l++){
                    char lletra = paraula.charAt(l);
                    for (int y = 0; y < paraula.length();y++){
                        if (lletra != arraylletres[y]){
                        System.out.println("Has introduit una lletra que no es troba a la taula");
                        break hola;
                        }                
                    }
                }
            }

        }


        

       

    }

    public static void mostraArrayChar(char[] arraychar) {
        System.out.println();

        for (int i = 0; i < arraychar.length; i++) {
            
            System.out.print(arraychar[i]+"\t");
            
        }
        System.out.println("\t");
    }
}