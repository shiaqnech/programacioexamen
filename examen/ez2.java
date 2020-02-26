/**
 * ez2
 */
public class ez2 {

    public static void main(String[] args) {
        System.out.println("Usuari1: Intro el teu nom");
        String nom1=System.out.println();
        System.out.println("Introdueix la edat");
        int edat1=System.console().readLine();
        System.out.println("Usuari1: Intro el teu nom");
        String nom2=System.out.println();
        System.out.println("Introdueix la edat");
        int edat2=System.console().readLine();
        int diferenecia = 0;
        diferenecia=(edat1-edat2);

        if (edat1==edat2){
            System.out.println("Els dos tnen la mateixa edat");

        
        if (diferenecia<0){
            System.out.println(nom2+"es mes gran amb una diferencia de "+(edat2-edat1)+"anys");

        }
        else if(diferenecia<0){
            System.out.println(nom1+"es mes gran amb una diferencia de "+(edat1-edat2)+"anys");

        }
        else{

        }
    }

    }
}