/**
 * practica5
 */
public class practica5 {

    public static void main(String[] args) {

        System.out.println("Entra un numero per calcular el factorial");
        int num = Integer.parseInt(System.console().readLine());
        int res = 1;
        
        for (int i = num; i > 0; i--){
            res = res*i;
            //System.out.println();
        }
        System.out.println(res);
    }
}