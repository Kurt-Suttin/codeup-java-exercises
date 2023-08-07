package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Circle newCircle = new Circle(6);
        newCircle.getArea();
        newCircle.getCircumference();
        System.out.println("your circumference is : " + newCircle.getCircumference());
        System.out.println("your area is : " + newCircle.getArea());
        System.out.println(newCircle);
    }


}

