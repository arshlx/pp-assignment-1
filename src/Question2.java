import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    private static final PrintStream syso = System.out;
    private static final Scanner scan = new Scanner(System.in);
    private static int typingSpeed, numCharacters;

    public static void main(String[] args) {
        enterTypingSpeed();
        enterCharacterCount();
        syso.print("\nIt will take " + ((float) numCharacters / typingSpeed) + " minute(s) OR, " + ((float) (numCharacters / typingSpeed) * 60) + " second(s) to type " + numCharacters + " characters at a typing speed of " + typingSpeed + " characters per minute.");
    }

    private static void enterTypingSpeed() {
        syso.print("Please enter the typing speed in characters per minute: ");
        //Error handling for invalid input
        try {
            typingSpeed = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.nextLine();
            syso.println("Invalid input, please try again.");
            enterTypingSpeed();
        }
    }

    private static void enterCharacterCount() {
        syso.print("\nPlease enter the number of characters in the document: ");
        //Error handling for invalid input
        try {
            numCharacters = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.nextLine();
            syso.println("Invalid input, please try again.");
            enterCharacterCount();
        }
    }
}
