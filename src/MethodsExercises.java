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
    public static int Addition(int numOne , int numTwo) {
        int addedSum = numOne + numTwo;
        return addedSum;
    }


    public static int Subtraction(int numOne , int numTwo) {
        int subtractedSum = numOne - numTwo;
        return subtractedSum;
    }


    public static int Multiplication(int numOne , int numTwo) {
        int multipliedSum = numOne * numTwo;
        return multipliedSum;
    }


    public static String Division(int numOne , int numTwo) {

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


    }
}
