package xarxasocial.templates;

import java.util.ArrayList;

public abstract class Usuaris {

    public String usuari, contrasenya, rol;
    public ArrayList<Usuaris> seguits;
    
    public Usuaris(String rol){
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

    public ArrayList<Usuaris> getSeguits() {
        return seguits;
    }

    public void setSeguits(ArrayList<Usuaris> seguits) {
        this.seguits = seguits;
    }

    public void seguirEditor(Usuaris seguireditor){
        this.seguits.add(seguireditor);        
    }

    public abstract void demanarDades();
    public abstract void printarMenu();
    public abstract boolean esMajor();


           
}