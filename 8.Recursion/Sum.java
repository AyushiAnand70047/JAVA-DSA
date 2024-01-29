public class Sum {
    public static int sumNum(int n){
        if(n == 1){
            return 1;
        }
        return n + sumNum(n-1);
    } 
    public static void main(String args[]){
        int n = 10;
        int result = sumNum(n);
        System.out.println(result);
    }
}