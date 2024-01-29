// find the last occurence of an element in an array

public class LastOccurence {
    public static int lastOccur(int arr[],int n,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[arr.length-i-1] == n){
            return arr.length-i-1;
        }
        return lastOccur(arr, n, i+1);
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,5,10,2,5,3};
        int n = 5;
        System.out.print(lastOccur(arr,n,0));;
    }
}
