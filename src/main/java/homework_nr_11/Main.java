package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Pavel", "Dubrovski",26, false);
        Person p2 = new Person("Vera", "Huk",20, true);
        Person p3 = new Person("Dmitri", "Viraj",32, true);
        Person p4 = new Person("Valentin", "Amster",36, true);
        Person p5 = new Person("Grigori", "Artist",45, true);
        Person p6 = new Person("Evgheni", "Riba",26, true);
        Person p7 = new Person("Veronika", "Saleami",37, true);
        Person p8 = new Person("Roman", "Zira",46, true);
        Person p9 = new Person("Anna", "Fomina",12, false);
        Person p10 = new Person("Denis", "Solker",14, false);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);

        //Display on screen 5 unique employees which are older than 25 y.o. & is paid by hour

        System.out.println("The 5 unique employees which are older than 25 y.o. & is paid by hour: ");
        personList.stream()
                .filter(e -> e.age > 25 && e.isPayedByHour)
                .map(e -> e.name)
                .distinct()
                .limit(5)
                .forEach(e -> System.out.println(e));
        System.out.println();


        //Add in new List employees older than 30 y.o & which surname begins with "A"

        List<Person> personList1 = personList.stream()
                .filter(e -> e.age > 30 && e.surname.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("A list with employees older than 30 y.o & which surname begins with A");
        System.out.println(personList1);
        System.out.println();

        //The first employee who is 37 y.o.

        Optional<Person> optionalAge = personList.stream()
                .filter(e -> e.age == 37)
                .findFirst();
        System.out.println("The first employee who is 37 y.o. is: ");
        if (optionalAge.isPresent()){
            System.out.println(optionalAge.get().name);
        }
    }
}
