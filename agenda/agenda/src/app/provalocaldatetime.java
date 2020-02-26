package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;

/**
 * provalocaldatetime
 */
public class provalocaldatetime {

    public static void main(String[] args) {
         ArrayList<LocalDateTime> horadia = new ArrayList<>();

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

         String ihora = System.console().readLine("2015-02-20 06:30");

         LocalDateTime posar = LocalDateTime.parse(ihora, formatter);





         horadia.add(posar);

         


         System.out.println(horadia.get(0));
    }
}