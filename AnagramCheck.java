import java.util.Arrays;
import java.util.Locale;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="Yash";
        String s2="sayh";
        System.out.println("Are strings Anagram? "+anagramCheck(s1,s2));
    }
    public static Boolean anagramCheck(String s1, String s2){
        Boolean isAnagram;
        if(s1.length() != s2.length()){
            isAnagram=false;
        }
        else {
            char[] charAR1=s1.toLowerCase().toCharArray();
            char[] charAR2=s2.toLowerCase().toCharArray();
            Arrays.sort(charAR1);
            Arrays.sort(charAR2);
            isAnagram=Arrays.equals(charAR1,charAR2);
        }
        return isAnagram;
    }
}
