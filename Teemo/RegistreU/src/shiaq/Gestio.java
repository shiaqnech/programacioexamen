package shiaq;
import java.util.HashMap;
import java.util.Map;

import shiaq.comprovausuari.Comprova;
import shiaq.menu.Menu;
import shiaq.registre.Usuari;;

public class Gestio{

    public static void main(String[] args) {

        Map <Integer, Usuari> registrats = new HashMap<>();
        int id = 1;        
        Menu.Menu();
        int opcio = Integer.parseInt(System.console().readLine("Introdueix la opció que vols escollir"));
        
        switch(opcio){
            case 1:
            String nomusuari;
             do{
                nomusuari = System.console().readLine("Introdueix el teu nom d'usuari");

             }while(Comprova.comprovar(registrats, nomusuari));

             Usuari user;

                        

             break;
            
            case 2:
             break;
            case 3:
             break;
        }
    
    }

}