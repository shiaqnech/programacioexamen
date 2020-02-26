package calculararea.templates;

public class Escaleno extends Triangle {

    private float costat1, costat2;

    public float getCostat1() {
        return costat1;
    }

    public void setCostat1(float costat1) {
        this.costat1 = costat1;
    }

    public float getCostat2() {
        return costat2;
    }

    public void setCostat2(float costat2) {
        this.costat2 = costat2;
    }
    

    public Escaleno(String mesura) {
		super(mesura);
    }
    
    @Override
    public void demanarDades() {
        super.base = Float.parseFloat(System.console().readLine("Introdueix la base: "));
        this.costat1 = Float.parseFloat(System.console().readLine("Introdueix el costat 1: "));  
        this.costat2 = Float.parseFloat(System.console().readLine("Introdueix el costat 2: "));  
    }

    @Override
    public void calcularArea() {
        super.area = (this.base + this.costat1 + this.costat2) / 2;
    }

    @Override
    public void calcularPerimetre() {
        super.perimetre = this.base + this.costat1 + this.costat2;
    }

    @Override
    public String toString() {
        System.out.println("Figura: " + this.getClass().getSimpleName());
        System.out.println("Unitat de mesura: "+this.mesura);
        System.out.println("Base: " + this.base+this.mesura);
        System.out.println("Alçada: " + this.alçada+this.mesura);
        System.out.println("Area: "+ this.area+this.mesura);
        System.out.println("Perimetre: "+this.perimetre+this.mesura);
        return null;
    }





    
}