package xarxasocial.templates;

public class Posts {
    
    private String titol;
    private String contingut;
    private boolean majoredat;

    public Posts(String titol) {
        this.titol = titol;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getContingut() {
        return contingut;
    }

    public void setContingut(String contingut) {
        this.contingut = contingut;
    }

    public boolean isMajoredat() {
        return majoredat;
    }

    public void setMajoredat(boolean majoredat) {
        this.majoredat = majoredat;
    }

    



    

}