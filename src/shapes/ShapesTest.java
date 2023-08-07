package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Circle newCircle = new Circle(6);
//        newCircle.getArea();
//        newCircle.getCircumference();
//        System.out.println("your circumference is : " + newCircle.getCircumference());
//        System.out.println("your area is : " + newCircle.getArea());
//        System.out.println(newCircle);

//create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class
// with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(4,5);
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println("box1's perimeter is " + box1.getPerimeter()+" respectively");
        System.out.println( "box1's area is " + box1.getArea()+" respectively");
///

//    create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5
//
 Rectangle box2 = new Square(5);

//verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println("box2's perimeter is " + box2.getPerimeter()+ " respectively");
        System.out.println( "box2's area is " + box2.getArea() +" respectively");

//In the Square class, override the getArea and getPerimeter methods
// with the following definitions for a square
// perimeter = 4 x side
// area = side ^ 2 (aka second power)


        Square square = new Square(5);
        System.out.println("Square Area: " + square.getArea()); // Calls Square's overridden getArea
        System.out.println("Square Perimeter: " + square.getPerimeter()); // Calls Square's overridden getPerimeter


    }


}

