package homework_nr_11;

public class Person {
    String name;
    String surname;
    Integer age;
    boolean isPayedByHour;
    public Person (String name, String surname, Integer age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
