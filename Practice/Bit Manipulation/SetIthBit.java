public class SetIthBit{
    public static int setBit(int n,int i){
        int bitMask = 1 << i;
        n = n | bitMask;
        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(setBit(n, i));
    }
}