/* Queue Reversal
 * input: 1 2 3 4 5
 * output: 5 4 3 2 1
 */

import java.util.*;
public class QueueReversal {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        reverseQueue(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
