public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // by default decimal value is double, so we need to typecast it to float
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(1, 2,3));

        Deer d = new Deer();
        d.eat();
    }
}

class Calculator{
    // Method Overloading
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

// Method Overriding
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer can eat");
    }
}