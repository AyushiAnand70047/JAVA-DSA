public class StringComparison {
    public static void main(String args[]){
        String str1 = "Ayushi";
        String str2 = "Ayushi";
        String str3 = new String("Ayushi");
        if(str1 == str2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(str1 == str3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(str1.equals(str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(str1.equals(str3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}