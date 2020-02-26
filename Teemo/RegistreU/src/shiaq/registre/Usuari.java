
package shiaq.registre;

public class Usuari{

    private String login, contrasenya, correu;
    private int edat;
    private char sexe;   
    
    
    private Usuari(String loginUsuari, String contrasenyaUsuari, String correuUsuari, int edatUsuari, char sexeUsuari) {
        
        this.login = loginUsuari;
        this.contrasenya = contrasenyaUsuari;
        this.correu = correuUsuari;
        this.edat = edatUsuari;
        this.sexe = sexeUsuari;

    }

    private Usuari(String loginUsuari, String contrasenyaUsuari, String correuUsuari, int edatUsuari) {
        
        this.login = loginUsuari;
        this.contrasenya = contrasenyaUsuari;
        this.correu = correuUsuari;
        this.edat = edatUsuari;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    




}