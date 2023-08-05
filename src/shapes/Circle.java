package shapes;

public class Circle {
    // Private field to store the radius of the circle
    private double radius;

    // Private fields to store the calculated area and circumference
    private double area;
    private double circumference;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        this.area = 3.14159265359 * Math.pow(radius, 2);
        return area;
    }

    // Method to calculate and return the circumference of the circle
    public double getCircumference() {
        this.circumference = 2 * 3.14159265359 * radius;
        return circumference;
    }
}
