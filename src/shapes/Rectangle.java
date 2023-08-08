package shapes;
// It should have protected properties for both length and width.
// Rectangle should define a constructor that accepts two numbers for length and width,
// and sets those properties.

public class Rectangle{

    //fields
    protected int width;
    protected int length;

    // constructor
    public Rectangle(int width,int length){
        this.width = width;
        this.length = length;
    }

    //Create two methods on the Rectangle class,
    // getArea and getPerimeter that return the respective values.
    // The formulas for both follow:
//    perimeter = 2 x length + 2 x width
//    area = length x width

    //Methods
    public int getArea(){
        return this.width * this.length;
    };

    public int getPerimeter(){
        return this.width * 2 + this.length * 2;
    };



};

