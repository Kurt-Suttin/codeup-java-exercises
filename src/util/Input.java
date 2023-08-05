package util;

import java.util.Scanner;

//When an instance of this object is created,
// the scanner field should be set to a new instance of the Scanner class.
// The class should have the following methods,
// all of which return command line input from the user:


//////

//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
public class Input {

    public static void main(String[] args) {

    }

    private Scanner scanner;

    public Input() {
       this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("[Y/n]");
        // get user input
        String answer = scanner.nextLine();
        // return true if the string is "y" or "yes" (case-insensitive)
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            // else return false if the string is "n" or anything else
            return false;
        }
    }
//    The getInt(int min, int max) method should keep prompting
//    the user for input until they give an integer within the min and max.

    public int getInt() {
        System.out.println("enter any Integer");
        int number;
        number = scanner.nextInt();
        return number;
    }

    public int getInt(int min, int max) {
        int number;

        do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            /// has next Int to check if number , return boolean
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input from the scanner buffer
            }
            number = scanner.nextInt();
        } while (number < min || number > max);

        return number;
    }


    //    The getDouble method should do the same thing, but with decimal numbers.
    public double getDouble() {
        System.out.println("enter any number at all");
        int number;
        number = scanner.nextInt();
        return number;
    }

    public double getDouble(double min, double max) {
        double number;

        do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            /// has next Double to check if number , return boolean
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter an Number.");
                scanner.next(); // Clear the invalid input from the scanner buffer
            }
            number = scanner.nextDouble();
        } while (number < min || number > max);

        return number;
    }


//    Create another class named
//    InputTest that has a static main method that uses all the methods from the Input class.
}
