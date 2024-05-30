public class GetIthBit {
    public static int getBit(int num,int i){
        int bitmask = 1 << i;
        if((num&bitmask) == 0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int num = 10;
        int i = 3;
        System.out.println(getBit(num, i));
    }
}
