package app;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, ArrayList<Object>> pacients = new HashMap<>();

        boolean exit = false;

        while (!exit) {
            menu();
            int opcio = Integer.parseInt(System.console().readLine());
            switch (opcio) {
            case 1:
                Object nompacient = System.console().readLine("Introdueix el nom del pacient: ");
                String tsanitaria = System.console().readLine("Introdueix el numero de la targeta sanitaria: ");
                boolean surt = false;
                while (!surt) {
                    surt = true;
                    if (comprovartargeta(tsanitaria)) {
                        boolean torna = true;
                        while (torna) {
                            torna = false;

                            String datavisita = System.console()
                                    .readLine("Introdueix la data de la visita(dd-MM-yyyy): ");
                            String horavisita = System.console().readLine("Introdueix la hora de la visita(HH:mm): ");

                            if (data(datavisita) && hora(horavisita)) {
                                int[] data = splitdata(datavisita);
                                int[] hora = splithora(horavisita);
                                Object afegirdata = posardata(data, hora);
                                afegirdades(afegirdata, tsanitaria,nompacient,pacients );                            
                                
                            } else {
                                System.out.println("Torna a introduir les dades");
                                torna = true;
                            }

                        }

                    } else {
                        surt = true;
                    }
                }

             break;
            case 2:
            tsanitaria = System.console().readLine("Introdueix la targeta sanitaria del pacient");

                if (comprovapacient(pacients, tsanitaria)){
                    LocalTime ara = LocalTime.now();
                    LocalTime visita = LocalTime.of(((LocalDateTime)pacients.get(tsanitaria).get(1)).getHour(),((LocalDateTime)pacients.get(tsanitaria).get(1)).getMinute());
                    LocalTime temps = LocalTime.ofSecondOfDay(ara.toSecondOfDay()-visita.toSecondOfDay());
                    System.out.println(temps); 
                }


            
            
             break;
            case 3 :
                printarvisites(pacients);
             break;

            }
        }

    }

    public static void menu() {
        System.out.println("###################################");
        System.out.println("1 - Introduir pacient");
        System.out.println("2 - Fer visita");
        System.out.println("3 - Mostra Visites ");
        System.out.println("4 - Surt");
        System.out.println("###################################");
    }

    public static boolean comprovartargeta(String targeta) {
        if (targeta.matches("[A-Z]{4}[0-9]{9}")) {
            return true;
        }
        System.out.println("Has introduit els numeros de la targeta sanitaria malament");
        return false;
    }

    public static boolean data(String data) {
        if (data.matches("[0-3][0-9]\\/[0-1][0-9]\\/[0-9]{4}")) {
            return true;
        } else {
            System.out.println("\nHas introduit la data malament");
            return false;
        }
    }

    public static boolean hora(String hora) {
        if (hora.matches("[0-2][0-9]:[0-5][0-9]")) {
            return true;
        } else {
            System.out.println("Has introduit la hora malament");
            return false;
        }
    }

    public static int[] splitdata(String data) {
        String[] dataposar = data.split("/");
        int[] datareturn =  new int [3] ;

        for (int i = 0; i < dataposar.length; i++){
            datareturn[i] = Integer.parseInt(dataposar[i]);
        }
        return datareturn;


    }

    public static int[] splithora(String hora) {
        String[] horaposar = hora.split(":");
        int[] horareturn =  new int [2] ;
        
        for (int i = 0; i < horaposar.length; i++){
            horareturn[i] = Integer.parseInt(horaposar[i]);
        }

        return horareturn;
    }

    public static LocalDateTime posardata(int[] data, int[] hora ){
        LocalDateTime datahora = LocalDateTime.of(data[2], data[1], data[0], hora[0], hora[1]);    
        return datahora;   

    }

    public static void afegirdades(Object data, String sanitaria, Object nompacient, Map<String, ArrayList<Object>> pacients ){
        ArrayList<Object> afegirdades = new ArrayList<>();
        afegirdades.add(nompacient);
        afegirdades.add(data);

        pacients.put(sanitaria, afegirdades);    
    }

    public static void printarvisites( Map<String, ArrayList<Object>> pacients){
        
        pacients.forEach((k, v) -> {
            System.out.println(" Targeta sanitaria: " + k + " | Nom del pacient: " + v.get(0)+" |  Data de la visita: "+((LocalDateTime)v.get(1)).getDayOfMonth()+"/"+((LocalDateTime)v.get(1)).getMonthValue()+"/"+((LocalDateTime)v.get(1)).getYear()+" "+((LocalDateTime)v.get(1)).getHour()+":"+((LocalDateTime)v.get(1)).getMinute());
        });
    }

    public static boolean comprovapacient (Map<String, ArrayList<Object>> pacients, String targeta){
        if (pacients.containsKey(targeta)){
            return true;
        }
        else{
            System.out.println("No s'ha trobat la targeta sanitaria");
            return false;
        }
    }


}
