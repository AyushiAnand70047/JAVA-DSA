public class FirstOccurence {
    public static int findOccurence(int[] arr,int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return findOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,3,10,2,5,3};
        int element = 5;
        System.out.println(findOccurence(arr,element,0));
    }
}
