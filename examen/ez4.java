import java.util.Random;

/**
 * ez4
 */
public class ez4 {

    public static void main(String[] args) {
        Random ran = new Random();
        int array10[] = new int[10];
        int array100[] = new int[100];
        int array1000[] = new int[1000];
        int count10_cara = 0;
        int count10_creu = 0;


        for( int i=0; array10.length; i++){
            array10[i]=ran.nextInt(2);
        }
        for( int i=0; array100.length; i++){
            array100[i]=ran.nextInt(2);
        }
        for( int i=0; array1000.length; i++){
            array1000[i]=ran.nextInt(2);            
        }
        
        for( int i=0; array1000.length; i++){
            if(array10[i]==0);
            count_cara++;
           
        }
        System.out.println(+count10_cara);
        System.out.println(+count10_creu);
        count10_cara=0;
        for( int i=0; array1000.length; i++){
            if(array10[i]==0);
            count_cara++;
            
        }
        System.out.println(+count10_cara);
        System.out.println(+count10_creu);
        count10_cara=0;
        for( int i=0; array1000.length; i++){
            if(array10[i]==0);
            count_cara++;
            
        }
        System.out.println(+count10_cara);
        System.out.println(+count10_creu);
            
        

    }
    

}