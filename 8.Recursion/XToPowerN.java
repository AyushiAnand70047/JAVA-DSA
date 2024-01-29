public class XToPowerN {
    public static int findPower(int x,int n){
        if(n == 0){
            return 1;
        }
        return x * findPower(x, n-1);
    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        System.out.print(findPower(x,n));
    }
}