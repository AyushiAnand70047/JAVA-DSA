// Check if a given array is sorted or not.

public class IsSortedArray {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] >= arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String args[]){
        int[] arr = {2,5,7,10};
        System.out.print(isSorted(arr,0));
    }
}