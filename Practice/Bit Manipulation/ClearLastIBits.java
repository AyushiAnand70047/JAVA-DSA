public class ClearLastIBits {
    public static int clearLastBit(int n,int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    public static void main(String args[]){
        int n = 15;
        int i = 2;
        System.out.println(clearLastBit(n, i));
    }
}