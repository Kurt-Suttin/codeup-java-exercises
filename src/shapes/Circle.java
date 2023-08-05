package shapes;

public class Circle {
    /// INSTANCES
    private double radius;
    private double area;
    private double circumference;
// CONSTRUCTOR
    public Circle(double radius) {
        this.radius = radius;

    }
// GETTERS
    public double getArea() {
        this.area = 3.14159265359 * Math.pow(radius, 2);
        return area;
    }

    public double getCircumference() {
        this.circumference = 2 * 3.14159265359 * radius;
        return circumference;
    }
}
