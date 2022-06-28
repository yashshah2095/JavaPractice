public class SwapNumbers {
    public static void main(String[] args){
        int a=6;
        int b=7;
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("a:"+a+"\nb:"+b);
    }
}
