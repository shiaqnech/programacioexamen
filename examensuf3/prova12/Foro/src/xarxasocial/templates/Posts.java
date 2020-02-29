package xarxasocial.templates;

import java.time.LocalDateTime;

public class Posts {
    
    private LocalDateTime ldt;
    private String titol;
    private String autor;
    private String contingut;
    private boolean majoredat;
    
    public Posts(String autor) {
        this.autor = autor;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public String getContingut() {
        return contingut;
    }


    public boolean isMajoredat() {
        return majoredat;
    }

    public void setMajoredat(boolean majoredat) {
        this.majoredat = majoredat;
    }

    public void demanarPost(){
        this.titol = (System.console().readLine("Introdueix el titol: "));
        this.contingut = (System.console().readLine("Introdueix el contingut: "));;
        this.ldt = LocalDateTime.now();
    }




   



}