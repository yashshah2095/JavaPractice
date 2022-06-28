public class SecondLargest {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,2,1,10,20};
        System.out.println("Second largest number is:"+secondLargest(arr1));
    }
    public static int secondLargest(int[] num){
        int largest=0;
        int secondLargest=0;
        for(int i:num){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }
        }
        return secondLargest;
    }
}
