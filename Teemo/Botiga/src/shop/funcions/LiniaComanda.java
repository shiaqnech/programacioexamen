package shop.funcions;

public class LiniaComanda{
    int idLinia, quanitat;
    RegistraProducte producte;
    Float LiniaPreu;

    public LiniaComanda(int idLinia) {
        this.idLinia = idLinia;
    }

    public int getQuanitat() {
        return quanitat;
    }

    public void setQuanitat(int quanitat) {
        this.quanitat = quanitat;
    }

    public RegistraProducte getProducte() {
        return producte;
    }

    public void setProducte(RegistraProducte producte) {
        this.producte = producte;
    }

    public Float getLiniaPreu() {
        return LiniaPreu;
    }

    public void setLiniaPreu(Float liniaPreu) {
        LiniaPreu = liniaPreu;
    }

    public int getIdLinia() {
        return idLinia;
    }

    public void setIdLinia(int idLinia) {
        this.idLinia = idLinia;
    }





    
}