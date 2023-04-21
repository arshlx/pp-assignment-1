import java.io.PrintStream;

public class DogMain {
    private static final PrintStream syso = System.out;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy", 2);
        Dog dog2 = new Dog("Scooby", 5);
        Dog dog3 = new Dog("Scrapy", 9);

        //show instance variable values
        syso.println(dog1);
        syso.println(dog2);
        syso.println(dog3);

        //show dog person years
        dog1.showPersonYears();
        dog2.showPersonYears();
        dog3.showPersonYears();

        //change values
        dog1.setDogName("Jimmy");
        dog2.setDogAge(10);
        dog3.setDogName("Wangcai");
        dog3.setDogAge(1);

        //showing values again
        syso.println(dog1);
        syso.println(dog2);
        syso.println(dog3);

        //showing person years
        dog1.showPersonYears();
        dog2.showPersonYears();
        dog3.showPersonYears();
    }

}
