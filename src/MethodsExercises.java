//Basic Arithmetic
//
//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
//Subtraction
//Multiplication
//Division
//Each function needs to take two parameters/arguments so that the operation can be performed.
//
//Test your methods and verify the output.
//
//Add a modulus method that finds the modulus of two numbers.
//
//Food for thought: What happens if we try to divide by zero? What should happen?


//
///Create a method that validates that user input is in a certain range
// and returns that input as an integer if it is within the given range.
// If not, prompt the user to input their number again until the input is within range.
//
//The method signature should look like this:

//
//* OVERLOAD MINI-EXERCISES
//        */
//


//
//// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

/// Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:

import java.util.Scanner;

public class MethodsExercises {
    //// TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
////  a greeting message to the user by either their first or first and last name.
//
//// example: sayName("Justin") - "Hi Justin"
//// example: sayName("Justin", "Reich") - "Hi Justin Reich"
    public static String sayName(String firstName, String lastName) {
        return "Hi " + firstName + " " + lastName + "!";
    }


    /////METHODS
    // question 1.a
    public static int Addition(int numOne, int numTwo) {
        int addedSum = numOne + numTwo;
        return addedSum;
    }

    // question 1.b
    public static int Subtraction(int numOne, int numTwo) {
        int subtractedSum = numOne - numTwo;
        return subtractedSum;
    }

    // question 1.c
    public static int Multiplication(int numOne, int numTwo) {
        int multipliedSum = numOne * numTwo;
        return multipliedSum;
    }

    // question 1.d
    public static String Division(int numOne, int numTwo) {

        if (numTwo == 0) {
            return "Zero Division error : Program Crash Prevented ";
        } else {
            int dividedSum = numOne / numTwo;
            // get sum in String form
            return String.valueOf(dividedSum);
        }
    }

    ///// Question 2
    
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        while (integer <= min && integer >= max) {
            System.out.println("Invalid input. Please try again.");
            integer = scanner.nextInt();
        }
        return integer;
    }


//    public static String sayName(String name) {
//        return "Hi " + name + "!";
//    }


    ///Question 3
    public static long calculateFactorial(int num) {

        // Check if the input number is within the valid range (1 to 10)
        if (num < 1 || num > 10) {
            System.out.println("Please enter an integer between 1 and 10.");
            return -1; // You can use -1 to indicate an invalid input.
        }
        // Calculate the factorial using a for loop
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }


    ///////////MATH
    ////// MAIN
////////// MAIN
    ////// MAIN
    public static void main(String[] args) {

//        String greeting = sayName("kurt","suttin");
//        System.out.println(greeting);

/////////////////////////////////// QUESTION ONE

//        System.out.println("Enter Two Numbers");
//        Scanner scanner = new Scanner(System.in);
//        int numOne = scanner.nextInt();
//        int numTwo = scanner.nextInt();
//        System.out.println(Addition(numOne,numTwo));


//        System.out.println("Enter Two Numbers");
//        Scanner scanner = new Scanner(System.in);
//        int numOne = scanner.nextInt();
//        int numTwo = scanner.nextInt();
//        System.out.println(Subtraction(numOne,numTwo));


//        System.out.println("Enter Two Numbers");
//        Scanner scanner = new Scanner(System.in);
//        int numOne = scanner.nextInt();
//        int numTwo = scanner.nextInt();
//        System.out.println(Multiplication(numOne,numTwo));

//        System.out.println("Enter Two Numbers");
//        Scanner scanner = new Scanner(System.in);
//        int numOne = scanner.nextInt();
//        int numTwo = scanner.nextInt();
//        System.out.println(Division(numOne,numTwo));

/////////////////////////////////// QUESTION TWO

//        System.out.println("Enter a number between 1 and 100: ");
//        int userInput = getInteger(1, 100);
//        System.out.println("You entered: " + userInput);

//


////////////////////////////////////////////////////
//        QUESTION 3
        Scanner scanner = new Scanner(System.in);
        char continueInput = 'Y';

        do {
            // Prompt the user to enter an integer from 1 to 10.
            System.out.println("Enter an integer from 1 to 10: ");
            int userInput = scanner.nextInt();

            // Calculate the factorial and display the result
            long result = calculateFactorial(userInput);
            if (result != -1) {
                System.out.println("The factorial of " + userInput + " is: " + result);
            }

            // Ask the user if they want to continue
            System.out.println("Would you like to continue? [Y/n]");
            scanner.nextLine();
            String yesOrNo = scanner.nextLine();
            continueInput = yesOrNo.toUpperCase().charAt(0);

        } while (continueInput == 'Y');

////////////////////////////////////////////////////


    }
}

