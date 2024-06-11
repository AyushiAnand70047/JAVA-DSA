import java.util.*;
public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(!map.containsKey(currSum)){
                map.put(currSum, i);
            }
            else{
                int currLength = i - map.get(currSum);
                maxLength = Math.max(maxLength, currLength);
            }
        }
        System.out.println(maxLength);
    }
}
