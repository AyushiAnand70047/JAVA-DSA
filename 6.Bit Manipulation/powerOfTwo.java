import java.util.Scanner;

public class powerOfTwo {
    // if n = 2^x then n & (n-1) = 0
    public static boolean checkPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowerOfTwo(n));
    }
}
