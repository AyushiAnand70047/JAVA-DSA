import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        mainList.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5); list2.add(6); list2.add(4);
        mainList.add(list2);
        System.out.println(mainList);
        // iterating over multi-dimensional list
        for(int i=0;i<mainList.size();i++){
            // ArrayList<Integer> currList = new ArrayList<>();
            // currList = mainList.get(i);
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

        // list1: 1,2,3,4,5 | list2: 2,4,6,8,10 | list3: 3,6,9,12,15
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            l1.add(i);
            l2.add(i*2);
            l3.add(i*3);
        }
        main.add(l1);
        main.add(l2);
        main.add(l3);
        System.out.println(main);
        // print main using nested loops
        for(int i=0;i<main.size();i++){
            ArrayList<Integer> list = main.get(i);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}
