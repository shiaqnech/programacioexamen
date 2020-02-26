/**
 * ez5
 */
import java.util.Random;
public class ez5 {

    public static void main(String[] args) {
                   
        
        Random num = new Random();
        int puntsPC = 0;
        int puntsUser = 0;
        //String arrayOpcions[] = new String []{"p","n"};

        while (puntsUser < 3 && puntsPC < 3) {        
        System.out.println("Pares (p) o nones (n)");
        String opcioUser = System.console().readLine();
        System.out.println("Dits ??");
        int ditsUsers = Integer.parseInt(System.console().readLine());
        //String opcioPC = arrayOpcions[r.nextInt(2)];
        int ditsPC = num.nextInt(11);
        


        if (((ditsUsers+ditsPC)%2)==0){
            if (opcioUser.equals("p")){
                puntsUser++;
            }
            else{
                puntsPC++;
            }

        }
        else {
            if (opcioUser.equals("n")){
                puntsUser++;
            }
            else{
                puntsPC++;
            }

        

        }
        System.out.println("Puntuacio");
        System.out.println("Punts màquina "+puntsPC);
        System.out.println("Punts usuari "+puntsUser);


    }
    if(puntsUser==3){
        System.out.println("Has guanyat");
    }
}
}

