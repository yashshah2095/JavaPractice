import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int takeInput=new Scanner(System.in).nextInt();
        int f1=0;
        int f2=1;
        List<Integer> ar1=new ArrayList<>();
        ar1.add(f1);
        ar1.add(f2);
        for(int i=1;i<takeInput;i++){
            ar1.add(f1+f2);
            f2=f1+f2;
            f1=f2-f1;
        }
        System.out.println(ar1);
    }
}
