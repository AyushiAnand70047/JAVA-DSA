public class AbstractClass {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // we can't create object of abstract class
       // Animal a = new Animal();

       System.out.println(h.color);
    }
}

abstract class Animal {
    // constructor
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called");
    }
    // non abstract class
    void eat(){
        System.out.println("animal eats");
    } 
    // abstract class
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    // parent class constructor will be called so output is brown not dark brown
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}