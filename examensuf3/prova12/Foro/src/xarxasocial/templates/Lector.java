package xarxasocial.templates;
/**
 * Lector
 */
public class Lector extends Usuaris {

    public boolean major;
       
    public Lector(String rol) {
        super(rol);
    }
    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    @Override
    public void demanarDades() {
        super.usuari = System.console().readLine("Introdueix un nom d'usuari unic (jo no comprovaré si ja hi és): ");
        super.contrasenya = System.console().readLine("Introdueix una contrasenya: ");   
    }

    @Override
    public void printarMenu() {

        System.out.println("*************************************");
        System.out.println("* 1- Seguir a un Editor nou         *");
        System.out.println("* 2- Veure els editors que segueixo *");
        System.out.println("* 3- Mirar el teu mur               *");
        System.out.println("* 0- Log out                        *");
        System.out.println("*************************************");

    }

    @Override
    public boolean esMajor() {
        
        return major;

    }

    



    
    
}