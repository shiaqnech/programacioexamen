package calculararea.templates;

public class Isosceles extends Triangle {

    public Isosceles(String mesura) {
		super(mesura);
    }
    
    @Override
    public void demanarDades() {
        super.base = Float.parseFloat(System.console().readLine("Introdueix la base: "));
        super.alçada = Float.parseFloat(System.console().readLine("Introdueix l'alçada: "));
    }

    @Override
    public void calcularArea() {
        super.area = (this.base*this.alçada)/2;   
    }

    @Override
    public void calcularPerimetre() {
        super.perimetre = (2*this.alçada)+this.base;        
    }

    @Override
    public String toString() {
        System.out.println("Figura: "+this.getClass().getSimpleName());
        System.out.println("Tipus de mesura: "+this.mesura);
        System.out.println("Alçada: "+ this.alçada+this.mesura);
        System.out.println("Base: "+ this.base+this.mesura);
        System.out.println("Area: " + this.area + this.mesura);
        System.out.println("Perimetre: " + this.perimetre + this.mesura);      
        return null;
    }



    

}