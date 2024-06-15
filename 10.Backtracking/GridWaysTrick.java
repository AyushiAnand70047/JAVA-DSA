public class GridWaysTrick {

    public static int fact(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        return x * fact(x-1);
    }
    public static void main(String args[]){
        int n = 3;
        int m = 3;
        int totalWays = fact(n-1+m-1)/(fact(n-1)*fact(m-1));
        System.out.println(totalWays);
    }
}