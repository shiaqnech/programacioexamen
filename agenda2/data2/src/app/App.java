package app;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        boolean exit = false;
        int opcio = 0;
       
        ArrayList<LocalDateTime> date = new ArrayList<>();
        ArrayList<String> recordatori = new ArrayList<>();

        int posicio;

        while (!exit){
                  
            opcio = menu(opcio);

            switch(opcio){
                case 1:

                 String data  = System.console().readLine("Introdueix la data amb el següent format (yyyy-MM-dd HH:mm)");
                 if (checkdate(data)){
                     LocalDateTime dataformated =  formatardata(data);
                     String nota = System.console().readLine("Escriu el recodatori: ");
                     posicio = takeposition(dataformated, date);
                     afegiragenda(date, recordatori, dataformated, nota, posicio ); 
                  }
                 else{
                     System.out.println("Has introduit la data malament");
                  }
                 break;

                case 2:
                 String elimina = System.console().readLine("Introdueix la data que vols eliminar amb el següent format (yyyy-MM-dd HH:mm)");
                 LocalDateTime dataeelimina = formatardata(elimina);
                 eliminar(date, recordatori, dataeelimina);


                  
                 break;

                case 3:
                 mostraagenda(date, recordatori);

                 break;

                case 4:
                 exit = true;                
                 break;

                default:
                 break;
            }

        }
    }

    public static int menu(int opcio){

    opcio =Integer.parseInt(System.console().readLine("1-Afegir recordatori\n2-Eliminar recordatori\n3-Mostra recordatori\n4-Surt\nOpcio: "));
    return opcio;     
    }

    public static boolean checkdate (String date){


        if(date.matches("[0-9]{4}-[0-1][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]")){
            return true;
        }

        return false;

    }

    public static LocalDateTime  formatardata(String data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime formateddate = LocalDateTime.parse(data, formatter);

        return formateddate;
                 
    }

    public static void afegiragenda (ArrayList<LocalDateTime> date, ArrayList<String> recordatori, LocalDateTime data, String nota, int posicio){

        date.add( posicio, data);
        recordatori.add( posicio, nota); 
        
    }
    public static void eliminar (ArrayList<LocalDateTime> date,ArrayList<String> recordatori, LocalDateTime data ){
        
       for (int i = 0; i < date.size(); i++ ){
            if (date.get(i).equals(data)){
              date.remove(i);
              recordatori.remove(i);
            }
        }         

    }
 
    public static int takeposition (LocalDateTime data, ArrayList<LocalDateTime> Date){
        int posicio = 0;
        
        for (LocalDateTime x : Date){
            if (data.isAfter(x)){
                posicio = Date.indexOf(x)+1;
            }

        }
        return posicio;
    }   
    
    public static void mostraagenda (ArrayList<LocalDateTime> date,ArrayList<String> recordatori ){

        for (int i = 0; i < date.size(); i++){
               System.out.println(date.get(i)+" --> "+recordatori.get(i));
        }
    }
}