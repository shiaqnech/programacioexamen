import java.util.Random;

/**
 * practica3
 */
public class practica3 {

    public static void main(String[] args) {
        
       Random randomnum = new Random();
        System.out.println("Introdueix un numero");
        int num = Integer.parseInt(System.console().readLine());
        int maquina = randomnum.nextInt(6);
        int intents = 1;
        

        while (num!=maquina){
            
            System.out.println("Introdueix un numero");
            num = Integer.parseInt(System.console().readLine());
            intents++;
            
        }

        System.out.println("Has encertat el numero aleatori, aquesta era el "+maquina+" has fet "+intents+" intents");
    } 
}