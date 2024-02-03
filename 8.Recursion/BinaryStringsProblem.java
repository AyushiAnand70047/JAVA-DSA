/* Binary Strings Problem: Print all binary strings of size N without consecutive ones */

public class BinaryStringsProblem {
    public static void printBinaryString(int n,int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str + "0");
        if(lastplace == 0){
            printBinaryString(n-1, 1, str + "1");
        }
    }
    public static void main(String args[]){
        printBinaryString(3,0, "");
    }
}
