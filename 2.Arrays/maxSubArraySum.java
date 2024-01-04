// Brute Force => Time complexity: O(n^3)
public class maxSubArraySum{
    public static int subArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<=arr.length-1;i++){
            int start = i;
            for(int j=i;j<=arr.length-1;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        System.out.print(subArray(arr));
    }
}