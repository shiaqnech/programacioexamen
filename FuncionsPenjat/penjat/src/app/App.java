package app;

import java.util.Random;
import java.util.Scanner;
public class App {

    static final int numParaules = 3;
    static final int numLletresAbecedari = 26;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String arrayParaules[] = new String[numParaules];
        mostraBenvinguda();
        System.out.println("Introdueix la mida de les paraules: ");
        int mida = sc.nextInt();
        sc.nextLine();
        char arrayPanell[] = new char[mida];
        inicialitzaArrayPanell(arrayPanell); // L'inicialitza amb '_'
        char arrayLletresDites[] = new char[numLletresAbecedari];
        for (int i = 0; i < arrayParaules.length; i++) {
            boolean ok = false;
            while (!ok) {
                ok = true;
                System.out.println("Escriu una paraula número " + (i + 1));
                String paraula = sc.next();
                if (comprovaMidaParaula(paraula, mida)) {
                    arrayParaules[i] = paraula;

                } else {
                    System.out.println("Mida incorrecta. Has d'escriure paraules de " + mida + " caracters.");
                    ok = false;
                }
            }
        }

        String paraulaSecreta = triaParaulaSecretaRandom(arrayParaules);
        char arrayParaulaSecreta[] = deStringACharArray(paraulaSecreta); // Passa un String a array de chars

        int posicio = 0;
        int errors = 0;
        boolean estasPenjat = false;
        boolean hasTriunfat = false;
        while (!estasPenjat && !hasTriunfat) {
            mostraPanell(arrayPanell);
            char lletra;
            String valorEntrat;
            do {
                System.out.println("Introdueix una lletra");
                valorEntrat = sc.next();
                lletra = valorEntrat.charAt(0);

            } while (!(comprovaSiEsLletra(lletra) && comprovaSiNomesEsUnaSolaLletra(valorEntrat)
                    && comprovaSiJaHaDitLaLletra(lletra, arrayLletresDites)));

            afegeixLletraAArrayDeLletresDites(lletra, arrayLletresDites, posicio);
            posicio++;
            errors = actualitzaPanellAmbLletra(lletra, arrayParaulaSecreta, errors, arrayPanell);
            printaPenjat(errors);

            if (comprovaSiHasPalmat(errors)) {
                estasPenjat = true;
                sc.close();
            }

            // if (comprovaSiHasGuanyat(arrayPanell)) {
            //     hasTriunfat = true;
            //     sc.close();
            // }

        }

        if (hasTriunfat) {
            System.out.println("Felicitats! Has descobert la paraula amb " + errors + " errors.");
        } else {
            System.out.println("Collons.. No era tan difícil.. La paraula era: " + paraulaSecreta);
            System.out.println("Has palmat!");
        }
    
    }

    public static void mostraBenvinguda(){
        System.out.println("Benvingut al joc dels penjats");
    }

    public static void inicialitzaArrayPanell(char[] arrayPanell){
        for(int i = 0; i < arrayPanell.length; i++){
            arrayPanell[i] = '-';
        }
        System.out.println();
    }

    public static boolean comprovaMidaParaula(String paraula, int mida){
        if (paraula.length()==mida){
            return true;
        }
        return false;
        
    }

    public static String triaParaulaSecretaRandom (String[] arrayparaules){

        Random r = new Random();

        String paraula = arrayparaules[r.nextInt(arrayparaules.length)];

        System.out.println("La paraula secreta es "+paraula);       
    

        return paraula;        

    }

    public static char[] deStringACharArray (String paraulasecreta){

        char[] arrayparaulasecreta = paraulasecreta.toCharArray();

        return arrayparaulasecreta;

    }

    public static void mostraPanell (char[] arrayPanell){
        for (int i = 0; i < arrayPanell.length; i++ ){
            System.out.print(arrayPanell[i]+" ");
        }
        System.out.println();
    
    }

    public static boolean comprovaSiEsLletra (char lletra){

        if (Character.isLetter(lletra)){
            return true;
        }
        return false;

    }

    public static boolean comprovaSiNomesEsUnaSolaLletra (String valorentrat){

        if (valorentrat.length()==1){
            return true;            
        }
        return false;

    }

    public static boolean comprovaSiJaHaDitLaLletra (char lletra, char[] arrayLletresDites){

        for (int i = 0; i < arrayLletresDites.length; i++){
            if (arrayLletresDites[i]==lletra){

                System.out.println("Aquesta lletra ja esta dita");
                return true;
                
            }
            
        }        
        return false;

    }

    public static void afegeixLletraAArrayDeLletresDites (char lletra, char[] arrayLletresDites, int posicio){
        
        arrayLletresDites[posicio] = lletra;
    }

    public static int actualitzaPanellAmbLletra (char lletra ,char[] arrayParaulaSecreta ,int errors ,char[] arrayPanell){
;       boolean entrar = false;
        int error= errors;

        for (int i = 0; i < arrayParaulaSecreta.length;i++){                
            
            if (arrayParaulaSecreta[i] == lletra){

                lletra = arrayParaulaSecreta[i];
                System.out.println("La lletra si es troba a la paraula");
                entrar = true;
            }            
            
        }

        if  (!entrar){
            System.out.println("La lletra no es troba a la paraula");
            error++;            

        }

        return error;



    }

    public static void printaPenjat (int errros){

    }

    public static boolean comprovaSiHasPalmat (int errors){

        if (errors==5){
            return true;            
        }
        return false;

    }

    public static void  comprovaSiHasGuanyat (char[] arrayPanell){

    }

    


}