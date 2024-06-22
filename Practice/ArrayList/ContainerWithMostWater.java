import java.util.*;
public class ContainerWithMostWater {
    // brute force
    public static int maxStoreWater(ArrayList<Integer> list){
        int maxWater = 0;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                int height = Math.min(list.get(i),list.get(j));
                int width = j-i;
                int currWater = height * width;
                maxWater = Math.max(currWater,maxWater);
            }
        }
        return maxWater;
    }
    // two pointer approacj
    public static int maxStoreWater1(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size()-1;
        int maxWater = 0;
        while (lp < rp) {
            int width = rp - lp;
            int height = Math.min(list.get(lp), list.get(rp));
            int currWater = height * width;
            maxWater = Math.max(maxWater, currWater);
            if(lp < rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    // optimsed
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
        System.out.println(maxStoreWater(list));
        System.out.println(maxStoreWater1(list));
    }
}