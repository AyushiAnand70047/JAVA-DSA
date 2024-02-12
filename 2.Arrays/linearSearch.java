// find the index of element in a given array

public class linearSearch{
    public static void search(int arr[],int key){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.print("Element found at index "+i);
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.print("Element not found");
        }
    }
    public static void main(String args[]){
        int arr[] = {4,7,2,3,5,8,9};
        int key = 5;
        search(arr,key);
    }
}