package supermercat.templates;

import java.time.LocalDate;

import supermercat.generic.Support;

/**
 * ProdAmbCaducitat
 */
public class ProdAmbCaducitat extends Producte {

    private LocalDate  dataCaducitat;

    public ProdAmbCaducitat(String nom, Float preu, LocalDate dataCaducitat) {
        super(nom, preu);
        this.dataCaducitat = dataCaducitat;
    }

    public LocalDate getDataCaducitat() {
        return dataCaducitat;
    }

    public void setDataCaducitat(LocalDate dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public String toString(){
        return super.toString()+ " Data caducitat: "+this.dataCaducitat;
    }
    @Override
    public float calcular (int quantiat){
        float preuFinal = super.calcular(quantiat);
        int diesDeCaducitat = Support.calculaDies(this.dataCaducitat);
        switch(diesDeCaducitat){
            case 1:
                preuFinal -= (preuFinal*0.75f);
                System.out.println("Descompte 75%");
                break;
            case 2:
                preuFinal -= (preuFinal*0.5f);
                System.out.println("Descompte 50%");
                break;
            case 3:
                preuFinal -= (preuFinal*0.25f);
                System.out.println("Descompte 25%");
                break;
            case 4:
                preuFinal -= (preuFinal*0.1f);
                System.out.println("Descompte 10%");
                break;
        }
        System.out.println("Preu article:"+preuFinal);
        return preuFinal;
    }

}