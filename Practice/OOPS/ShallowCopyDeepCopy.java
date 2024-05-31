public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 90;
        s1.marks[1] = 70;
        s1.marks[2] = 85;
        Student s2 = new Student(s1);
        s1.marks[1] = 75;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int[] marks;

    // shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor called ...");
    }
}