package shapes;

public class Circle {
//    Inside of src, create a package named shapes.
//    Inside of shapes, create a class named shapes.Circle.
//    This class should have a private radius field that is set through the constructor,
//    and various methods for getting information about the circle, detailed below.

    private double radius;

    private double area;

    private double circumference;
/// INSTANCES
/// circumference = 2 x pi x radius
//  area = pi x (radius ^ 2)
    public Circle(double radius) {
        this.radius = radius;
        System.out.println(radius);
    }


    public double getArea(double radius){
        this.radius = radius;
        double areaResult = 3.14159265359 * (Math.pow(radius, 2));
        System.out.println(areaResult);
        return areaResult;
    }


//    circumference = 2 x pi x radius

    public double getCircumference(double radius){
        this.radius = radius;
        double circumference = 2 * this.area;
    }



}
