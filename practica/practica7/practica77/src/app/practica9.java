package app;

/**
 * practica9
 */
public class practica9 {

    public static void main(String[] args) {

        int arraynum[] = new int[5]; 
        int suma = 0;
        
        

        for (int i=0; i<arraynum.length;i++){
            

            System.out.println("Introdueix un numero");
            int numero = Integer.parseInt(System.console().readLine());

            arraynum[i]=numero;
            
            suma = numero + suma;

            
        }
        System.out.println("Aquest es l'ordre dels numero al reves");
        for (int e=4; e>=0;e--){
            System.out.println(+arraynum[e]);

            
        }

        System.out.println("Aquesta es la suma de tots el valors introduits"+suma);
    }
}