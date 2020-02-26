package shop.funcions;

public class RegistraClient{

    private String nom, cognom, poblacio, direccio,  dni;
    private int telefon;

    public RegistraClient(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public void addNewTelefon(int telefon){
        
        this.telefon = telefon;
    
    }
    public void addNewDireccio(String direccio){
        
        this.direccio = direccio;
    
    }

    public void addNewPoblacio(String poblacio){
        
        this.poblacio= poblacio;
    
    }



    

}
