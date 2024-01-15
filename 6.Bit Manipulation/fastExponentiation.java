import java.util.Scanner;

public class fastExponentiation {
    // Time Complexity: O(log n)
    public static int exponentiation(int a,int b){
        int ans = 1;
        while(b > 0){
            if((b&1) != 0){
                ans = ans * a;
            }
            a = a*a;
            b = b>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // to calculate a to the power b (a^b)
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(exponentiation(a,b));
    }
}
