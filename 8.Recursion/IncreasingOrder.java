// Print numbers from 1 to n (Increasing Order)

public class IncreasingOrder {
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n = 10;
        printNum(n);
    }
}
