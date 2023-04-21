import java.io.PrintStream;

public class PairOfCards {
    private static final int MAX_VALUE = 52, NIN_VALUE = 1;
    private static final PrintStream syso = System.out;
    public static Card card1 = new Card();
    public static Card card2 = new Card();

    public static void main(String args[]) {
        //instantiating cardPair
        PairOfCards cardPair = new PairOfCards();

        //printing cardPair values
        syso.println("Current card 1 value is: " + cardPair.getCard1Value());
        syso.println("Current card 2 value is: " + cardPair.getCard2Value());
        syso.println("Current sum of both card values is: " + cardPair.sumOfCards());

        //randomizing card 1
        syso.println("Randomizing card 1.");
        cardPair.randomizeCard1();

        //printing new card 1 value
        syso.println("New card 1 value is: " + cardPair.getCard1Value());


        //randomizing card 2
        syso.println("Randomizing card 2.");
        cardPair.randomizeCard2();

        //printing new card 2 value
        syso.println("New card 2 value is: " + cardPair.getCard2Value());

        //randomizing both cards together
        syso.println("Randomizing both cards together");
        cardPair.randomizeBothCards();

        //printing values for both cards
        syso.println("New card 1 value is: " + cardPair.getCard1Value());
        syso.println("New card 2 value is: " + cardPair.getCard2Value());
        syso.println("New sum of both card values is: " + cardPair.sumOfCards());
    }

    private static int randomNumber() {
        return (int) (Math.random() * MAX_VALUE) + NIN_VALUE;
    }

    public int getCard1Value() {
        return card1.cardValue;
    }

    public static void setCard1Value(int newValue) {
        card1.setCardValue(newValue);
    }

    public int getCard2Value() {
        return card2.cardValue;
    }

    public static void setCard2Value(int newValue) {
        card2.setCardValue(newValue);
    }

    public void randomizeCard1() {
        setCard1Value(randomNumber());
    }

    public void randomizeCard2() {
        setCard2Value(randomNumber());
    }

    public void randomizeBothCards() {
        randomizeCard1();
        randomizeCard2();
    }

    public int sumOfCards() {
        return card1.getCardValue() + card2.getCardValue();
    }
}
