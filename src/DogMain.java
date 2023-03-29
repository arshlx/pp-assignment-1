import java.io.PrintStream;

public class DogMain {
    private static final PrintStream syso = System.out;
    private static Dog dog1, dog2, dog3;

    public static void main(String[] args) {
        dog1 = new Dog("Tommy", 2);
        dog2 = new Dog("Scooby", 5);
        dog3 = new Dog("Scrapy", 9);
        showDogValues();
        showDogPersonYears();
        changeDogValues();
        showDogValues();
        showDogPersonYears();
    }

    private static void showDogValues(){
        syso.print(dog1);
        syso.print("\n" + dog2);
        syso.print("\n" + dog3);
    }

    private static void showDogPersonYears(){
        dog1.showPersonYears();
        dog2.showPersonYears();
        dog3.showPersonYears();
    }
    private static void changeDogValues(){
        dog1.setDogName("Jimmy");
        dog2.setDogAge(10);
        dog3.setDogName("Wangcai");
        dog3.setDogAge(1);
    }
}
