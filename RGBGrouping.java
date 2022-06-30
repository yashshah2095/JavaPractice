import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RGBGrouping {
    public static void main(String[] args) {
        String[] str1={"red","blue","green","red","blue","red","green"};
        ArrayList<String> str2=new ArrayList<>();
        for(int i=0;i< str1.length;i++){
            if(str1[i]=="red"){
                str2.add(str1[i]);
            }
        }
        for(int i=0;i< str1.length;i++){
            if(str1[i]=="green"){
                str2.add(str1[i]);
            }
        }
        for(int i=0;i< str1.length;i++){
            if(str1[i]=="blue"){
                str2.add(str1[i]);
            }
        }
        System.out.println(str2);
    }
}
