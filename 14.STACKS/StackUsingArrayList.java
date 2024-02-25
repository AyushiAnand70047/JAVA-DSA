import java.util.ArrayList;

public class StackUsingArrayList{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        // isEmpty
        public boolean isEmpty(){
            return list.size() == 0;
        }
        // push
        public void push(int data){
            list.add(data);
        }
        // pop
        public int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek
        public int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(2);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}