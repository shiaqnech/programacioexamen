package calculararea.templates;


/**
 * Cercele
 */
public class Cercele extends Figures {

    private float  radi;
    private final float pi = 3.14f;

    public Cercele(String mesura) {
        super(mesura);
    }

    public float getRadi() {
        return radi;
    }

    public void setRadi(Float radi) {
        this.radi = radi;
    }

    @Override
    public void demanarDades() {
        this.setRadi(Float.parseFloat(System.console().readLine("Introdueix el radi del cercle: ")));
    } 

    @Override
    public void calcularArea() {
        super.setArea(this.pi*Math.pow(this.radi,2));
    }

    @Override
    public void calcularPerimetre() {
        super.setPerimetre(2*this.pi*radi);
    }

    @Override
    public String toString() {

        System.out.println("Figura: "+this.getClass().getSimpleName());
        System.out.println("Tipus de mesura: "+this.mesura);
        System.out.println("Radi: "+ this.radi);
        System.out.println("Pi: "+ this.pi);
        System.out.println("Area: " + this.area + this.mesura);
        System.out.println("Perimetre: " + this.perimetre + this.mesura);      
        return null;
    }



    

    


}