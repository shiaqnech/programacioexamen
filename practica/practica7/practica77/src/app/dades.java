package app;

/**
 * dades
 */
public class dades {

    public static void main(String[] args) {
        
        String arraydades[] = new String [7];

        arraydades[0] = "Nom";
        arraydades[1] = "Cognom";
        arraydades[2] = "Adreça";
        arraydades[3] = "Població";
        arraydades[4] = "Data de Naixament";
        arraydades[5] = "Usuari";
        arraydades[6] = "Contrasenya";
        



        for (int i = 0; i < arraydades.length;i++){
            System.out.println(arraydades[i]);
        }
    }
}