import java.util.Scanner;

public class countSetBitsInNumber {
    // Time Complexity: O(log n)
    public static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            if((n&1) != 0){ // check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSetBit(n));
    }
}
