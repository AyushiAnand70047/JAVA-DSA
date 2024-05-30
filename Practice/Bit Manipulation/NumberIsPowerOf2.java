public class NumberIsPowerOf2 {
    public static boolean checkPowerOf2(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 18;
        if(checkPowerOf2(n) == true){
            System.out.println("number is power of 2");
        }
        else{
            System.out.println("number is not power of 2");
        }
    }
}
