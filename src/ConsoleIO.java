import java.util.Scanner;
public class ConsoleIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }
}
