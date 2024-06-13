public class FindSubsets {
    public static void printSubsets(String str,String ans,int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        // yes choice
        printSubsets(str, ans+str.charAt(i), i+1);
        // no choice
        printSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        printSubsets(str,"",0);
    }
}