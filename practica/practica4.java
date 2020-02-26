import java.util.Random;

/**
 * practica4
 */
public class practica4 {

    public static void main(String[] args) {

        Random randomnum = new Random();
        System.out.println("Introdueix un numero");
        int num = Integer.parseInt(System.console().readLine());
        int maquina = randomnum.nextInt(6);
        int intents = 1;
        boolean trobat = false; 
        

        while (trobat==false){
            
            System.out.println("Introdueix un numero");
            num = Integer.parseInt(System.console().readLine());
            intents++;

            if(num == maquina){
                trobat = true;
            }
            
            
        }

        System.out.println("Has encertat el numero aleatori, aquesta era el "+maquina+" has fet "+intents+" intents");
        
    }
}