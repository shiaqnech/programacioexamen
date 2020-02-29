package xarxasocial;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import xarxasocial.funcions.Funcions;
import xarxasocial.funcions.Menu;
import xarxasocial.templates.*;

public class principal {

    public static void main(String[] args) {
        Admin adm;
        boolean exit = false;
        boolean start = false;
        ArrayList<Usuaris> alu = new ArrayList<>();
        ArrayList<Posts> psts = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  -  HH:mm");
        String nomadmin = "null";



        while (!start) {
            adm = new Admin(Admin.class.getSimpleName());
            adm.demanarDades();
            boolean validar = false;

            while (!validar) {
                String contrasenya = System.console().readLine("Torna a introduir la contrasenya: ");
                if (contrasenya.equals(adm.getContrasenya())) {
                    nomadmin = adm.getUsuari();
                    alu.add(adm);                    
                    start = true;
                    validar = true;
                } else {
                    System.out.println("Contrasenya incorrecte torna a introduir-la.");
                }
            }

        }

        while (!exit) {

            Menu.mostraMenu();
            String opcio = System.console().readLine();

            switch (opcio) {
                case "1":
                    String login = System.console().readLine("Introdueix el teu username: ");
                    String contrasenya = System.console().readLine("Introdueix el teu password: ");

                    if (Funcions.comprovarUsuariLogin(alu, login, contrasenya)) {
                        int opciomenuusuari;
                        boolean sortirsessio = false;
                        Usuaris usr = Funcions.agafarUsuari(alu, login);
                        while (!sortirsessio) {
                            switch (usr.getRol()) {
                                case "Admin":
                                    usr.printarMenu();
                                    opciomenuusuari = Integer.parseInt(System.console().readLine());
                                    switch (opciomenuusuari) {
                                        case 1:

                                            Posts pst = new Posts(usr.getUsuari());
                                            System.out.println(pst.getAutor());
                                            pst.demanarPost();
                                            String major = System.console().readLine("El contingut és per majors de 18? (S/N): ");
                                            pst.setMajoredat(Funcions.postMajorEdat(major));
                                            psts.add(pst);

                                            break;
                                        case 2:
                                            Funcions.llistarPosts(usr, psts, formatter);
                                            break;
                                        case 3:
                                            Funcions.printarPostPerEliminar(psts, formatter);
                                            int eliminar = Integer.parseInt(System.console().readLine("Introdueix el numero del post el qual vols eliminar: ")) - 1;
                                            psts.remove(eliminar);
                                            System.out.println("Post eliminat...");
                                            Funcions.printarPostPerEliminar(psts, formatter);

                                            break;
                                        case 4:
                                            Funcions.printarTotsElsLectors(alu);
                                            String nomlector = System.console().readLine("Introdueix el userName del lector: ");

                                            if(Funcions.checkIfUsuariExists(nomlector, alu)){

                                                Usuaris lector = Funcions.agafarUsuari(alu, nomlector);
                                                Editor neweditor = new Editor(Editor.class.getSimpleName());
                                                neweditor.setUsuari(lector.getUsuari());;
                                                neweditor.setContrasenya(lector.getContrasenya());
                                                alu.remove(lector);
                                                alu.add(neweditor);                                                                                                                                               
                                            }                                    
                                                                                        
                                            break;
                                        case 5:
                                            Funcions.printarTotsElsEditors(alu);
                                            break;
                                        case 6:
                                            Funcions.printarTotsElsLectors(alu);
                                            break;
                                        case 0:
                                            sortirsessio = true;
                                            break;
                                    }
                                    break;
                                case "Editor":
                                    usr.printarMenu();
                                    opciomenuusuari = Integer.parseInt(System.console().readLine());

                                    switch (opciomenuusuari) {
                                        case 1:

                                        Posts pst = new Posts(usr.getUsuari());
                                        System.out.println(pst.getAutor());
                                        pst.demanarPost();
                                        String major = System.console().readLine("El contingut és per majors de 18? (S/N): ");
                                        pst.setMajoredat(Funcions.postMajorEdat(major));
                                        psts.add(pst);

                                            break;
                                        case 2:
                                        Funcions.printarTotsElsEditors(alu);
                                        Usuaris seguireditor =  new Editor(Editor.class.getSimpleName());
                                        String buscareditor = System.console().readLine("Introdueix el nom del editor que vols seguir");

                                        if(Funcions.checkIfUsuariExists(buscareditor, alu)) {
                                            seguireditor.setUsuari(buscareditor);
                                            usr.seguirEditor(seguireditor);
                                        }
                                            break;
                                        case 3:
                                        Funcions.printarSeguits(usr);
                                            break;
                                        case 4:
                                        Funcions.llistarPostsEditor(nomadmin, usr, psts, formatter);
                                            break;
                                        case 0:
                                            sortirsessio = true;
                                            break;
                                    }
                                    break;
                                case "Lector":
                                    usr.printarMenu();
                                    opciomenuusuari = Integer.parseInt(System.console().readLine());
                                    switch (opciomenuusuari) {
                                        case 1:
                                        Funcions.printarTotsElsEditors(alu);
                                        Usuaris seguireditor =  new Editor(Editor.class.getSimpleName());
                                        String buscareditor = System.console().readLine("Introdueix el nom del editor que vols seguir");

                                        if(Funcions.checkIfUsuariExists(buscareditor, alu)) {
                                            seguireditor.setUsuari(buscareditor);
                                            usr.seguirEditor(seguireditor);
                                        }
                                            break;
                                        case 2:
                                            Funcions.printarSeguits(usr);
                                            break;
                                        case 3:
                                        Funcions.llistarPostsLector(nomadmin, usr, psts, formatter);
                                            break;
                                        case 0:
                                            sortirsessio = true;
                                            break;
                                        default:
                                            System.out.println("Opció incorrecte");
                                            break;
                                    }
                                    break;
                            }
                        }

                    }
                    break;
                case "2":

                    Lector rlec = new Lector(Lector.class.getSimpleName());
                    rlec.demanarDades();
                    String naixament = System.console().readLine("Introdueix la teva data de naixament (dd/MM/yyyy): ");
                    LocalDate ld = Funcions.stringALocalDate(naixament);
                    rlec.setMajor(Funcions.comprovarSiEsMajor(ld));
                    ArrayList<Usuaris> array = new ArrayList<>();
                    rlec.setSeguits(array);  
                    alu.add(rlec);

                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Opcio no trobada");
                    break;
            }

        }
    }
}
