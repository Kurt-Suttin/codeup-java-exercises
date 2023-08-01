import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n" , pi);
//////
// Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.println();
//        Scanner sc = new Scanner(System.in);



//     Scanner sc = new Scanner(System.in);
//     System.out.println("what is pi ?\n");
//        double userInput = sc.nextDouble();
//        System.out.println("you said pi is " + userInput);

/////////
//        Prompt a user to enter 3 words, and store each of them in a separate variable.
//        Then, display them back in the console, each on a newline.
        System.out.println("Enter 3 words");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        System.out.printf("your words were %s, %s, and %s, ",word1,word2,word3);
///
        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
//        System.out.println("Enter a sentence");
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.next();
//        System.out.printf("you typed: %s",sentence);
        /////
//        Rewrite the above example using the nextLine method.
//        System.out.println("Enter a sentence");
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.nextLine();
//        System.out.printf("you typed: %s",sentence);


        ///////


//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//        System.out.println("whats the length of the classroom");
//        Scanner scanner = new Scanner(System.in);
//        String lengthStr = scanner.nextLine();
//        System.out.println("What's the width of the classroom?");
//        String widthStr = scanner.nextLine();


//     Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.

//        int length = Integer.parseInt(lengthStr); // Parse the string to an integer
//
//        int width = Integer.parseInt(widthStr); // Parse the string to an integer
//
//        int area = width * length;
//
//        int perimeter = (width * 2) + (length * 2);
////
//////      Display the area and perimeter of that classroom.
//
//        System.out.println("the area of that classroom is " + area);
//        System.out.println("the perimeter of that classroom is " + perimeter);

    }
}
