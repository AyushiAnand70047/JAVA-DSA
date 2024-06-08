public class SortedRotatedArraySearch {
    public static int search(int[] arr,int target,int si,int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei - si)/2;
        if(arr[mid] == target){
            return mid;
        }
        // mid on line1 
        else if(arr[si] <= arr[mid]){
            // target on left of line1
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        // mid on line2
        else{
            // target on right of line2
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 10;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}