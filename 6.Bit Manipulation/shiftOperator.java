public class shiftOperator {
    public static void main(String args[]){
        int A = 5; // 000101
        // left shift operator
        // formula => a<<b = a * (2 to the power b)
        // 000101<<2 = 010100 = 20
        System.out.println(A<<2);
        // right shift operator
        // formula => a>>b = a / (2 to the power b)
        // 101>>1 = 010 (2)
        System.out.println(A>>1);
    }
}
