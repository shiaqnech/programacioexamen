package app;

/**
 * practica10
 */
public class practica10 {

    public static void main(String[] args) {
        int arraynum[] = new int[50];
        int num;
        String sn;
        int i = 0;
        boolean bucle = true;
        int parell = 0;
        int imparell = 0;
        int negatiu = 0;
        int positiu = 0;
        int spositiu = 0;
        int snegatiu = 0;
        int qparell = 0;
        int qimparell = 0;
        

        do {

            System.out.println("Inserta un numero");
            num = Integer.parseInt(System.console().readLine());
            System.out.println("Vols introduir un altre numero SI (s) No (n)");
            sn = System.console().readLine();

            if (sn.equalsIgnoreCase("S")) {

                arraynum[i] = num;
                i++;
            }

            else {
                arraynum[i] = num;
                i++;

                bucle = false;
            }

        } while (bucle);

        // for (int l = 0; l < arraynum.length; l++)
        // System.out.println(arraynum[l]+" ");

        for (int a = 0; a < arraynum.length; a++) {

            if (arraynum[a] != 0) {
                
            

            if (arraynum[a] % 2 == 0) {

                parell = arraynum[a] + parell;

                qparell++;

            } else if (arraynum[a] % 2 == 1) {

                imparell = arraynum[a] + imparell;
                qimparell++;
            }

        }

        }
        for (int spn = 0; spn < arraynum.length; spn++) {

            if (arraynum[spn] > 0) {
                spositiu = arraynum[spn] + spositiu;
                positiu++;

            }

            else if (arraynum[spn] < 0) {
                snegatiu = arraynum[spn] + snegatiu;
                negatiu++;
            }

        }

        System.out.println("suma parells " + parell);
        System.out.println("suma imparell " + imparell);
        System.out.println("Quantiat de parells " + qparell);
        System.out.println("Quantiat de imparells " + qimparell);
        System.out.println("Suma parell + imparell " + (parell + imparell));
        System.out.println("Suma dels postius " + spositiu);
        System.out.println("Suma dels negatius " + snegatiu);
        System.out.println("Suma dels positius i negatius " + (spositiu + snegatiu));
        System.out.println("Quantitat de positius " + positiu);
        System.out.println("Quantitat de negatius " + negatiu);
        System.out.println("Mitja de tots el nimero "+(parell+imparell+spositiu+snegatiu)/(qparell+qimparell+positiu+negatiu));

    }

}
