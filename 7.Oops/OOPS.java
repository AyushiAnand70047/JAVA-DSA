class OOPS{
    public static void main(String args[]){
        Student s1 = new Student(); // created a Student object called s1
        s1.calculatePercentage(80, 79, 91);
        System.out.println(s1.percentage);
    }
}

class Student{
    String name;
    int age;
    float percentage;
    void calculatePercentage(int physics,int chemistry,int maths){
        percentage = (physics + chemistry + maths)/3;
    }
}