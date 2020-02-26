/**
 * practica7
 */
public class Practica7 {

    public static void main(String[] args) {
        System.out.println("Introdueix un numero");        
        int num = Integer.parseInt(System.console().readLine());
        int cenar = 0;
        int parell = 0;
        


        for (int i =0;i<=(num);i++){
            if (i%2==0){
                parell=parell+i;
            }
            else{
                cenar=cenar+i;
            }
        }
        System.out.println(parell);
        System.out.println(cenar);
        
    }
}