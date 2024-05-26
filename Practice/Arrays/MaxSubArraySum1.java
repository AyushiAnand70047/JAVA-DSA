/* Brute Force */
public class MaxSubArraySum1 {

    public static int maxSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum = 0;
                for(int k=i;k<=j;k++){
                    currsum += arr[k];
                }
                maxSum = Math.max(currsum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] arr = {1,-2,6,-1,3};
        System.out.println("Maximum subarray sum: "+maxSubArraySum(arr));
    }
}
