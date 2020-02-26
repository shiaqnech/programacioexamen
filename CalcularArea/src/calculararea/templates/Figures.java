package calculararea.templates;

public abstract class Figures  {
    protected double area, perimetre;
    protected String mesura;
    

    public Figures(String mesura) {
        this.mesura = mesura;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double d) {
        this.area = d;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(double d) {
        this.perimetre = d;
    }

    public String getMesura() {
        return mesura;
    }

    public void setMesura(String mesura) {
        this.mesura = mesura;
    }



    public abstract void demanarDades();
    public abstract void calcularArea();
    public abstract void calcularPerimetre();
    public static void nomClase(){
        
    }    
    
    @Override
    public abstract String toString();


}