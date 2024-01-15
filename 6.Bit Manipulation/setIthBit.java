import java.util.*;
public class setIthBit {
    public static void ithBit(int n,int i){
        //int bitMask = (int)Math.pow(2,i);
        int bitMask = 1<<i;
        System.out.println(n|bitMask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        ithBit(n,i-1);
    }
}
