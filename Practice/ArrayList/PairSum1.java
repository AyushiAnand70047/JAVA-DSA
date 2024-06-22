import java.util.ArrayList;

public class PairSum1 {
    public static void printPair(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            int sum = list.get(lp) + list.get(rp);
            if(sum == target){
                System.out.println(list.get(lp)+" "+list.get(rp));
                return;
            }
            else if(sum < target){
                lp++;
            }
            else{
                rp--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        printPair(list,target);
    }
}
