import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try{
            int[] arr=new int[]{1,2,3};
            int sum=0;
            for(int i=1;i<4;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }

        catch (IndexOutOfBoundsException e){
            System.out.println("Index");
        }

    }
}
