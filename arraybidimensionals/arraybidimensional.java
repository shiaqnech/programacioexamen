/**
 * arraybidimensional
 */
public class arraybidimensional {

    public static void main(String[] args) {

                
        int arraybid[][] = new int[3][4];

        for (int i=0; i < arraybid.length; i++){
            System.out.print("\n");
            for (int j=0; j < arraybid[0].length; j++ ){
                System.out.print(i+" "+j+"| ");
            }
        }
    }
}