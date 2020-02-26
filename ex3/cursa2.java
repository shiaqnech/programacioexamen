/**
 * cursa2
 */
public class cursa2 {

    public static void main(String[] args) {
        
        String categoria;
        System.out.println("Nom");
        String nom= System.console().readLine();
        System.out.println("Edat");
        int edat=Integer.parseInt(System.console().readLine());
        System.out.println("Sexe");
        String sexe=System.console().readLine();

        if (edat<16){
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Juvenil Masculi";
            }
            
            else if(sexe.equalsIgnoreCase("D")){
                categoria = "Juvenil Femeni";
            }

            else{
                categoria = "Error a la entrada de dades";
            }
        }
        else if(edat<66){
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Sènior Masculi";
            }

            else if(sexe.equalsIgnoreCase("D")){
                categoria = "Sènior Femeni";
            }
            else{
                categoria = "Error a la entrada de dades";
            }

        }
        else{
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Vetrà Masculi";
            }

            else if(sexe.equalsIgnoreCase("D")){
                categoria = "Veterà Femeni";
            }
            else{
                categoria = "Error a la entrada de dades";
            }

        }
       System.out.println("Benvingut: "+nom+"la teva categoria és "+categoria); 
    }
    }
    
