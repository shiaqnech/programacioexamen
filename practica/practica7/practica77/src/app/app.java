package app;

public class app {
    public static void main(String[] args) throws Exception {

        System.out.println("Introdueix un numero");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero>=0){
            if(numero%2==0){
                System.out.println("El numero "+numero+" es positiu parell ");
            }
            else{
                System.out.println("El numero "+numero+" es positiu cenar");
            }
            
            }
            else{
                if (numero%2==0){
                    System.out.println("El numero "+numero+" negatiu parell");
                }
                else{
                    System.out.println("El numero "+numero+" negatiu cenar-5");
                }
            
             }

    }
}