import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RGBGrouping {
    public static void main(String[] args) {
        String[] str1={"red","blue","green","red","blue","red","green"};
        ArrayList<String> str2=new ArrayList<>();
        addElement("red",str2,str1);
        addElement("green",str2,str1);
        addElement("blue",str2,str1);
        System.out.println(str2);
    }
    public static void addElement(String color, ArrayList str2,String[] str1){
        for(int i=0;i< str1.length;i++){
            if(str1[i]==color){
                str2.add(str1[i]);
            }
        }
    }
}
