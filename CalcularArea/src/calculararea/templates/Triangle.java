package calculararea.templates;

/**
 * Triangle
 */
public abstract class Triangle extends Figures {

    protected float base, alçada;

    public Triangle(String mesura) {
        super(mesura);
    }  

    public float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public float getAlçada() {
        return alçada;
    }

    public void setAlçada(Float alçada) {
        this.alçada = alçada;
    }

    @Override
    public abstract void demanarDades();

    @Override
    public abstract void calcularArea();

    @Override
    public abstract void calcularPerimetre();

    @Override
    public abstract String toString();






    

}