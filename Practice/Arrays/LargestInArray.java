public class LargestInArray {

    public static int largestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(arr[i],largest);
        }
        return largest;
    }

    public static void main(String args[]){
        int[] arr = {1,2,6,3,5};
        System.out.println("Largest in array is: "+ largestNumber(arr));
    }
}
