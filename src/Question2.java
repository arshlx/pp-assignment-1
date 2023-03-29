import java.io.PrintStream;
import java.util.Scanner;

public class Question2 {
    private static final PrintStream syso = System.out;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        syso.print("Please enter the typing speed in words per minute: ");
        int typingSpeed = scan.nextInt();
        syso.print("\nPlease enter the number of words in the document: ");
        int numCharacters = scan.nextInt();
        float timeToType = numCharacters / typingSpeed;
        syso.print("\nThe time it will take to type " + numCharacters + " words at a typing speed of " + typingSpeed + " words per minute is " + timeToType + " minute(s) or " + timeToType * 60 + " seconds(s)");
    }
}
