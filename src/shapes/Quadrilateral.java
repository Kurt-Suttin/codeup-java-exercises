package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    // protected properties for length and width.

    protected int length;
    protected int width;

    // a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // methods for getting the length and width.

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

//    @Override
//    public double getPerimeter() {
//        return this.length * 2 + this.width * 2;
//        //perimeter = 2 x length + 2 x width
//    }

//    @Override
//    public double getArea() {
//        return this.length * this.width;
//        // area = length x width
//    }


    // abstract methods for setting the length and width.


}
