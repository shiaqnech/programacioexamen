/**
 * Calculdetemps
 */
public class Calculdetemps {

    public static void main(String[] args) {

        long start;
        long finish;
        String frase;

        start = System.currentTimeMillis();
        frase = System.console().readLine();
        finish = System.currentTimeMillis();

        if (frase.equals("Setze jutges d'un jutjat mengen fetge en un penjat")) {
            System.out.println("Correcte");
            float res;
            res = finish - start;
            float res2;
            res2 = res / 1000;
            System.out.println("Has tardat " + res2);

        }

        else {
            System.out.println("Has escrit la frase malament");
        }

    }

}