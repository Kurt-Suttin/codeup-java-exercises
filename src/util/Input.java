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
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    boolean yesNo() {
        // get user input
        String answer = scanner.nextLine();
        /// return true if string == yes
        if (answer.equalsIgnoreCase("y")) {
            return true;
            // else return false if string == no
        } else return false;

    }
//    The getInt(int min, int max) method should keep prompting
//    the user for input until they give an integer within the min and max.


    int getInt(int min, int max) {
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

    double getDouble(double min, double max) {
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

}
