package homework_nr_15;

import java.util.Comparator;

public enum ComparingWithComparator {
    SORT_BY_YEARMADE(Comparator.comparing((Car c) -> c.yearMade)),
    SORT_BY_NAME(Comparator.comparing((Car c) -> c.name));

    private final Comparator<Car> comparator;
    ComparingWithComparator(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Car> getComparator(){
        return comparator;
    }
}
