public class binarySearch{
    public static int search(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = search(arr,key);
        if(index == -1){
            System.out.print("Key not found");
        }
        else{
            System.out.print("Key found at index "+index);
        }
    }
}