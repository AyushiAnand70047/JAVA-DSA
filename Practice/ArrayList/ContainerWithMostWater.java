import java.util.*;
public class ContainerWithMostWater {
    // brute force
    public static int maxWater(ArrayList<Integer> list){
        int curr = 0;
        int max = 0;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i;j<list.size()-1;j++){
                for(int k=j+1;k<list.size();k++){
                    curr = (k-j) * Math.min(list.get(j),list.get(k));
                    max = Math.max(max, curr);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWater(list));
    }
}