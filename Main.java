import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Using Hashmap
        int[] ar1={1,2,3,4,2,3,0,1};
        Map<Integer,Integer> elementFrequency=new HashMap<>();
        for(int i=0;i<ar1.length;i++){
            if(elementFrequency.containsKey(ar1[i])){
                elementFrequency.put(ar1[i],elementFrequency.get(ar1[i])+1);
            }else {
                elementFrequency.put(ar1[i],1);
            }
        }
        System.out.println(elementFrequency);

    }
}