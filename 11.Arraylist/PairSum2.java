import java.util.ArrayList;
public class PairSum2 {
    public static void pairSum(ArrayList<Integer> list,int target){
        // brute force
        /* 
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    System.out.println(i+","+j);
                    return;
                }
            }
        }
        */
        // two pointer approcah
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                int rp = i;
                int lp = i+1;
                while(rp != lp){
                    if((list.get(lp)+list.get(rp)) == target){
                        System.out.println(lp+" "+rp);
                        return;
                    }
                    else if((list.get(lp)+list.get(rp)) < target){
                        lp = (lp+1)%(list.size());
                    }
                    else{
                        rp = (list.size()+rp-1)%(list.size());
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        pairSum(list, target);
    }
}
