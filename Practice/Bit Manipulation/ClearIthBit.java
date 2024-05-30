public class ClearIthBit {
    public static int clearBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        System.out.println(clearBit(num, i));
    }
}