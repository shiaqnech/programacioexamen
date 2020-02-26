package shiaq.comprovausuari;
import java.util.Map;
import java.util.Map.Entry;

import shiaq.registre.Usuari;

/**
 * ComrpovaUsuari
 */
public class Comprova {

    public static boolean comprovar(Map<Integer, Usuari> registrats, String nomusuari) {

        for (Entry<Integer, Usuari> recorrer : registrats.entrySet()) {

            if (recorrer.getValue().getLogin().equals(nomusuari)){
                System.out.println("Aquest nom d'usuari ja existeix");
                return true;
            }
        }
		return false;
	}


    
}