import java.util.*;

public class FindMinFromArray {
    public static void main(String[] args) {
        int[] ar1 = {-1,-2,0,2,3};
        HashSet<Integer> hmp1 = new HashSet<>();
        for (int i : ar1) {
            if (i > 0) {
                hmp1.add(i);
            }
        }
        int smallest = 0;
        for (int j = 1; j <= ar1.length+1; j++) {
            if (!hmp1.contains(j)) {
                smallest = j;
                break;
            }
        }
        System.out.println(smallest);
    }
}
