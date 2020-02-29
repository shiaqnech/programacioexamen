package xarxasocial.funcions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import xarxasocial.templates.Admin;
import xarxasocial.templates.Editor;
import xarxasocial.templates.Lector;
import xarxasocial.templates.Posts;
import xarxasocial.templates.Usuaris;

/**
 * Funcions
 */
public class Funcions {

    public static Usuaris agafarUsuari(ArrayList<Usuaris> alu, String usuari) {

        for (Usuaris i : alu) {
            if (i.getUsuari().equals(usuari)) {
                return i;
            }
        }
        return null;
    }

    public static boolean comprovarSiEsMajor(LocalDate ld) {
        LocalDate ldnow = LocalDate.now();
        Period period = Period.between(ld, ldnow);
        System.out.println("Anys: " + period.getYears());

        if (period.getYears() >= 18) {
            return true;
        }

        return false;
    }

    public static boolean comprovarUsuariLogin(ArrayList<Usuaris> alu, String usuari, String contrasenya) {

        for (Usuaris i : alu) {
            if (i.getUsuari().equals(usuari)) {
                if (i.getContrasenya().equals(contrasenya)) {
                    System.out.println("Usuari Autenticat amb exit");
                    System.out.println("El rol assignat al teu usuari és: " + i.getRol());
                    return true;
                } else {
                    System.out.println("Contrasenya incorrecte");
                    return false;
                }

            }
        }
        System.out.println("Nom d'usuari incorrecte");
        return false;
    }

    public static LocalDate stringALocalDate(String naixament) {

        String[] ldstring = naixament.split("/");
        int[] ldint = new int[3];

        for (int i = 0; i < ldint.length; i++) {
            ldint[i] = Integer.parseInt(ldstring[i]);
        }

        LocalDate ld = LocalDate.of(ldint[2], ldint[1], ldint[0]);

        return ld;
    }

    public static boolean postMajorEdat(String major) {

        if (major.equalsIgnoreCase("s")) {
            return true;
        }
        return false;
    }

    public static void printarPostPerEliminar(ArrayList<Posts> psts, DateTimeFormatter formatter) {

        for (Posts i : psts) {
            System.out.println((psts.indexOf(i) + 1) + " - Data: " + i.getLdt().format(formatter) + " - Autor: "
                    + i.getAutor() + " - Títol: " + i.getTitol());
        }
    }

    public static void printarTotsElsEditors(ArrayList<Usuaris> alu) {

        System.out.println("##########################");
        System.out.println("#         EDITORS        #");
        System.out.println("##########################");

        for (Usuaris i : alu) {

            if (i.getRol().equalsIgnoreCase(Editor.class.getSimpleName())) {
                System.out.println(i.getUsuari());
            }

        }
    }

    public static void printarTotsElsLectors(ArrayList<Usuaris> alu) {

        System.out.println("##########################");
        System.out.println("#         LECTORS        #");
        System.out.println("##########################");

        for (Usuaris i : alu) {

            if (i.getRol().equalsIgnoreCase(Lector.class.getSimpleName())) {
                System.out.println(i.getUsuari());
            }

        }

    }

    public static boolean checkIfUsuariExists(String nomlector, ArrayList<Usuaris> alu) {

        for (Usuaris i : alu) {

            if (nomlector.equalsIgnoreCase(i.getUsuari())) {
                return true;
            }

        }
        System.out.println("L'usuari no s'ha trobats. ");
        return false;
    }

    public static Usuaris agafarAdministrador(ArrayList<Usuaris> alu) {

        for (Usuaris i : alu) {
            if (i.getRol().equals(Admin.class.getSimpleName())) {
                return i;
            }
        }
        return null;
    }

    public static void llistarPosts(Usuaris usr, ArrayList<Posts> psts, DateTimeFormatter formatter) {

        if (usr.getRol().equalsIgnoreCase("Admin")) {
            for (Posts i : psts) {

                System.out.println("########################");

                System.out.println("Data: " + i.getLdt().format(formatter));
                System.out.println("Autor: " + i.getAutor());
                System.out.println("+18 ?" + i.isMajoredat());
                System.out.println("Títol: " + i.getTitol());
                System.out.println("Contingut: " + i.getContingut());
            }

        }

    }

    public static void llistarPostsEditor(String nomadmin, Usuaris usr, ArrayList<Posts> psts, DateTimeFormatter formatter) {

        for (Posts i : psts) {

            for (Usuaris x : usr.getSeguits()) {

                if (i.getAutor().equals(x.getUsuari()) || i.getAutor().equals(nomadmin)) {

                    System.out.println("########################");

                    System.out.println("Data: " + i.getLdt().format(formatter));
                    System.out.println("Autor: " + i.getAutor());
                    System.out.println("+18 ?" + i.isMajoredat());
                    System.out.println("Títol: " + i.getTitol());
                    System.out.println("Contingut: " + i.getContingut());

                }

            }

        }
    }

    public static void llistarPostsLector(String nomadmin, Usuaris usr, ArrayList<Posts> psts, DateTimeFormatter formatter) {

        if (usr.esMajor()) {
                        
            for (Posts i : psts) {



                if(i.getAutor().equals(nomadmin)){

                    System.out.println("########################");

                    System.out.println("Data: " + i.getLdt().format(formatter));
                    System.out.println("Autor: " + i.getAutor());
                    System.out.println("+18 ?" + i.isMajoredat());
                    System.out.println("Títol: " + i.getTitol());
                    System.out.println("Contingut: " + i.getContingut());   
                }
                
                for (Usuaris x : usr.getSeguits()) {
                    
                    if (i.getAutor().equals(x.getUsuari())){
                        
                        System.out.println("########################");

                        System.out.println("Data: " + i.getLdt().format(formatter));
                        System.out.println("Autor: " + i.getAutor());
                        System.out.println("+18 ?" + i.isMajoredat());
                        System.out.println("Títol: " + i.getTitol());
                        System.out.println("Contingut: " + i.getContingut());             
                    }
                }
            }

        } else {

            for (Posts i : psts) {

                if(i.getAutor().equals(nomadmin) && !i.isMajoredat()){
                    System.out.println("Data: " + i.getLdt().format(formatter));
                    System.out.println("Autor: " + i.getAutor());
                    System.out.println("+18 ?" + i.isMajoredat());
                    System.out.println("Títol: " + i.getTitol());
                    System.out.println("Contingut: " + i.getContingut());
                }

                for (Usuaris x : usr.getSeguits()) {

                        if ( i.getAutor().equals(x.getUsuari()) && !i.isMajoredat())  {

                        System.out.println("Data: " + i.getLdt().format(formatter));
                        System.out.println("Autor: " + i.getAutor());
                        System.out.println("+18 ?" + i.isMajoredat());
                        System.out.println("Títol: " + i.getTitol());
                        System.out.println("Contingut: " + i.getContingut());

                    }
                }
            }

        }

    }

	public static Usuaris getEditorPerAfegir(String buscareditor, ArrayList<Usuaris> alu) {

        for (Usuaris i : alu) {
            if(i.getUsuari().equals(buscareditor)){
                return i;
            }            
        }
		return null;
	}

	public static void printarSeguits(Usuaris usr) {

        for (Usuaris i: usr.getSeguits()) {
            System.out.println("#######Seguits#######");
            System.out.println();
            System.out.println("    "+i.getUsuari()   );
        }
	}
}