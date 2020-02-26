package xarxasocial.templates;

public abstract class Usuaris {

    protected String usuari, contrasenya, rol;

    public Usuaris(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }   

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public abstract void demanarDades();
    public abstract void printarDades();
    public abstract void majorEdat();






       
    
        
}