import java.util.*;
public class strings{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        String str = sc.nextLine();
        String str1 = "abcd";
        String str2 = new String("xyz");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str);
        // string length
        System.out.println(str.length());
        // string concatenation
        String str3 = str1+str2;
        System.out.println(str3);
        // string charAt method
        System.out.println(str3.charAt(1));
        // print all characters
        printLetters(str3);
        // string are immutable
    }
}