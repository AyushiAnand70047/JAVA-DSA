import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(7);
        list.add(20);
        list.add(18);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}
