public class XToThePowerNOptimised {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = power(x, n/2) * power(x, n/2);
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
}