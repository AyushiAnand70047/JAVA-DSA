public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public boolean isEmpty(){
            return head == null;
        }
        // push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // pop
        public int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek
        public int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
