package app;

/**
 * practica11
 */
public class practica11 {

    public static void main(String[] args) {

        System.out.println("Quants numeros vols introduir");
        int qnums = 0;
        qnums = Integer.parseInt(System.console().readLine());
        int arraynums[] = new int[qnums];
        String nump;
        int nump2;
        
        

        for (int i = 0; i < arraynums.length; i++) {
            System.out.println("Introdueix un numero ");
            nump = System.console().readLine();

            if (nump.equals("x")) {
                break;

            }

            nump2 = Integer.parseInt(nump);

            arraynums[i] = nump2;

        }

        System.out.println("Aquest son el numero que has introduit");

        for (int l = 0; l < arraynums.length; l++)
            System.out.println(arraynums[l] + " ");

        System.out.println("Introdueix el numero del qual vols saber la posició");
        int num = Integer.parseInt(System.console().readLine());

        for (int k = 0; k < arraynums.length; k++) {

            

            if (arraynums[k] == num){

                System.out.println("la posició del numero és "+k);
                
            break;

            }                                 

        }
        
    }
}