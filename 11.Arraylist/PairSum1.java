/* Find if any pair in a Sorted ArrayList has a target sum. */
import java.util.ArrayList;
public class PairSum1 {
    // 2 pointer approach
    public static boolean find2(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size() - 1;
        while(lp != rp){
            if((list.get(lp)+list.get(rp)) == target){
                return true;
            }
            else if(((list.get(lp)+list.get(rp)) < target)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    // brute force: O(n^2)
    public static void find1(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(target == (list.get(i) + list.get(j))){
                    System.out.println(list.get(i)+ " "+ list.get(j));
                }
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        find1(list, target);
        System.out.println( find2(list, target));
    }
}
