// Prefix Sum
public class maxSubArraySum1{
    public static void maxSum(int arr[]){
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        int currSum = 0;
        prefix[0] = arr[0];
        // prifix array
        for(int i=1;i<=prefix.length-1;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // max sub array sum
        for(int i=0;i<=arr.length-1;i++){
            int start = i;
            for(int j=i;j<=arr.length-1;j++){
                int end = j;
                currSum = (start == 0)? prefix[end] : prefix[end] - prefix[start-1];
                if(currSum > max){
                    max = currSum;
                }
            }
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        maxSum(arr);
    }
}