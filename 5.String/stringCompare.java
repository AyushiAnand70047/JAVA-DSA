public class stringCompare {
    public static void main(String args[]){
        String s1 = "Ayushi";
        String s2 = "Ayushi";
        String s3 = new String("Ayushi");
        // we can't use equal to operator to compare string
        if(s1 == s2){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }
        if(s1 == s3){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }
        // s1 == s2 is showing string are equals because both are pointing to same location as we have not declare it using new keyword
        // so, to compare string we have to use s1.equals(s2)
        if(s1.equals(s2)){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }
        if(s1.equals(s3)){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }
    }
}
