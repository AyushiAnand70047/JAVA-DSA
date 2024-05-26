public class ReverseInArray {

    public static void reverse(int[] arr){
        int n = arr.length;
        int mid = n/2;
        for(int i=0;i<mid;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8,10};
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Array after reversing: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
