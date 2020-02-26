package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        boolean exit = false;

        ArrayList <ArrayList<String>> llista1 = new ArrayList<ArrayList<String>>();
        ArrayList <String> cantant = new ArrayList<>();
        ArrayList <String> titol = new ArrayList<>();
        
        ArrayList <ArrayList<Integer>> llista2 = new ArrayList<ArrayList<Integer>>();
        ArrayList <Integer> id = new ArrayList<>();
        ArrayList <Integer> vots = new ArrayList<>();

        while (!exit){
            menu();
            int opcio= Integer.parseInt(System.console().readLine());

            switch(opcio){
                case 0:
                 exit = true;                
                 break;
                case 1:
                String artista = System.console().readLine("Introdueix el nom del cantant:");
                cantant.add(artista);
                String canço = System.console().readLine("Introdueix el nom de la canço:");
                titol.add(canço);
                llista1.add(cantant);
                llista1.add(titol);
                id.add(llista1.get(0).size());
                vots.add(0);
                llista2.add(id);
                llista2.add(vots);

                

                 break;
                case 2:
                int ncanço = votarcanço(llista1, llista2);

                sumarvots(llista2, ncanço);               
                 

                 break;                 
                case 3:
                eliminarfila(llista1, llista2);
                
                 break;
                case 4:

                pirntallista(llista1, llista2);

                 break; 

                default:
                    System.out.println("------------------------------------------------------");
                    System.out.println("No s'ha trobat cap opció relacionada amb aquest numero");
                 break;
            }

        }



    }
    public static void menu(){

        System.out.println("###############################·MENU·###############################");
        System.out.print("# Opcio 0 - Sortir \n# Opcio 1 - Introduir un artista i el nom de la canço \n# Opcio 2 - Vota una canço \n# Opcio 3 - Elimina un posició \n# Opcio 4 - Printa la llista \n# Introdueix el numero d'alguna opcio: ");
    }

    public static int votarcanço(ArrayList <ArrayList<String>> llista1, ArrayList <ArrayList<Integer>> llista2){
        pirntallista(llista1, llista2);
        int canço = Integer.parseInt(System.console().readLine("Introdueix la canço: "));
        return canço;
    } 

    
    public static void sumarvots(ArrayList <ArrayList<Integer>> llista2, int numero){
        // for (int i = 0; i < llista2.get(0).size();i++){
        //     if (llista2.get(0).get(i)==numero){
        //         llista2.get(1).set (i,(llista2.get(1).get(i))+1);           
                
        //     }
        // }

        int pos = llista2.get(0).indexOf(numero);

        if (llista2.get(0).get(pos)==numero){
            llista2.get(1).set (pos,(llista2.get(1).get(pos))+1);           
            
        }
        else{
            System.out.println("No s'ha trobat la posició");
        }
    }

    public static void pirntallista(ArrayList <ArrayList<String>> llista1, ArrayList <ArrayList<Integer>> llista2){

        System.out.println("#####################·LLISTA·#####################\n");
        for (int i = 0; i<llista1.get(0).size();i++){
            System.out.println("Id: "+llista2.get(0).get(i)+" - Cantant: "+llista1.get(0).get(i)+" - Títol canço: "+llista1.get(1).get(i)+" - Vots: "+llista2.get(1).get(i)+"\n");
        }
        System.out.println();    

    }

    public static void eliminarfila(ArrayList <ArrayList<String>> llista1, ArrayList <ArrayList<Integer>> llista2){

        int numero = Integer.parseInt(System.console().readLine("Introdueix la ID de la canço que vols eliminar"));
        int pos = llista2.get(0).indexOf(numero);

        for (int i = 0; i < 2; i++){
            llista1.get(i).remove(pos);
            llista2.get(i).remove(pos);
        }


    } 

    public static void endreçarllista(ArrayList <ArrayList<String>> llista1, ArrayList <ArrayList<Integer>> llista2){
        
    }
}