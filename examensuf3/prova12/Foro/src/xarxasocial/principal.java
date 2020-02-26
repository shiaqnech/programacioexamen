package xarxasocial;

import java.util.ArrayList;

import xarxasocial.funcions.Menu;
import xarxasocial.templates.*;

public class principal {
    
    public static void main(String[] args) {
        
        ArrayList<Usuaris> alu = new ArrayList<>();
        ArrayList<Posts> pst = new ArrayList<>();

        Admin adm = new Admin("Administrador");
        adm.demanarDades();
        alu.add(adm);    

        while(true){
            
            Menu.mostraMenu();
            int opcio = Integer.parseInt(System.console().readLine());

            switch(opcio){
                case 1:
                String usuari = System.console().readLine("Introdueix el teu username: ");
                String contrasenya = System.console().readLine("Introdueix el teu password: ");

                if (Menu.comprovarUsuari(alu, usuari, contrasenya)){
                    
                }
                    
                    break;
                case 2:

                Lector rlec = new Lector("Lector");
                rlec.demanarDades();
                rlec.calcularEdat();
                alu.add(rlec);
                
                    
                    break;
                case 3:
                    break;
            }

        }
    }
}