package calculararea;
import javax.xml.namespace.QName;

import calculararea.funcions.Menu;
import calculararea.templates.*;

public class Principal {

    public static void main(String[] args) {
        int quanitat = Integer.parseInt(System.console().readLine("Introdueix la quanitat de figures que vols calcular: "));
        String mesura  = System.console().readLine("Introdueix la unitat de mesura que voldras fer servir: ");

        Figures[] arrayfigures = new Figures[quanitat];

        for(int i = 0; i < arrayfigures.length; i++){
            Menu.mostraMenu();
            int figura = Integer.parseInt(System.console().readLine("Introdueix la figura que vols calcular: "));

            switch(figura){

                case 1:
                Cercele cer = new Cercele(mesura);

                cer.demanarDades();
                cer.calcularArea();
                cer.calcularPerimetre();
                arrayfigures[i] = cer;

                    break;
                case 2:

                Rectangle rec = new Rectangle(mesura);
                rec.demanarDades();
                rec.calcularArea();
                rec.calcularPerimetre();
                arrayfigures[i] = rec;

                    break;
                case 3:                    
                    Menu.mostraTriangles();
                    int opcio = Integer.parseInt(System.console().readLine());
                    switch(opcio){
                        case 1:
                        Equilater eq = new Equilater(mesura);
                        eq.demanarDades();
                        eq.calcularArea();
                        eq.calcularPerimetre();
                        arrayfigures[i] = eq;
                            break;
                        case 2:
                        Isosceles is = new Isosceles(mesura);
                        is.demanarDades();
                        is.calcularArea();
                        is.calcularPerimetre();
                        arrayfigures[i] = is;                        
                            break;
                        case 3:
                        Escaleno es = new Escaleno(mesura);
                        es.demanarDades();
                        es.calcularArea();
                        es.calcularPerimetre();
                        arrayfigures[i] = es;
                            break;
                    }
                    
                    break;

            }   
        }

        Menu.printarCalculs(arrayfigures);
    }

}