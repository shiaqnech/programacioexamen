package app;

import java.util.Random;

import javax.net.ssl.TrustManager;

public class App {
    public static void main(String[] args) throws Exception {

        Random r = new Random();
        boolean surt = false;
        int arraycinc[] = new int[5];
        int arraydos[] = new int[2];

        int arraytcinc[] = new int[5];
        int arraytdos[] = new int[2];
        boolean cinc;
        boolean dos;

        String espai = "-----------------------------------";


        boolean exit = false;
        int intents = 0;
        int numtcinc = 0;
        int numtdos = 0;


        while (!surt) {

            System.out.println(
                    "Genera 5 numeros i 2 estreslles a l'atzar(1) - Introdeuix els numeros manualment (2) - Sortir (3)");
            int opcio = Integer.parseInt(System.console().readLine());

            switch (opcio) {

            case 1:
                System.out.println("Ara es generaran 5 numeros i 2 numeros estrelles aleatoris");
                boolean repetit;

                for (int i = 0; i < arraycinc.length; i++) {
                    repetit = false;
                    int numrcinc = r.nextInt(50) + 1;

                    while (!repetit) {
                        repetit = true;
                        for (int x = 0; x < arraycinc.length; x++) {
                            if (numrcinc == arraycinc[x]) {
                                numrcinc = r.nextInt(50) + 1;
                                repetit = false;
                            }
                        }
                    }
                    arraycinc[i] = numrcinc;

                    System.out.print(arraycinc[i] + " ");

                }

                System.out.print("----> ");

                for (int i = 0; i < arraydos.length; i++) {
                    repetit = false;
                    int numdos = r.nextInt(10) + 1;

                    while (!repetit) {
                        repetit = true;
                        for (int x = 0; x < arraydos.length; x++) {
                            if (numdos == arraydos[x]) {
                                numdos = r.nextInt(10) + 1;
                                repetit = false;
                            }
                        }
                    }
                    arraydos[i] = numdos;

                    System.out.print(arraydos[i] + " ");

                }
                System.out.println();
                System.out.println(espai);




                while (!exit) {
                    int cincnums= 0;
                    int dosnums = 0;


                    for (int i = 0; i < arraytcinc.length; i++) {

                        cinc = false;
                        numtcinc = r.nextInt(50) + 1;

                        while (!cinc) {
                            cinc = true;
                            for (int x = 0; x < arraytcinc.length; x++) {
                                if (numtcinc == arraytcinc[x]) {
                                    numtcinc = r.nextInt(50) + 1;
                                    cinc = false;
                                }
                            }
                        }
                        arraytcinc[i] = numtcinc;
                    }                    

                    for (int i = 0; i < arraytdos.length; i++) {
                        numtdos = r.nextInt(10) + 1;
                        dos = false;    
                        while (!dos) {
                            dos = true;
                            for (int x = 0; x < arraydos.length; x++) {
                                if (numtdos == arraytdos[x]) {
                                    numtdos = r.nextInt(10) + 1;
                                    dos = false;
                                }
                            }
                        }
                        arraytdos[i] = numtdos;    
                    }
                    // for (int  i = 0; i < arraycinc.length; i++){
                    //     System.out.println(arraytcinc[i]+"--");

                    // }
                    // for (int  i = 0; i < arraydos.length; i++){
                    //     System.out.println(arraytdos[i]);
                        
                    // }
                    // System.console().readLine();

                    for  (int i = 0; i < arraycinc.length; i++){
                        for (int x = 0; x < arraycinc.length; x++){
                            if (arraytcinc[i]==arraycinc[x]){                            
                                
                                cincnums++;
                            }
                        }

                    }
                    for (int i = 0; i < arraydos.length; i++){
                        for (int x = 0; x < arraydos.length; x++){
                            if (arraytdos[i]==arraydos[x]){
                                dosnums++;                                
                            }
                        }
                    }
                    intents++;
                    // System.out.println(dosnums+" "+cincnums);

                    if (cincnums == 5 && dosnums == 2){
                        System.out.println("Primer premi per "+ arraycinc[0]+" "+arraycinc[1]+" "+arraycinc[2]+" "+arraycinc[3]+" "+arraycinc[4]+" -----> "+arraydos[0]+arraydos[1]);
                        System.out.println("Numero d'intents -----> "+intents);

                        exit = true;

                    }


                }

                break;
            case 2:
            
                System.out.println(espai);
                System.out.println("NUMEROS DEL TAULELL(aquests han de ser del 1 al 50)");
                for (int i = 0; i < arraycinc.length; i++) {
                    System.out.println("Introdueix el " + (i + 1) + "numero");
                    arraycinc[i] = Integer.parseInt(System.console().readLine());
                }

                System.out.println(espai);
                System.out.println("NUMEROS ESTRELLA(aquests han de ser del 1 al 10)");

                for (int i = 0; i < arraydos.length; i++) {
                    System.out.println("Introdueix el " + (i + 1) + "numero");
                    arraydos[i] = Integer.parseInt(System.console().readLine());
                }



                while (!exit) {
                    int cincnums= 0;
                    int dosnums = 0;


                    for (int i = 0; i < arraytcinc.length; i++) {

                        cinc = false;
                        numtcinc = r.nextInt(50) + 1;

                        while (!cinc) {
                            cinc = true;
                            for (int x = 0; x < arraytcinc.length; x++) {
                                if (numtcinc == arraytcinc[x]) {
                                    numtcinc = r.nextInt(50) + 1;
                                    cinc = false;
                                }
                            }
                        }
                        arraytcinc[i] = numtcinc;
                    }                    

                    for (int i = 0; i < arraytdos.length; i++) {
                        numtdos = r.nextInt(10) + 1;
                        dos = false;    
                        while (!dos) {
                            dos = true;
                            for (int x = 0; x < arraydos.length; x++) {
                                if (numtdos == arraytdos[x]) {
                                    numtdos = r.nextInt(10) + 1;
                                    dos = false;
                                }
                            }
                        }
                        arraytdos[i] = numtdos;    
                    }
                    // for (int  i = 0; i < arraycinc.length; i++){
                    //     System.out.println(arraytcinc[i]+"--");

                    // }
                    // for (int  i = 0; i < arraydos.length; i++){
                    //     System.out.println(arraytdos[i]);
                        
                    // }
                    // System.console().readLine();

                    for  (int i = 0; i < arraycinc.length; i++){
                        for (int x = 0; x < arraycinc.length; x++){
                            if (arraytcinc[i]==arraycinc[x]){                            
                                
                                cincnums++;
                            }
                        }

                    }
                    for (int i = 0; i < arraydos.length; i++){
                        for (int x = 0; x < arraydos.length; x++){
                            if (arraytdos[i]==arraydos[x]){
                                dosnums++;                                
                            }
                        }
                    }
                    intents++;
                    // System.out.println(dosnums+" "+cincnums);

                    if (cincnums == 5 && dosnums == 2){

                        System.out.println("Primer premi per "+ arraycinc[0]+" "+arraycinc[1]+" "+arraycinc[2]+" "+arraycinc[3]+" "+arraycinc[4]+" -----> "+arraydos[0]+arraydos[1]);
                        System.out.println("Numero d'intents -----> "+intents);

                        exit = true;


                    }


                }
            }
        }
    }
}