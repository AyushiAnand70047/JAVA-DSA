public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ayushi";
        s1.roll = 23;
        s1.password = "abcd";
        s1.marks[0] = 91;
        s1.marks[1] = 95;
        s1.marks[2] = 88;

        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        s2.password = "xyz";
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor
    // Shallow Copy Constructor
    /* 
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    */

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // Non Parametrized Constructor
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }

}