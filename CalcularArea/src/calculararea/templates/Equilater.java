package calculararea.templates;

/**
 * equilater
 */
public class Equilater extends Triangle{

    public Equilater(String mesura) {
        super(mesura);
    }
    @Override
    public void demanarDades() {
        super.base = Float.parseFloat(System.console().readLine("Introdueix la base: "));
        super.alçada = ((float) Math.pow(base*3,2) / 2) * this.base;
    }    
    @Override
    public void calcularArea() {
        super.area = (this.base*this.alçada)/2;  
    }

    @Override
    public void calcularPerimetre() {
        super.perimetre = 3*this.base;
    }

    @Override
    public String toString() {
        System.out.println("Figura: "+this.getClass().getSimpleName());
        System.out.println("Tipus de mesura: "+this.mesura);
        System.out.println("Base: "+ this.base+this.mesura);
        System.out.println("Alçada: "+ this.alçada+this.mesura);
        System.out.println("Area: "+this.area+this.mesura);
        System.out.println("Perimetre: "+this.base+this.mesura);
        return null;
    }



}