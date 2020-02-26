package xarxasocial.templates;

/**
 * Admin
 */

    
    public class Admin extends Usuaris{

        public Admin(String rol) {
            super(rol);
        }      

        @Override
        public void demanarDades() {
            super.usuari = System.console().readLine("Introduiex el nom de usuari: ");
            super.contrasenya = System.console().readLine("Introdueix el password: ");
        }

        @Override
        public void printarDades() {

        }

        @Override
        public void majorEdat() {

        }




    
        

}