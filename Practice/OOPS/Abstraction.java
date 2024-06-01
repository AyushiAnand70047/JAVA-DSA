public class Abstraction {
    public static void main(String[] args) {;
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

// abstract class
abstract class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        color = "brown";
    }
    // non abstract method
    void eat(){
        System.out.println("animal eats");
    }
    // abstract method
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}