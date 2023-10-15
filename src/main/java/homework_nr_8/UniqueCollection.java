package homework_nr_8;

import java.util.HashSet;

public class UniqueCollection {
    public static void main(String[] args) {
        HashSet<Integer> intList = new HashSet<Integer>();
        intList.add(1);
        intList.add(1);
        intList.add(4);
        intList.add(5);
        intList.add(9);
        intList.add(9);
        System.out.println("The unique collection is: ");
        System.out.println(intList);
    }
}
