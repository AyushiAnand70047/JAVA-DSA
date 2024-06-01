public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
        Bird crow = new Bird();
        crow.eat();
        crow.fly();
        Fish dolphin = new Fish();
        dolphin.eat();
        dolphin.swim();
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Hybrid Inheritance (Hierarichal Inheritance + multi level inheritance)

// Hierarchial Inheritance (Animal -> Bird, Animal -> Fish)
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
// multi level inheritance (Animal -> Mammal -> Dog)
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Mammal{
//     String breed;
// }

// Single level inheritance (Animal(base class) -> Fish(sub class))
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }