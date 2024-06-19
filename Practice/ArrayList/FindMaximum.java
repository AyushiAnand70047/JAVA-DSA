import java.util.ArrayList;
public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            maxi = Math.max(list.get(i),maxi);
        }
        System.out.println("Maximum value is "+maxi);
    }
}