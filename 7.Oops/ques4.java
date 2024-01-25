public class ques4 {
    public static void main(String[] args){
        Vehicle obj1 = new Car();
        // obj1 reference is Vehicle(so we can't call print1 from obj1) and it is poiniting towards Car
        //obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(car)");
    }
}