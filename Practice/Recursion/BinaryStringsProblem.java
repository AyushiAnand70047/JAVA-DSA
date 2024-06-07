public class BinaryStringsProblem {
    public static void printString(int n,int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printString(3, 0, "");
    }
}