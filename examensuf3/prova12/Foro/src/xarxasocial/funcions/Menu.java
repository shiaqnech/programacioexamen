package xarxasocial.funcions;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import xarxasocial.templates.Usuaris;

public class Menu {

	public static void benvinguda() {
        System.out.println("*********************************");
        System.out.println("* Benvingut a CirvSocialNetwork *");
        System.out.println("*********************************");
	}

	public static void mostraMenu() {

        System.out.println("**************************************");
        System.out.println("* 1 - Login                          *");
        System.out.println("* 2 - Registre com a Lector          *");
        System.out.println("* 3 - Sorti                          *");
        System.out.println("**************************************");
	}

	public static boolean comprovarEdat(Period periode) {
        
        if(periode.getYears() >= 18){
            return true;
        }
		return false;
	}

	public static boolean comprovarUsuari(ArrayList<Usuaris> alu, String usuari, String contrasenya) {

        for (Usuaris i : alu) {
            if (i.getUsuari().equals(usuari)){
                if (i.getContrasenya().equals(contrasenya)){
                    System.out.println("Usuari Autenticat amb exit");
                    System.out.println("El rol assignat al teu usuari és: "+i.getRol());
                    return true;
                }
                else{
                    System.out.println("Contrasenya incorrecte");
                    return false;
                }

            }                        
        }
        System.out.println("Nom d'usuari incorrecte");
		return false;
	}




    
}