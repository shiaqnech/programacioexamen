package calculararea.funcions;

import calculararea.templates.Figures;

/**
 * Menu
 */
public class Menu {

    public static void mostraMenu(){
        System.out.println("################·MENU·#############");
        System.out.println("###################################");
        System.out.println("#                                 #");
        System.out.println("#           1. Cercle             #");
        System.out.println("#           2. Rectangle          #");
        System.out.println("#           3. Triangle           #");
        System.out.println("#                                 #");
        System.out.println("###################################");
    }

    
	public static void printarCalculs(Figures[] arrayfigures) {

        for (Figures i : arrayfigures) {
            System.out.println("##################");
            i.toString();            
        }
	}


	public static void mostraTriangles() {

        System.out.println("#############·Triangles·###########");
        System.out.println("###################################");
        System.out.println("#                                 #");
        System.out.println("#           1. Equilater          #");
        System.out.println("#           2. Isosceles          #");
        System.out.println("#           3. Escaleno           #");
        System.out.println("#                                 #");
        System.out.println("###################################");
        
	}
}