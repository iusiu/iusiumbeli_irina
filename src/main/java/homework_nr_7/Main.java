package homework_nr_7;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager("Sara", "Sim","AVG", 4,"Loading");
        Programmer programmer = new Programmer("Jane", "Dim", "Global", "Java", 5);
        manager.printMyName();
        manager.work();
        programmer.printMyName();
        programmer.work();
        Person[] persons = new Person[]{manager, programmer};
        printAllPersons(persons);
        callMethodWorkFromManager(persons);

    }
    public static void printAllPersons(Person [] persons) {
        for (int index = 0; index != persons.length; index++) {
            System.out.println(persons[index].name);
        }
    }

    public static void callMethodWorkFromManager(Person [] persons) {
        for (int index = 0; index != persons.length; index++) {
            if (persons[index] instanceof Manager tempObject) {
                tempObject.work();
            }
        }
    }
}
