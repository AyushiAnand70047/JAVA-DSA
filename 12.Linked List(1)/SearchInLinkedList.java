/* Search (Iterative): Search for a key in a Linked List. Return the position where it is found. If not found, return -1. */

public class SearchInLinkedList{
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            newNode.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int iterativeSearch(int key){ // O(n)
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public static void main(String args[]){
        SearchInLinkedList ll = new SearchInLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.print();
        System.out.println(ll.iterativeSearch(5));
        System.out.println(ll.iterativeSearch(10));
    }
}