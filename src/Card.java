import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Card {

    public int cardValue;
    private final int MAX_VALUE = 52, NIN_VALUE = 1;
    private static final PrintStream syso = System.out;
    private static final Scanner scan = new Scanner(System.in);

    public Card() {
        cardValue = (int) (Math.random() * MAX_VALUE) + NIN_VALUE;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int newValue) {
            if (newValue>1 && newValue< 53) {
                cardValue = newValue;

            }else {
                syso.println("Invalid input.");
                checkValue();
            }

        }
        private void checkValue(){
            syso.println("Please enter a number between 1 and 52 (inclusive): ");
            try {
                setCardValue(scan.nextInt());
                syso.println("Value set successfully.");

            } catch (InputMismatchException e) {
                scan.nextLine();
                syso.println("Invalid input.");
                checkValue();
            }
        }

}
