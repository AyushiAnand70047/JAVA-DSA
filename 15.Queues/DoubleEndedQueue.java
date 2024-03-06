// Double ended queue
import java.util.*;
public class DoubleEndedQueue {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        System.out.println("First Element: "+ dq.getFirst());
        System.out.println("Last Element: "+dq.getLast());
    }
}