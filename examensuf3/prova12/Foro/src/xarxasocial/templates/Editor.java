package xarxasocial.templates;

public class Editor extends Usuaris {

    public Editor(String rol) {
        super(rol);
    }

    @Override
    public void demanarDades() {
    }

    @Override
    public void printarMenu() {

            System.out.println("*************************************");
            System.out.println("* 1- Crear vun post                 *");
            System.out.println("* 2- Seguir a un Editor nou         *");
            System.out.println("* 3- Veure els editors que segueixo *");
            System.out.println("* 4- Mirar el teu mur               *");
            System.out.println("* 0- Log out                        *");
            System.out.println("*************************************");
           
    }

    @Override
    public boolean esMajor() {
        return false;
    }


    
}