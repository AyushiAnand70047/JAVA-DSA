import java.util.Scanner;

public class clearLastIBits {
    public static void clearBits(int n,int i){
       // int bitMask = (~0)<<i;
        int bitMask = (-1)<<i;
        System.out.println(n&bitMask);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        clearBits(n,i);
    }
}
