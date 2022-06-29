public class Factorial {
    public static void main(String[] args) {
        int n1=10;
        System.out.println(factorial(n1));
    }
    public static int factorial(int n){
        int result=1;
        if(n!=0){
            result=n*factorial(n-1);
        }
        return result;
    }
}
