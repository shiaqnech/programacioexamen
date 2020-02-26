package shop.funcions;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Comanda{

    private LocalDateTime ldt;
    private ArrayList<LiniaComanda> producte;
    private RegistraClient client;
    private int idcomanda; 
    private float preutotal;
    

    public Comanda(int idcomanda) {
        this.idcomanda = idcomanda;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public ArrayList<LiniaComanda> getProducte() {
        return producte;
    }

    public void setProducte(ArrayList<LiniaComanda> producte) {
        this.producte = producte;
    }

    public RegistraClient getClient() {
        return client;
    }

    public void setClient(RegistraClient client) {
        this.client = client;
    }

    public int getIdcomanda() {
        return idcomanda;
    }

    public void setIdcomanda(int idcomanda) {
        this.idcomanda = idcomanda;
    }



    public float getPreutotal() {
        return preutotal;
    }

    public void setPreutotal(float preutotal) {
        this.preutotal = preutotal;
    }
    
    public void showLiniaComanda(){

        for (LiniaComanda i : this.producte) {
            System.out.println("Producte: "+i.getProducte().getDescripcio()+" - Quantitat: "+i.getQuanitat()+" - Preu unitat: "+i.getProducte().getPreu() + " - Preu total: "+i.getLiniaPreu()); 
                      
        }
        System.out.println("Preu total: "+this.preutotal+" IVA: "+(this.preutotal*0.21));

    }

    
    

}