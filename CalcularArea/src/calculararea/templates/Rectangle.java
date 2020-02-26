package calculararea.templates;

public class Rectangle extends Figures{

    private float base, altura;

    public Rectangle(String mesura) {
        super(mesura);
    }

    public float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    

    @Override
    public void demanarDades() {
        this.setAltura(Float.parseFloat(System.console().readLine("Introdueix la altura del rectangle: ")));
        this.setBase(Float.parseFloat(System.console().readLine("Introdueix la llargada de la base: ")));

    }

    @Override
    public void calcularArea() {
        super.setArea(this.altura*this.base);
    }

    @Override
    public void calcularPerimetre() {
        super.setPerimetre((this.altura*2)+(this.base*2));
    }

    @Override
    public String toString() {
        System.out.println("Figura: " + this.getClass().getSimpleName());
        System.out.println("Unitat de mesura: "+this.mesura);
        System.out.println("Base: " + this.base+this.mesura);
        System.out.println("Alçada: " + this.altura+this.mesura);
        System.out.println("Area: "+ this.area+this.mesura);
        System.out.println("Perimetre: "+this.perimetre+this.mesura);
        return null;
    }



    
}