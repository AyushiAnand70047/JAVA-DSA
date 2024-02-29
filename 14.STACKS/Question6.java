/* Valid Parenthesis: Given a string s containing just the characters '(',')','{','}','[' and ']' determine if the input string is valid.
 * Any input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 */
import java.util.*;
public class Question6 {
    public static boolean isValid(String str){ // O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top = s.peek();
                if((top == '(' && ch == ')') || (top == '{' && ch == '}') || ((top == '[' && ch == ']'))){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String args[]){
        String str = "()";
        System.out.println(isValid(str));
    }
}
