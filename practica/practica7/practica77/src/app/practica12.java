package app;

/**
 * practica12
 */
public class practica12 {

    public static void main(String[] args) {
        
        String arraynom[] = new String[999];
        String arraycognom[] = new String[999];
        String arraydni[] = new String[999];
        String arraysalari[] = new String[999];
        
        


        for (int i = 0; i<= 999; i++){


        
        System.out.println("Introdueix el teu nom si el saps");
        arraynom[i] = System.console().readLine();

        System.out.println("Introdueix el teu cognom si el saps");
        arraycognom[i] = System.console().readLine();

        System.out.println("Introdueix el teu dni si el saps");
        arraydni[i] = System.console().readLine();

        System.out.println("Introdueix el teu salari si el saps");
        arraysalari[i] = System.console().readLine();

        System.out.println("Vols introduir dades de un altra persona? Si no vols introduir dades de un alatre persona prem la lletra (N) si no prem enter");
        String sn = System.console().readLine();

        if (sn.equalsIgnoreCase("N")){
            break;
        
        }       
        
        }

        System.out.println("De quina persona vols consultar les dades ");
        String consulta = System.console().readLine();


        for (int u = 0; u < arraynom.length;u++){

            if (arraynom[u]==consulta){

            System.out.println("Les dades de la persona "+arraynom[u]+""+arraycognom[u]+"són, DNI"+arraydni[u]+"i el seu salari és de "+arraysalari[u]);

            break;
            }


        }
        
    }
}