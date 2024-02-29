/* Duplicate Parentheses: Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parantheses.
 * Return a true if it contains duplicates else return false.
*/
import java.util.*;
public class Question7 {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                s.push(ch);
            }
            else{
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+(b))+(c+d))";
        System.out.println(isDuplicate(str));
    }
}
