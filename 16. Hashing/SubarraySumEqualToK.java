import java.util.*;
public class SubarraySumEqualToK {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer,Integer> map = new HashMap<>();
        // (sum, count)
        map.put(0, 1);
        int currSum = 0;
        int answer = 0;
        for(int j=0;j<arr.length;j++){
            currSum += arr[j]; // sum(j)
            if(map.containsKey(currSum-k)){
                answer += map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        System.out.println(answer);
    }
}
