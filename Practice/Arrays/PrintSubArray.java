/* SubArray: a continous part of a array */

public class PrintSubArray {

    public static void subArrays(int[] arr){
        int totalSubArrays = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("{ ");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("} ");
                totalSubArrays++;
            }
            System.out.println();
        }
        /* formula: n*(n+1)/2 */
        System.out.println("Total sub arrays: "+totalSubArrays);
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
