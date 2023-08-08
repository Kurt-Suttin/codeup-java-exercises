package shapes;
//Create a class named Square, also inside of shapes, that extends Rectangle.
// Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

public class Square extends Quadrilateral {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * this.side;
        //perimeter = 2 x length + 2 x width
    }

    public double getArea() {
        return (int) (Math.pow(this.side, 2));
        //perimeter = 2 x length + 2 x width
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }
}

///In the Square class, override the getArea and getPerimeter methods
//// with the following definitions for a square
// constructor
//    public Square(int side) {
//        super(side,side);
//    }
//overrides
//    @Override
//    public int getArea() {
//        return width * width; // Area of a square is side * side
//    }

//// perimeter = 4 x side
//    @Override
//    public int getPerimeter() {
//        return 4 * width; // Perimeter of a square is 4 times the side
//    }

//// area = side ^ 2 (aka second power)

//Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,

//

