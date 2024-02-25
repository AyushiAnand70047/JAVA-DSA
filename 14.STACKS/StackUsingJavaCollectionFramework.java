import java.util.*;
public class StackUsingJavaCollectionFramework {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
