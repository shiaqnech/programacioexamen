/**
 * trio2
 */
public class trio2 {

    public static void main(String[] args) {
        int num1 = (int)(Math.random()*999+100);
        int num2 = 0;
        int intents = 0;

        while (num1!=num2) {
        num2 = (int)(Math.random()*999+100);
        intents++;
        }

        System.out.println("EL numero premiat "+num1);
        System.out.println("El numero d'intents que has fet per encertar han sigut de "+intents);

        

    }
    
}