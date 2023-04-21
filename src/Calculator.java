import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final PrintStream syso = System.out;
    private static final Scanner scan = new Scanner(System.in);
    private static final int EXIT = 0, INPUT_VALUES = 1, ADDITION = 2, SUBTRACTION = 3, MULTIPLICATION = 4, DIVISION = 5;
    private static float numX = 0f;
    private static float numY = 0f;

    public static void main(String args[]) {
        syso.println("SIMPLE CALCULATOR\nWritten by ARSHDEEP SINGH");
        while (true) generateMenu();
    }

    private static void generateMenu() {
        syso.println("""
                1. Input new X and Y
                2. X + Y
                3. X - Y
                4. X * Y
                5. X / Y
                0. Exit
                """);
        syso.println("Your choice -> ");
        try {
            int choice = scan.nextInt();
            if (choice < 0 || choice > 5) syso.println("Invalid input. Please choose again.");
            else {
                switch (choice) {
                    case EXIT -> System.exit(0);
                    case INPUT_VALUES -> inputNewValues();
                    case ADDITION -> syso.println(numX + "+ " + numY + " = " + (numX + numY));
                    case SUBTRACTION -> syso.println(numX + "- " + numY + " = " + (numX - numY));
                    case MULTIPLICATION -> syso.println(numX + "* " + numY + " = " + (numX * numY));
                    case DIVISION -> syso.println(numX + "/ " + numY + " = " + (numX / numY));
                }
            }
        } catch (InputMismatchException e) {
            scan.nextLine();
            syso.println("Invalid input. Please choose again.");
        }
    }

    private static void inputNewValues() {
        inputNumX();
        inputNumY();
    }

    private static void inputNumX() {
        syso.println("Please enter float value for X: ");
        try {
            numX = scan.nextFloat();
            syso.println("Value of X updated to: " + numX);
        } catch (InputMismatchException e) {
            scan.nextLine();
            syso.println("Invalid input");
            inputNumX();
        }
    }

    private static void inputNumY() {
        syso.println("Please enter float value for Y: ");
        try {
            numY = scan.nextFloat();
            syso.println("Value of Y updated to: " + numY);
        } catch (InputMismatchException e) {
            scan.nextLine();
            syso.println("Invalid input");
            inputNumY();
        }
    }
}
