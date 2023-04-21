public class Dog {
    private String dogName;
    private int dogAge;
    private int personYears;

    public Dog(String name, int age) {
        dogName = name;
        dogAge = age;
        setPersonYears();
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String name) {
        dogName = name;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int age) {
        dogAge = age;
        setPersonYears();
    }

    private  void setPersonYears() {
        personYears = dogAge * 7;
    }

    private int getPersonYears() {
        return personYears;
    }

    public String toString() {
        return "\ndogName: " + getDogName() +
                "\ndogAge: " + getDogAge() +
                "\nhumanYears=" + getPersonYears();
    }

    public void showPersonYears() {
        System.out.print("\n" + dogName + "'s age in person years is: " + personYears);
    }
}
