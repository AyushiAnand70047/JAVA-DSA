public class BacktrackingOnArray{
    public static void changeArr(int[] arr,int index,int value){
        if(index == arr.length){
            printArr(arr);
            return;
        }
        arr[index] = value;
        changeArr(arr,index+1,value+1);
        arr[index] = arr[index] - 2;
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr,0,1);
        System.out.println("recursion");
        printArr(arr);
    }
}