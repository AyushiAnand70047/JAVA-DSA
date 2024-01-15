public class bitwiseOperator {
    public static void main(String args[]){
        int A = 5; // 0101
        int B = 6; // 0110
        // Binary AND
        System.out.println(A&B); // 0100
        // Binary OR
        System.out.println(A|B); // 0111
        // Binary XOR
        System.out.println(A^B); // 0011
        // Binary 1's complement (start video from here)
        // 5 = 00000101 
        // ~5 = 11111010 (msb bit is 1 so find 2's complement to know actual magnitude of that negative number)
        // 1's complement => 00000101 then 2's complement => 1's complement + 1 = 00000110 (6)
        System.out.println(~A); // -6
    }
}
