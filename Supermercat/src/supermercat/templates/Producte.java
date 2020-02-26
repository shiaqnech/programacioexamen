package supermercat.templates;

public class Producte{
    private String nom;
    private Float preu;

    public Producte(String nom, Float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getPreu() {
        return preu;
    }

    public void setPreu(Float preu) {
        this.preu = preu;
    }

    @Override
    public String toString(){
        return "Producte nom=" + nom +", preu="+preu;
    }

    public float calcular(int quantiat){
        float preuArticle = this.preu * quantiat;
        return preuArticle;
    }


}