public class reverseInArray{
    public static void reverse(int arr[]){
        // revese array
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        // reverse using while loop
        /*int first = 0; 
        int last = arr.length - 1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[arr.length - first - 1];
            arr[arr.length - first - 1] = temp;
            first++;
            last--;
        }*/
        // print reversed array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,12,10};
        reverse(arr);
    }
}