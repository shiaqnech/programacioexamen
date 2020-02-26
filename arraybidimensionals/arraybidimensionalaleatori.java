import java.util.Random;

/**
 * arraybidimensionalaleatori
 */
public class arraybidimensionalaleatori {

    public static void main(String[] args) {
    Random newr = new Random();

        int arraybid[][] = new int[3][4];

        for (int i=0; i < arraybid.length; i++){
            

            System.out.print("\n");
            for (int j=0; j < arraybid[0].length; b++ ){

                arraybid[i][b] = newr.nextInt(10);
                System.out.print(arraybid[i][j]+"   "); 

            }
        }
    }
}