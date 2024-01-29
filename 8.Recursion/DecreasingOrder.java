// Print numbers from n to 1 (Decreasing Order)

public class DecreasingOrder{
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String args[]){
       int n = 10;
       printNum(n);
    }
}