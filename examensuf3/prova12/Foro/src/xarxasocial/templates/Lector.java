package xarxasocial.templates;

import java.time.LocalDate;
import java.time.Period;

import xarxasocial.funcions.Menu;

/**
 * Lector
 */
public class Lector extends Usuaris {

    protected boolean major;
    protected int edat;
    protected LocalDate naixament;
       
    public Lector(String rol) {
        super(rol);
    }    

    @Override
    public void demanarDades() {
        super.usuari = System.console().readLine("Introdueix un nom d'usuari unic (jo no comprovaré si ja hi és): ");
        super.contrasenya = System.console().readLine("Introdueix una contrasenya: ");
        String data = System.console().readLine("Introdueix la data de naixament(yyyy/MM/dd): ");        
        LocalDate naixament = LocalDate.parse(data);
   
    }

    @Override
    public void printarDades() {

    }

    @Override
    public void majorEdat() {
        
    }

    public void calcularEdat(){
        LocalDate ld = LocalDate.now();
        Period periode = Period.between(this.naixament, ld);

        if (periode.getYears() >= 18){
            this.major = true;
        }
        else{
            this.major = false;
        }
    }

    
    
}