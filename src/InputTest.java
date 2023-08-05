import shapes.Circle;
import util.Input;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("enter in a sentence.");
        Input userString = new Input();
        String usersStringResult = userString.getString();
        System.out.println(usersStringResult);
/////////MIN MAX
        Input userNumberRange = new Input();
        int userNumberRangeResult = userNumberRange.getInt(1, 100);
        System.out.println(userNumberRangeResult);

///////////GET INT
        Input userNumber = new Input();
        int userNumberResult = userNumber.getInt();
        System.out.println(userNumberResult);


        Input userBoolean = new Input();
        boolean userBooleanResult = userBoolean.yesNo();
        System.out.println(userBooleanResult);
/////////MIN MAX
        Input userDoubleRange = new Input();
        double userDoubleRangeResult = userDoubleRange.getDouble(1.0, 100.00);
        System.out.println(userDoubleRangeResult);

///////// GET DOUBLE
        Input userDouble = new Input();
        double userDoubleResult = userDouble.getDouble();
        System.out.println(userDoubleResult);
    }


    Circle firstCircle = new Circle(4.0);



//    int firstCircleRadius = firstCircle.getArea();
//    System.out.println();
}
