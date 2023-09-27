package homework_nr_7;

public abstract class Pensioned extends Person {
    int retireDate;
    int age;
    public Pensioned (String name, String surname, int retireDate, int age){
        super(name, surname);
        this.retireDate = retireDate;
        this.age = age;
    }
}
