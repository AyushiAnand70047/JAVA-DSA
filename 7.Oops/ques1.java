class Student{
    String name;
    int marks;
}

public class ques1 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Ayushi";
        System.out.println(s.name);
    }
}

// we can access static variable through both class and object but other variable can accessed using object only
