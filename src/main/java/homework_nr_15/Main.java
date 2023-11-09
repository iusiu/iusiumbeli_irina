package homework_nr_15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(1967, "Ferrari");
        Car c2 = new Car(2020, "Audi");
        Car c3 = new Car(2018, "BMW");
        Car c4 = new Car(2015, "Mustang");
        Car c5 = new Car(2022, "Mercedes");

        Set<Car> carSet = new HashSet<>();
        carSet.add(c1);
        carSet.add(c2);
        carSet.add(c3);
        carSet.add(c4);
        carSet.add(c5);

        //HashSet + compareTo method
        System.out.println("------ Comparing HashSet with method compareTo");
        carSet.stream()
                .sorted()
                .forEach(e -> System.out.println(e));

        Set<Car> carSet1 = new TreeSet<>();
        carSet1.add(c1);
        carSet1.add(c2);
        carSet1.add(c3);
        carSet1.add(c4);
        carSet1.add(c5);

        //TreeSet + Comparator
        System.out.println("------ Comparing by Name TreeSet with Comparator");
        carSet1.stream()
                .sorted(ComparingWithComparator.SORT_BY_NAME.getComparator())
                .forEach(e -> System.out.println(e));

        System.out.println("------ Comparing by YearMade TreeSet with Comparator");
        carSet1.stream()
                .sorted(ComparingWithComparator.SORT_BY_YEARMADE.getComparator())
                .forEach(e -> System.out.println(e));
    }
}
