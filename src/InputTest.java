import util.Input;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("enter in a sentence.");
        Input userString = new Input();
        String usersStringResult = userString.getString();
        System.out.println(usersStringResult);

        Input userNumber = new Input();
        int userNumberResult = userNumber.getInt(1,100);
        System.out.println(userNumberResult);

        Input userBoolean = new Input();
        boolean userBooleanResult = userBoolean.yesNo();
        System.out.println(userBooleanResult);

    }
}
