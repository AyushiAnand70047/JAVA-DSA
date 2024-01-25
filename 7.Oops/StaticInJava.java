public class StaticInJava {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "Saraswati Vidhya Mandir";

        Student s2 = new Student();
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}