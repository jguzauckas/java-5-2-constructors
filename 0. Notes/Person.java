public class Person {
    private String name;
    private int age;
    private double heightInches;

    public Person() {
        name = "";
        age = -1;
        heightInches = -1.0;
    }

    public Person(String n, int a, double h) {
        name = n;
        age = a;
        heightInches = h;
    }
}
