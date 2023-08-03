
//    TODO: Write a method, returnName, that returns the string of your name. DONE
//    TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.DONE
//    TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.DONE
//    TODO: !! Complete math exercises from the curriculum !! DONE


import java.util.Scanner;

public class MethodPractice {

//    public static String returnName() {
//        System.out.println("enter your name");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        scanner.close();
//        String trimmedInput = userInput.trim();
//        return trimmedInput;
//    }

//    public static String returnLongerString() {
//
//        Scanner scanner = new Scanner(System.in);
//        // take in 2 strings
//        System.out.println("Enter the first string:");
//        String str1 = scanner.nextLine();
//        System.out.println("Enter the second string:");
//        String str2 = scanner.nextLine();
//        // return longest of strings
//        if (str1.length() > str2.length()) {
//            return str1;
//        } else if (str2.length() > str1.length()) {
//            return str2;
//        } else {
//            return "Both strings are of equal length.";
//        }
//    }


    public static boolean canBeHalved(int userInput) {
        // check if the input number is divisible by 2
        if (userInput % 2 == 0) {
            int halvedNumber = userInput / 2;
            System.out.println("Half of " + userInput + " is: " + halvedNumber + " , so your number can be halved.");
            return true;
        } else {
            System.out.println("Your number cannot be halved.");
            return false;
        }
    }

    public static void main(String[] args) {

//        // Declare a var to returned value by calling Method Name
//
//        String name = returnName();
//        System.out.println("Your name is : " + name);
//
//        // Declare a var to returned value by calling Method Name
//        String longerString = returnLongerString();
//        System.out.println(longerString);
//


        // get user number
        System.out.println("Enter a number you would like to halve:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        scanner.close();

        // Call the method and store the result in a variable
        boolean isHalved = canBeHalved(userInput);
        System.out.println(isHalved);

    }

}

