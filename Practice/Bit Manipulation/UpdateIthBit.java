public class UpdateIthBit {
    public static int clearBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int setBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int updateBit(int n,int i,int newBit){
        if(newBit == 0){
            return clearBit(n,i);
        }
        else{
            return setBit(n,i);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(updateBit(n, i, i));
    }
}
