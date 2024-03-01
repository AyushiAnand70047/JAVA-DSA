/* Max Area in Histogram: Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram. */
import java.util.*;
public class Question8 {
    public static int maxArea(int[] heights){
        int n = heights.length;
        // next Smaller right
        int[] nextSmallerRight = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i] = n;
            }
            else{
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }
        // next Smaller left 
        int[] nextSmallerLeft = new int[n];
        s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i] = -1;
            }
            else{
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }
        // current area
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area = heights[i] * (nextSmallerRight[i] - nextSmallerLeft[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String args[]){
        int heights[] = {2,1,5,6,2,3};
        System.out.println(maxArea(heights));
    }
}
