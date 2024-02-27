/* Next Greater Element: The next greater element x in an array is the first greater element that is to the right of x in the same array. */
import java.util.*;
public class Question5 {
    public static void nextGreater(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] greater = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                greater[i] = -1;
            }
            else{
                greater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<greater.length;i++){
            System.out.print(greater[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr = {6, 8, 0, 1, 3};
        // nextGreater = [8,-1,1,3,-1]
        nextGreater(arr);
        
    }
}
