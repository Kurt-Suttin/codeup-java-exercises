package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Circle grandpa = new Circle(6);
        grandpa.getArea();
        grandpa.getCircumference();
        System.out.println("your circumference is : " + grandpa.getCircumference());
        System.out.println("your area is : " + grandpa.getArea());
        System.out.println(grandpa);
    }


}

