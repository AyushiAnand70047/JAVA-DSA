import java.util.*;

public class PrintNumbersInDecreasingOrder{
    public static void printNum(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
}