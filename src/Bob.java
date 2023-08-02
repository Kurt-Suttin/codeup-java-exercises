import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Store user input
            String userInput = scanner.nextLine();

            // Trim the input to remove leading/trailing whitespaces
            String trimmedInput = userInput.trim();

            // Check if the input is empty
            if (trimmedInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (trimmedInput.contains("?")) {
                System.out.println("Sure.");
            } else if (trimmedInput.contains("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
        }
    }
}




