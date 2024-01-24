public class OOPSConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Ayushi");
        Student s3 = new Student(23);
        //Student s4 = new Student("Ayushi",23);
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int roll;

    // Non Parametrized Constructor
    Student(){
        System.out.println("Constructor is called");
    }

    // Parametrized Constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}