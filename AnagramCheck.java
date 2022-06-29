import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="Yyahshhh";
        String s2="hhjysayh";
        System.out.println("Are strings Anagram? "+anagramCheckUsingLibFunctions(s1,s2));
        System.out.println("Are strings Anagram? "+anagramCheckByComparingEachChar(s1,s2));
        System.out.println("Are strings Anagram? "+anagramCheckByCountingOccurence(s1,s2));
    }
    public static Boolean anagramCheckUsingLibFunctions(String s1, String s2){
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
    public static Boolean anagramCheckByComparingEachChar(String s1, String s2){
        Boolean isAnagram=true;
        if(s1.length() != s2.length()){
            isAnagram=false;
        }
        else {
            char[] charAR1=s1.toLowerCase().toCharArray();
            char[] charAR2=s2.toLowerCase().toCharArray();
            Arrays.sort(charAR1);
            Arrays.sort(charAR2);
            for(int i=0;i<s1.length();i++){
                if(charAR1[i]!=charAR2[i]){
                    isAnagram=false;
                    break;
                }
            }
        }
        return isAnagram;
    }
    public static Boolean anagramCheckByCountingOccurence(String s1, String s2){
        Boolean isAnagram=true;
        if(s1.length() != s2.length()){
            isAnagram=false;
        }
        else {
            char[] charAR1=s1.toLowerCase().toCharArray();
            char[] charAR2=s2.toLowerCase().toCharArray();
            Map<Character,Integer> mapChecker=new HashMap<>();
            for(int i=0;i<s1.length();i++){
                if(mapChecker.containsKey(charAR1[i])){
                    mapChecker.put(charAR1[i],mapChecker.get(charAR1[i])+1);
                }
                else {
                    mapChecker.put(charAR1[i],1);
                }
            }
            for(int i=0;i<s1.length();i++){
                if(mapChecker.containsKey(charAR2[i])){
                    mapChecker.put(charAR2[i],mapChecker.get(charAR2[i])-1);
                }
                else {
                    mapChecker.put(charAR2[i],1);
                }
            }
            for(int j : mapChecker.values()){
                if(j!=0){
                    isAnagram=false;
                    break;
                }
            }
        }
        return isAnagram;
    }
}
