import java.text.DecimalFormat;

import jdk.nashorn.internal.ir.Module.ImportEntry;

/**
 * PreuArticle
 */
public class PreuArticle {

    public static void main(String[] args) {

        String article ;
        System.out.println("Introdueix el nom de l'article");
        article = System.console().readLine();
        float preu;
        System.out.println("Introdueix el preu de l'article");
        preu = Float.parseFloat(System.console().readLine());
        float descompte;
        System.out.println("Introdueix el percentatge descompte que es vol aplicar");
        descompte = Float.parseFloat(System.console().readLine());
        float preufinal ;

        preufinal = preu-(preu*(descompte/100));


        DecimalFormat formateador = new DecimalFormat("#####.00");
        
       // preufinal = Float.parseFloat(String.format("%.2f", preufinal));

        System.out.println(formateador.format (+preufinal));
        


    }
    
}