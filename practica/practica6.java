/**
 * practica6
 */
public class practica6 {

    public static void main(String[] args) {

        System.out.println("Introdueix un numero");        
        int num = Integer.parseInt(System.console().readLine());
        int cenar = 0;
        int parell = 0;
        


        for (int i =0;i<(num);i++){
            if (i%2==0){
                parell=parell+i;
            }
            else {
                cenar++;
            }
        }
        System.out.println(parell);
        System.out.println(cenar);


    }
}