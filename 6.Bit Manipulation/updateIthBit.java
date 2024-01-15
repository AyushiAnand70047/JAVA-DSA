import java.util.*;
public class updateIthBit {
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int updateBit(int n,int i,int newBit){
        if(newBit == 0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
        // clearIthBit(n,i);
        // int bitMask = newBit<<i;
        // return n|bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int newBit = sc.nextInt();
        System.out.println(updateBit(n,i,newBit));
    }
}
