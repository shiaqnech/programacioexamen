package ex8;

/**
 * trio8
 */
public class trio8 {

    

    public static void main(String[] args) {
        Random r = new Random();
        int numPremiat = r.nextInt(1000);
        int arrayNums[] = new int[1000];
        boolean trobat = false;
        int intents = 0;
        int repetit = 0;

        while (!trobat) {
            int numAleatori = r.nextInt(1000);
            boolean coincidencia = false;
            for (int i = 0; i < arrayNums.length; i++) {
                if (numAleatori == arrayNums[i]) {
                    coincidencia = true;

                }                

            }

            if (coincidencia == false) {
                arrayNums[intents] = numAleatori;
                intents++;
                if (numAleatori == numPremiat) {
                    trobat = true;
                }

            } else {
               repetit++;
            }
                        

        }
        System.out.println("Premi el numero premiat és " + numPremiat);
        System.out.println("El numero de intets que has fet servir es de " + intents);
        System.out.println("El numero s'ha repetit "+repetit+" vegades");

    }
}