import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        String n1=new Scanner(System.in).next();
        System.out.println(checkPalindrome(n1));
    }
    public static boolean checkPalindrome(String str1){
        boolean isPalindrome=true;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
}
