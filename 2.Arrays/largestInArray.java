public class largestInArray{
    public static int largest(int arr[]){
        //int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        int result = largest(arr);
        System.out.print(result);
    }
}