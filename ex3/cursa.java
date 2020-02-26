/**
 * cursa
 */
public class cursa {
    
   public static void main(String[] args) {
          

        String Nom; 
        int edat;
        String sexe; 

       System.out.println("Introdueix el teu nom");
       Nom  = System.console().readLine();
       System.out.println("Introdueix la teva edat");
       edat = Integer.parseInt(System.console().readLine());
       System.out.println("Introdueix el teu sexe");
       sexe = System.console().readLine();

       if ((sexe.equals("m")) && edat<=16){
           System.out.println("Sortida:"+Nom+ ", la teva categoria és: Juvenil Masculi");
       }
           else if ((sexe.equals("f")) && edat<=16){
           System.out.println("Sortida:" +Nom+ ", la teva categoria és: Juvenil Femeni");
           }
       else if ((sexe.equals("m")) && edat<=65){
            System.out.println("Sortida:"+Nom+ ", la teva categoria és: Sènior masculí");
       }
           else if ((sexe.equals("f")) && edat<=65){
           System.out.println("Sortida:"+Nom+ ", la teva categoria és: Sènior femeni");
           }
       else if ((sexe.equals("m")) && edat>65){
           System.out.println("Sortida:"+Nom+ ", la teva categoria és: Veterà Masculi");
       }
           else if  ((sexe.equals("f")) && edat>65){
           System.out.println("Sortida:"+Nom+ ", la teva categoria és: Veterà Femeni"); 
           }
       


        

    
        
    }


    
}

    
