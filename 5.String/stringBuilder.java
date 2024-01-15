// strings are immutable , so we use stringBuilder
public class stringBuilder {
    public static void main(String args[]){
        // int a = 10; (we can't convert data type to string)
        Integer a = 10; // we can convert class to string
        System.out.println(a.toString());
        // append using string (Time Complexity:O(26*n))
        String str = new String("");
        for(char ch='a';ch<='z';ch++){
            str += ch;
        }
        System.out.println(str);
        // append using StringBuilder (Time Complexity: O(26))
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.print(sb);
    }
}