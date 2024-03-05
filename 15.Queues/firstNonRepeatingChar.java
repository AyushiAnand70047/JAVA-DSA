import java.util.*;
public class firstNonRepeatingChar {
    public static String findFirstNonRepeating(String str){
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            q.add(str.charAt(i));
            freq[str.charAt(i) - 'a'] += 1;
            while ((!q.isEmpty()) && (freq[q.peek() - 'a'] > 1)) {
                q.remove();
            }
            if(q.isEmpty()){
                sb.append("-1");
            }
            else{
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        System.out.println(findFirstNonRepeating(str));
    }
}
