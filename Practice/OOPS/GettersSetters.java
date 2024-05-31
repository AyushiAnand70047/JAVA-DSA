public class GettersSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;

    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
}