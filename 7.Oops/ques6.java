class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks;
    }
}

public class ques6 {
    public static void main(String[] args){
        Test t = new Test();
        t.set_marks(98);
        // we can directly access static variable using class
        System.out.println(Test.marks);
    }
}
