/* Interleave 2 Halves of a Queue (even length) 
 * input -> 1 2 3 4 5 6 7 8 9 10
 * output -> 1 6 2 7 3 8 4 9 5 10
*/
import java.util.*;
public class Interleave2HalvesOfAQueue {
    public static void interleave(Queue<Integer> q){
        // size of queue
        int size = q.size();
        // store first half in another queue
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0; i < size/2; i++){
            q1.add(q.remove());
        }
        // interleave
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
        // output
        // for(int i=0;i<size;i++){
        //     System.out.print(q.remove()+" ");
        // }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        interleave(q);
        int size = q.size();
        for(int i=0;i<size;i++){
            System.out.print(q.remove()+" ");
        }
    }
}
