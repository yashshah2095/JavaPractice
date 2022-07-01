public class maxSum {
    public static void main(String[] args) {
        int[] a={2,5,1,76,32,89,90};
        int maxSum=0;
        for(int i=0;i<a.length-2;i++){
            int sum=a[i]+a[i+1]+a[i+2];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
}
