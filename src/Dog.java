public class Dog {
    String dogName;
    int dogAge;
    int personYears;

    Dog(String name, int age) {
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

    private void setPersonYears() {
        personYears = dogAge * 7;
    }

    public String toString() {
        return "Dog{" +
                "\ndogName='" + dogName + '\'' +
                ", \ndogAge=" + dogAge +
                ", \nhumanYears=" + personYears +
                "\n}";
    }

    void showPersonYears() {
        System.out.print("\n" + dogName + "'s age in person years is: " + personYears);
    }
}
