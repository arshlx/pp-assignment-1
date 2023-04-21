import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class Question4 {

    private static final PrintStream syso = System.out;
    private static final Scanner scan = new Scanner(System.in);
    private static final int MIN = 11, MAX = 77, EXIT_CODE = 0;
    private static int generatedNum, guessedNum;
    private static int numCorrect = 0;
    private static boolean exit = false;

    public static void main(String args[]) {
        syso.println("""
                ********Welcome to HiLo********
                For this game, I will choose a number 11 (inclusive) and 88 (exclusive) at random, and you have to guess it!
                If you guess it correctly, you get a point!
                You can enter guessed number as -1 to exit the game.
                If you guess incorrectly, you get to go again. So, let's start?""");

        while (!exit) generateRandomNum();
    }

    public static void generateRandomNum() {
        syso.println();
        generatedNum = (int) (Math.random() * MAX) + MIN;
        syso.print("Enter your guess [" + generatedNum + "] (0 to quit): ");
        try {
            guessedNum = scan.nextInt();
            result();
        } catch (InputMismatchException e) {
            scan.nextLine();
            syso.println("Invalid Entry, let's try again!");
        }
    }

    public static void result() {
        if (guessedNum == generatedNum) {
            syso.print("You guessed correctly!\nTotal number of points (correct guesses): " + (++numCorrect));

        } else if (guessedNum == EXIT_CODE) {
            exit = true;
        } else if (guessedNum < generatedNum) {
            syso.println("Your guess was too LOW.");
        } else if (guessedNum > generatedNum) {
            syso.println("Your guess was too HIGH.");
        }
        if (!exit) goAgain();

    }

    private static void goAgain() {
        var isValid = false;
        for (; !isValid; ) {
            syso.print("\nWould you like to go again (y/n): ");
            var choice = scan.next().toLowerCase().charAt(0);
            switch (choice) {
                case 'n' -> {
                    exit = true;
                    isValid = true;
                }
                case 'y' -> {
                    syso.println("Let's play again!");
                    isValid = true;
                }
                default -> syso.println("Invalid entry.");
            }
        }

    }
}
