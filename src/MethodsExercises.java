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

import java.util.Scanner;

public class MethodsExercises {
    /////METHODS
    public static int Addition() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int addedSum = numOne + numTwo;
        return addedSum;
    }


    public static int Subtraction() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int subtractedSum = numOne - numTwo;
        return subtractedSum;
    }

    public static int Multiplication() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int multipliedSum = numOne * numTwo;
        return multipliedSum;
    }


    public static String Division() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        if (numTwo == 0) {
            return "Zero Division error : Program Crash Prevented ";
        } else {
            int dividedSum = numOne / numTwo;
            // get sum in String form
            return String.valueOf(dividedSum);
        }
    }

    ;

    ////// MAIN
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        int addedNumbers = Addition();
        System.out.println(addedNumbers);


        System.out.println("Enter Two Numbers");
        int subtractedNumbers = Subtraction();
        System.out.println(subtractedNumbers);

        System.out.println("Enter Two Numbers");
        int multipliedSumOfNumbers = Multiplication();
        System.out.println(multipliedSumOfNumbers);

        System.out.println("Enter Two Numbers");
        String dividedNumbers = Division();
        System.out.println(dividedNumbers);


    }
}
