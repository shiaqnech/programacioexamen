/**
 * practica
 */
public class practica {

    public static void main(String[] args) {
        
        int arraytaula[] = new int[11];
        System.out.println("Introdueix un numero");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println("Aquesta es la tula del"+numero);

        for (int i=0; i < arraytaula.length; i++ ){
            
            arraytaula[i]= numero*i;

            System.out.println(numero+"x"+i+"="+arraytaula[i]);
        }
        
    }
}