package homework_nr_15;

import java.util.Comparator;

public class Car implements Comparable<Car>{
    Integer yearMade;
    String name;
    public Car(int yearMade, String name){
        this.yearMade = yearMade;
        this.name = name;
    }
    @Override
    public int compareTo(Car o) {
        return Comparator.comparing((Car c1) -> c1.yearMade).reversed()
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Car {" +
                "yearMade = " + yearMade +
                ", name = '" + name + '\'' +
                '}';
    }
}
