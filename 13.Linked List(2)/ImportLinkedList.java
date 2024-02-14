import java.util.LinkedList; // Java Collection Framework (optimised)
public class ImportLinkedList {
    public static void main(String args[]){
        // create
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // print
        System.out.println(ll);
        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
