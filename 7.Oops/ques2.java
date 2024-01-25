public class ques2 {
    public static void main(String args[]){
        // Person class can access only name and weight
        // Student class can access name, weight, rollNumber, schoolName
    }
}

class Person{
    String name;
    int weight;
}

class Student extends Person{
    int rollNumber;
    String schoolName;
}