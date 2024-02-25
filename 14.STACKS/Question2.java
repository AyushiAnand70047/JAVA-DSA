// Reverse a String using a Stack
import java.util.*;
public class Question2 {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str = "ayushi";
        System.out.println(reverseString(str));
    }
}
