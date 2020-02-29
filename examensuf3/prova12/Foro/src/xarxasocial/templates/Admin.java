package xarxasocial.templates;

public class Admin extends Usuaris {

    public Admin(String rol) {
        super(rol);
    }

    @Override
    public void demanarDades() {
        super.usuari = System.console()
                .readLine("Introduiex el nom de usuari que es fara servir per l'Administrador: ");
        super.contrasenya = System.console().readLine("Introdueix el password: ");
    }

    @Override
    public void printarMenu() {

        System.out.println("************************************");
        System.out.println("* 1- Crear un post                 *");
        System.out.println("* 2- Llistar tots els post         *");
        System.out.println("* 3- Eliminar post                 *");
        System.out.println("* 4- Modificar in Lector a Editor  *");
        System.out.println("* 5- Llistar Editors               *");
        System.out.println("* 6- Llistar Lectors               *");
        System.out.println("* 0- Log out                       *");
        System.out.println("************************************");
    }

    @Override
    public boolean esMajor() {
        return false;
    }

}