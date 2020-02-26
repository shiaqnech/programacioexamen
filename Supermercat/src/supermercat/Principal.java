package supermercat;

import java.time.LocalDate;
import java.util.ArrayList;

import supermercat.templates.ProdAmbCaducitat;
import supermercat.templates.ProdSenseCaducitat;
import supermercat.templates.Producte;

/**
 * Principal
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Producte> alp = new ArrayList<>();

        alp.add(new Producte("Producte 1", 1f));
        alp.add(new ProdAmbCaducitat("Producte 2", 2f, LocalDate.of(2020, 2, 22)));
        alp.add(new ProdSenseCaducitat("Producte 2", 3f, "Moble"));

        float total = 0;

        for (Producte pr : alp) {
            total+=pr.calcular(10);            
        }

        System.out.println("El total es: "+total);


    }
}