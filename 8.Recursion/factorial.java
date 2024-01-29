// Print factorial of a number n.

public class factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(fact(n));
    }
}
