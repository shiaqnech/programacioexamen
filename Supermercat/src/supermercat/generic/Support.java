package supermercat.generic;

import java.time.LocalDate;
import java.time.Period;

/**
 * Support
 */
public class Support {

    public static int  calculaDies(LocalDate ld){
        Period p = Period.between(LocalDate.now(), ld);
        int dies = p.getDays();
        System.out.println("Dies perquè caduqi: "+dies);
        return p.getDays();
    }
}