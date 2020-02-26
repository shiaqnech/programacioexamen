/**
 * Questionari
 */
public class Questionari {

    public static void main(String[] args) {

        String pregunta1;
        String pregunta2;
        String pregunta3;
        String pregunta4;
        int punts = 0;

        System.out.println("Les pomes només son de color vermell?");
        pregunta1 = System.console().readLine();
        if (pregunta1.equalsIgnoreCase("NO")) {
            System.out.println("La pregunta 1 ha estat correcte ");
            punts++;
            System.out.println("Els macarrons son carbohidrats?");
            pregunta2 = System.console().readLine();

            if (pregunta2.equalsIgnoreCase("SI")) {
                System.out.println("La pregunta 2 ha estat correcte");
                punts++;
                System.out.println("En faker es calvo?");
                pregunta3=System.console().readLine();

                if (pregunta3.equalsIgnoreCase("SI")) {
                    System.out.println("La pregunta ha estat correcte");
                    punts++;
                    System.out.println("Els caballs son vegetals");
                    pregunta4=System.console().readLine();

                    if (pregunta4.equalsIgnoreCase("NO")) {
                        System.out.println("La pregunta ha estat correcte");
                        punts++;
                    }

                }

            }
            System.out.println("El teu resultat es de " + punts);

        }

        else {
            System.out.println("Has fallat la primera pregunta i tens "+punts);
        }        

        

    }
}


