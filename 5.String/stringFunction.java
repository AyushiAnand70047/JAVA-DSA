public class stringFunction {
    public static String printSubstring(String str,int si,int ei){
        String subString = "";
        for(int i=si;i<ei;i++){
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        // print substring
        System.out.println(printSubstring(str,3,6));
        // function in string to print substring
        System.out.println(str.substring(3,6));
    }
}
