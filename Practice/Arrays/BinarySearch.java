/* Find index of element in sorted array */
/* Worst case time complexity: O(log n) */

public class BinarySearch {
    
    public static int search(int[] arr,int key){
        int si = 0;
        int ei = arr.length-1;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                si = mid + 1;
            }
            else{
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = search(arr, key);
        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("Key found at index: "+index);
        }
    }
}
