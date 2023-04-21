import java.io.PrintStream;

public class PairOfCards {
    private static final int MAX_VALUE = 52, NIN_VALUE = 1;
    private static final PrintStream syso = System.out;
    public static Card card1 = new Card();
    public static Card card2 = new Card();

    public static void main(String args[]) {
        PairOfCards cardPair = new PairOfCards();
        syso.println("Current card 1 value is: " + getCard1Value());
        syso.println("Current card 2 value is: " + getCard2Value());
        syso.println("Current sum of both card values is: " + sumOfCards());
        syso.println("Randomizing card 1.");
        randomizeCard1();
        syso.println("New card 1 value is: " + getCard1Value());
        syso.println("Randomizing card 2.");
        randomizeCard2();
        syso.println("New card 2 value is: " + getCard2Value());
        syso.println("Randomizing both cards together");
        randomizeBothCards();
        syso.println("New card 1 value is: " + getCard1Value());
        syso.println("New card 2 value is: " + getCard2Value());
        syso.println("New sum of both card values is: " + sumOfCards());
    }

    public static int getCard1Value() {
        return card1.cardValue;
    }

    public static void setCard1Value(int newValue) {
        card1.setCardValue(newValue);
    }

    public static int getCard2Value() {
        return card2.cardValue;
    }

    public static void setCard2Value(int newValue) {
        card2.setCardValue(newValue);
    }

    public static void randomizeCard1() {
        setCard1Value(randomNumber());
    }

    public static void randomizeCard2() {
        setCard2Value(randomNumber());
    }

    public static void randomizeBothCards() {
        randomizeCard1();
        randomizeCard2();
    }

    public static int sumOfCards() {
        return card1.getCardValue() + card2.getCardValue();
    }

    private static int randomNumber() {
        return (int) (Math.random() * MAX_VALUE) + NIN_VALUE;
    }
}
