import java.util.*;
public class clearIthBit {
    public static void clearithBit(int n,int i){
        int bitMask = ~(1<<i);
        System.out.println(n&bitMask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        clearithBit(n,i);
    }
}
