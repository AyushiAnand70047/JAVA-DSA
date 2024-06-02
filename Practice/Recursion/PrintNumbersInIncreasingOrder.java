import java.util.*;
public class PrintNumbersInIncreasingOrder {
    public static void printNum(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
}