import java.util.*;
public class oddEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n&bitMask) == 0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // lsb of odd number is always 1
        // lsb of even number is always 0
        // n & 1 => give lsb
        oddOrEven(n);
    }
}
