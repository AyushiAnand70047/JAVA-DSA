import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // Add element in list O(1)
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        System.out.println(list);
        // add at any index : O(n)
        list.add(1,9);
        System.out.println(list);
        // get element : O(1)
        int element = list.get(2);
        System.out.println(element);
        // remove element : O(n)
        list.remove(2);
        System.out.println(list);
        // set element at index : O(n)
        list.set(1,10);
        System.out.println(list);
        // contains element : O(n)
        System.out.println(list.contains(4));
        System.out.println(list.contains(3));
        System.out.println(list.contains(10));
        // size of ArrayList
        System.out.println(list.size());
        // iterate ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // print reverse ArrayList : O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
