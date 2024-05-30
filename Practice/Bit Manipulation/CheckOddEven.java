public class CheckOddEven{
    public static boolean checkOdd(int num){
        if((num&1) == 1){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int num = 4;
        if(checkOdd(num) == true){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
}