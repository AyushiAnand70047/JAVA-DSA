import java.util.*;
public class getIthBit {
    public static void ithBit(int n,int i){
        //int bitMask = (int)Math.pow(2,i);
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        ithBit(n,i-1);
    }
}
