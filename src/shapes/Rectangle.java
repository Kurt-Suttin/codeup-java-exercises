package shapes;
// It should have protected properties for both length and width.
// Rectangle should define a constructor that accepts two numbers for length and width,
// and sets those properties.

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int width, int length) {
        super(width, length);
    }

    //Methods
    public double getArea(){
        return this.width * this.length;
    };

    public double getPerimeter(){
        return this.width * 2 + this.length * 2;
    };

//    @Override
//    public int getPerimeter() {
//        return this.length * 2 + this.width * 2;
//        //perimeter = 2 x length + 2 x width
//    }

//    @Override
//    public int getArea() {
//        return this.length * this.width;
//        // area = length x width
//    }



    //fields
//    protected int width;
//    protected int length;
//
//    // constructor
//    public Rectangle(int width,int length){
//        this.width = width;
//        this.length = length;
//    }

    //Create two methods on the Rectangle class,
    // getArea and getPerimeter that return the respective values.
    // The formulas for both follow:
//    perimeter = 2 x length + 2 x width
//    area = length x width




};

