public class CircularQueueUsingArray {
    static class CircularQueue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        CircularQueue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }
        // is Empty
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        // is Full
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        // add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // when first element is added
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data;
        }
        // remove ( O(n) )
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // last element delete
            if(front == rear){
                rear = front = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return result;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        while (!cq.isEmpty()) {
            System.out.print(cq.peek()+" ");
            cq.remove();
        }
    }
}
