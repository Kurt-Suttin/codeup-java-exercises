public class ExceptionExercises {
    // STEP 1
    //
    //Create a static divideNums method that takes in two integer arguments. If the second argument is 0,
    // the method should throw an IllegalArgumentException with the message "Cannot divide be 0!"
    // If the second argument is not 0,
    // return the result of dividing the first input integer by the second input integer.
    public static int divideNums(int num1, int num2) {
        try {
            if (num2 == 0) {
                System.out.println("Cannot divide by 0!");
                return 0;
            }

            int result = num1 / num2;
            return result;

        } catch (IllegalArgumentException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(divideNums(20, 2));
        System.out.println(divideNums(30, 2));
        System.out.println(divideNums(1, 0));
    }
    //STEP 2
    //
    //Add a main method and try calling the divideNums method with various arguments, including 0 for the second argument. Is IllegalArgumentException a checked or unchecked exception?
}
