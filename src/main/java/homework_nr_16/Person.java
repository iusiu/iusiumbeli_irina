package homework_nr_16;

public class Person {
    String name;
    int age;
    Float average;

    public Person (String name, int age, Float average){
        this.name = name;
        this.age = age;
        this.average = average;
    }

    @Override
    public String toString() {
        return  name + "," +
                age + "," +
                average;
    }
}
