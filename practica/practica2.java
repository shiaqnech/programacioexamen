/**
 * practica2
 */
public class practica2 {

    public static void main(String[] args) {
        
        int arraytaula[] = new int[11];
        System.out.println("Entra un numero");
        int num = Integer.parseInt(System.console().readLine());
        int i = 0;
        System.out.println("La tuala del "+num+" és");

        while (i<arraytaula.length){
            
            arraytaula[i] = num*i;

            System.out.println(num+"x"+i+"="+arraytaula[i]);
            i++;

            
        }
    }
}