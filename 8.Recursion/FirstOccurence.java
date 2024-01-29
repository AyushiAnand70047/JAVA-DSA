// find the first occurence of an element in an array

public class FirstOccurence {
    public static int firstOccur(int arr[],int n,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }
        return firstOccur(arr, n, i+1);
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n = 5;
        System.out.print(firstOccur(arr,n,0));
    }
}
