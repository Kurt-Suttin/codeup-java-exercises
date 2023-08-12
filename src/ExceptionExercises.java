public class ExceptionExercises {
    // STEP 1
    //
    //Create a static divideNums method that takes in two integer arguments. If the second argument is 0,
    // the method should throw an IllegalArgumentException with the message "Cannot divide be 0!"
    // If the second argument is not 0,
    // return the result of dividing the first input integer by the second input integer.


    public static int divideNums(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(divideNums(20, 2));
            System.out.println(divideNums(30, 2));
            System.out.println(divideNums(1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        delayedHello(1000);
        delayedHello(1000);
        delayedHello(3000);


    }

    //STEP 2
    //
    //Add a main method and try calling the divideNums method with various arguments, including 0 for the second argument. Is IllegalArgumentException a checked or unchecked exception?

    public static void delayedHello(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World");
    }

}
