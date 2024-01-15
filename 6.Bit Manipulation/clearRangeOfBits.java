import java.util.Scanner;

public class clearRangeOfBits {
    public static void clearBits(int n,int i,int j){
        int a = (-1)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        System.out.println(n&bitMask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        clearBits(n,i,j);
    }
}
