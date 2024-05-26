public class PairsInArray {

    public static void findPairs(int[] arr){
        int totalPairs = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                totalPairs++;
            }
            System.out.println();
        }
        /* Formula for total pairs: n*(n-1)/2 */
        System.out.println("Total pairs: "+totalPairs);
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8,10};
        findPairs(arr);
    }
}
