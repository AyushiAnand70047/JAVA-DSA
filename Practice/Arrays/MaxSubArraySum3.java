/* Kadane's Algorithm */
public class MaxSubArraySum3 {
    public static int maxSubArraySum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum subarray sum is "+maxSubArraySum(arr));
    }
}