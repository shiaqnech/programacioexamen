import java.util.Random;

/**
 * trio1
 */
public class trio1 {

    public static void main(String[] args) {

        
        int numero1 = (int)(Math.random()*(999+100));
        int numAleateori = 0;
        int intents = 0;
        
        while (numAleateori!=numero1){

            numAleateori = (int)(Math.random()*(999+100));
            intents++;

        }

        System.out.println("Correcte, els intents han estat "+intents);
        System.out.println("E");

        


           
        


        
        

        
    }
}