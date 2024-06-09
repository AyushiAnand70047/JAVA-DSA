// HashMap code
import java.util.*;
public class HashMapImplementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int size; //n 
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            hc = Math.abs(hc) % size;
            return hc;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key, value));
            }
        }
    }
    public static void main(String[] args) {
        
    }
}