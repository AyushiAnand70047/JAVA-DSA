public class InterfaceMultipleInheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eat1();
        b.eat2();
    }
}

interface Herbivore{
    void eat1();
}

interface Carnivore{
    void eat2();
}

class Bear implements Herbivore, Carnivore{
    public void eat1(){
        System.out.println("Bear eat plants");
    }
    public void eat2(){
        System.out.println("Bear eat animals");
    }
}