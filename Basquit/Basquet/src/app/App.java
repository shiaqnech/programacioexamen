package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.print.event.PrintJobAdapter;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, ArrayList<Object>> equipl = new HashMap<Integer, ArrayList<Object>>();
        Map<Integer, ArrayList<Object>> equipv = new HashMap<Integer, ArrayList<Object>>();

        boolean exit = false;

        String local = System.console().readLine("Introdueix el nom de l'equip local: ");
        String visitant = System.console().readLine("Introdueix el nom de l'equip visitant: ");

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                mostranomeq(local);
                int dorsal = Integer.parseInt(System.console().readLine("\nIntrodueix el dorsal del jugador: "));
                Object nomjugador = System.console().readLine("\nIntrodueix el nom del jugador: ");
                registrajugador(dorsal, nomjugador, equipl);
            } else {
                mostranomeq(visitant);
                int dorsal = Integer.parseInt(System.console().readLine("\nIntrodueix el dorsal del jugador: "));
                Object nomjugador = System.console().readLine("\nIntrodueix el nom del jugador: ");
                registrajugador(dorsal, nomjugador, equipv);

            }

        }

        while (!exit) {
            menu();
            int opcio = Integer.parseInt(System.console().readLine("Introdueix el numero d'opcio que has triat: "));
            switch (opcio) {
            case 1:
                String nomeq = System.console().readLine("Introdueix el nom de l'equip que ha fet la cistella: ");
                if (comprovaeq(nomeq, local)) {
                    boolean surt = false;
                    while (!surt) {
                    printajugadorseq(equipl, local);
                    int dorsal = Integer.parseInt(
                            System.console().readLine("Introdueix el dorsal del jugador al qual vols sumar punts: "));

                    
                        if (comprovadorsal(dorsal, equipl)) {
                            String puntuacio = System.console()
                                    .readLine("Introdueix la quanitat: triple(3p), normal(2p), falta(1p): ");
                            sumarpunts(equipl, dorsal, puntuacio);
                            surt = true;
                        }
                    }

                } else if (comprovaeq(nomeq, visitant)) {

                    boolean surt = false;
                    while (!surt) {
                    printajugadorseq(equipl, visitant);
                    int dorsal = Integer.parseInt(
                            System.console().readLine("Introdueix el dorsal del jugador al qual vols sumar punts: "));

                   
                        if (comprovadorsal(dorsal, equipv)) {
                            String puntuacio = System.console()
                                    .readLine("Introdueix la quanitat: triple(3p), normal(2p), falta(1p): ");
                            sumarpunts(equipv, dorsal, puntuacio);
                            surt=true;
                        }
                    }

                } 
                else {
                    System.out.println("El nom de  l'equip no coincideix amb cap");
                }

                break;
            case 2:
                printarestadistiqueseq(equipl, equipv, local, visitant);
                break;
            }
        }
    }

    public static void mostranomeq(String equip) {
        System.out.println("##############################");
        System.out.println("        Equip " + equip + "       ");
        System.out.println("##############################");

    }

    public static void registrajugador(int dorsal, Object nomjugador, Map<Integer, ArrayList<Object>> equip) {

        ArrayList<Object> al = new ArrayList<>();

        al.add(nomjugador);
        al.add(0);
        equip.put(dorsal, al);

    }

    public static void menu() {
        System.out.println();
        System.out.println("##########################################");
        System.out.println("       1. S'ha encistellat una bola       ");
        System.out.println("       2. Mostrar les estadistiques       ");
        System.out.println("##########################################");
        System.out.println();
    }

    public static boolean comprovaeq(String nomeq, String equip) {

        if (nomeq.equalsIgnoreCase(equip)) {
            return true;
        }
        return false;

    }

    public static void printajugadorseq(Map<Integer, ArrayList<Object>> equip, String nomeq) {
        mostranomeq(nomeq);
        equip.forEach((k, v) -> {
            System.out.println(" Dorsal: " + k + "  Nom: " + v.get(0));
        });
    }

    public static boolean comprovadorsal(int dorsal, Map<Integer, ArrayList<Object>> equipl) {
        if (equipl.containsKey(dorsal)) {
            return true;
        } else {
            System.out.println("No s'ha trobat el dosal");
            return false;

        }

    }

    public static void sumarpunts(Map<Integer, ArrayList<Object>> equip, int dorsal, String puntacio) {

        int punts = (int) equip.get(dorsal).get(1);
        int sumar = 0;

        if(puntacio.equalsIgnoreCase("triple")){
            sumar = 3;
        }
        else if(puntacio.equalsIgnoreCase("normal")){
            sumar = 2;            
        }
        else if(puntacio.equalsIgnoreCase("falta")){
            sumar = 1;            
        }
        else{
            System.out.println("No s'ha trobat la quanitat de punts que es vol sumar");
        }

        int total = punts + sumar;

        equip.get(dorsal).set(1, total);


    }
    public static void printarestadistiqueseq(Map<Integer, ArrayList<Object>> equipl, Map<Integer, ArrayList<Object>> equipv, String local, String Visitant){

        System.out.println("######"+local+"######");

        equipl.forEach((k, v) -> {
            System.out.println(" Dorsal: " + k + "  Nom: " + v.get(0)+" Punts: "+v.get(1));
        });

        System.out.println("######"+Visitant+"######");
        equipv.forEach((k, v) -> {
            System.out.println(" Dorsal: " + k + "  Nom: " + v.get(0)+" Punts: "+v.get(1));
        });


    }
}