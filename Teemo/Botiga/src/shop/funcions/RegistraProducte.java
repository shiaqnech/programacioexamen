package shop.funcions;

public class RegistraProducte{
    private String descripcio, referencia;
    private Float preu;

    public RegistraProducte(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Float getPreu() {
        return preu;
    }

    public void setPreu(Float preu) {
        this.preu = preu;
    }



    

    

}