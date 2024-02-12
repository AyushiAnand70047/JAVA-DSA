/* Find & Remove Nth node from end (Iterative Approach) */

public class FindAndRemoveNthNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteNthNodeFromEnd(int n){
        // calculate size of linked list
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // delete nth node from end => delete (size-n+1)th node from start
        // if element to delete is head
        if(n == size){
            head = head.next;
            return;
        }
        // find previous of node to be deleted
        int idxFind = size - n;
        int i = 1;
        Node prev = head;
        while(i < idxFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public static void main(String args[]){
        FindAndRemoveNthNode ll = new FindAndRemoveNthNode();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        //ll.deleteNthNodeFromEnd(4);
        ll.deleteNthNodeFromEnd(3);
        ll.print();
    }
}
