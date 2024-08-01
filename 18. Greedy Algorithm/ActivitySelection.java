import java.util.*;

public class ActivitySelection{
    public static void main(String[] args){
        int[] start = {10,12,20};
        int[] end = {20,25,30};
        // int[] start = {1,3,0,5,8,5};
        // int[] end = {2,4,6,7,9,9};
        // if end is not sorted
        // int[][] activities = new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0] = i;
        //     activities[i][1] = start[i];
        //     activities[i][2] = end[i];
        // }
        // Arrays.sort(activities,Comparator.comparingDouble(o -> o[3]));
        int count = 1;
        int prevEnd = end[0];
        for(int i=1;i<start.length;i++){
            if(prevEnd <= start[i]){
                count++;
                prevEnd = end[i];
            }
        }
        System.out.println(count);
    }
}