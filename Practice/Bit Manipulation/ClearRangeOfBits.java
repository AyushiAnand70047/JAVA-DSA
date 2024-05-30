public class ClearRangeOfBits {
    public static int clearBit(int n,int i,int j){
        int a = (~0) << (j+1);
        int b = (1 << i) - 1; 
        int bitMask = a|b;
        return n&bitMask;
    }
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        int j = 7;
        System.out.println(clearBit(n, i, j));
    }
}