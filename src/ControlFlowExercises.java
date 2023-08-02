import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Create an integer variable i with a value of 5.
//        int i = 5;
//
//        // Create a while loop that runs so long as i is less than or equal to 15
//        while (i <= 15) {
//            // Output the current value of i
//            System.out.println(i);
//
//            // Increment i by one in each loop iteration
//            i++;
//        }

        //Do While
//        int i = -2;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i <= 98);


        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        //Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);


        //Create a do-while loop that starts at 2,
        // and displays the number squared on each line while the number is less than 1,000,000.
//        output should equal
//        2
//        4
//        16
//        256
//        65536
//
//        double i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//            // how to get squared
//        } while (i <= 100000);


        /////
//        "REFACTOR THE PREVIOUS TWO EXERCISES TO USE A FOR LOOP INSTEAD."

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        };


//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        };

////////

//        for (double i = 2; i <= 100000; i *= i) {
//            System.out.println(i);
//        };

//Fizzbuzz

//
//One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//

//Write a program that prints the numbers from 1 to 100.
//For multiples of three: print “Fizz” instead of the number.
//For the multiples of five: print “Buzz”.
//For numbers which are multiples of both three and five: print “FizzBuzz”.


//            for (int x = 0; x <= 100; x++) {
//                if (x % 15 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (x % 5 == 0) {
//                    System.out.println("Buzz");
//                } else if (x % 3 == 0) {
//                    System.out.println("Fizz");
//                } else {
//                    System.out.println(x);
//                }
//            }

        //////////
        //////////
//Display a table of powers.
//
//Prompt the user to enter an integer.

//Display a table of squares and cubes from 1 to the value entered.

//Ask if the user wants to continue.

//Assume that the user will enter valid data.

//Only continue if the user agrees to.


//        System.out.println("enter an number");
//        Scanner scannerOne = new Scanner(System.in);
//        int usersInt = Integer.parseInt(scannerOne.nextLine());
//        System.out.println("number | squared | cubed ");
//        System.out.println("_________________________");
//
//        for (int i = 1; i < usersInt; i++) {
//            int square = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%-6d | %-7d | %-5d\n", i, square, cubed);
//        }
//        System.out.println("Would you like to continue? Yes / No");
//        Scanner scannerTwo = new Scanner(System.in);
//        String userResponse = scannerTwo.nextLine();
//        if (userResponse.equalsIgnoreCase("yes")) {
//            System.out.println("Awesome lets continue");
//
//            System.out.println("enter an number");
//            Scanner scannerLoop = new Scanner(System.in);
//            int usersIntLoop = Integer.parseInt(scannerOne.nextLine());
//            System.out.println("number | squared | cubed ");
//            System.out.println("_________________________");
//
//            for (int i = 1; i < usersInt; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-5d\n", i, square, cubed);
//            }
//        } else {
//            System.out.println("Bye Bye");
//        }
//////////////////////////////////////////////
        
//        Scanner scanner = new Scanner(System.in);
//        String userConfirmation = "y";
//        while(userConfirmation.equalsIgnoreCase("y")){
//            System.out.println("Enter a grade between 0 and 100.");
//            int userGrade = scanner.nextInt();
//            if(userGrade >= 97 && userGrade <=100){
//                System.out.println("Your letter grade is an A+.");
//            } else if (userGrade >= 93 && userGrade <= 96) {
//                System.out.println("Your letter grade is a A.");
//            } else if (userGrade >= 90 && userGrade <= 92) {
//                System.out.println("Your letter grade is a A-.");
//            } else if (userGrade >= 87 && userGrade <= 89) {
//                System.out.println("Your letter grade is a B+.");
//            } else if (userGrade >= 83 && userGrade <= 86) {
//                System.out.println("Your letter grade is a B.");
//            } else if (userGrade >= 80 && userGrade <= 82) {
//                System.out.println("Your letter grade is a B-.");
//            } else if (userGrade >= 77 && userGrade <= 79) {
//                System.out.println("Your letter grade is a C-.");
//            } else if (userGrade >= 73 && userGrade <= 76) {
//                System.out.println("Your letter grade is a C.");
//            } else if (userGrade >= 70 && userGrade <= 72) {
//                System.out.println("Your letter grade is a C-.");
//            } else if (userGrade >= 67 && userGrade <= 69) {
//                System.out.println("Your letter grade is a D+.");
//            } else if (userGrade >= 65 && userGrade <= 66) {
//                System.out.println("Your letter grade is a D.");
//            } else if (userGrade >= 60 && userGrade <= 64) {
//                System.out.println("Your letter grade is a D-.");
//            } else if (userGrade <= 59) {
//                System.out.println("Your letter grade is F.");
//            } else{
//                System.out.println("Please enter a valid numerical integer between 0 and 100");
//            }
//
//            System.out.println("Would you like to continue converting your numerical grades to letter grades? (Y/N)");
//            userConfirmation = scanner.next();
//            System.out.println();
//        }



    }

}
