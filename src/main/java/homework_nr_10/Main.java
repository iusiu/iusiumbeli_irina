package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        Predicate<Integer> verifyIfNumberIsOdd = (Integer i) -> {
            return i % 2 == 0;
        };

        Consumer<String> printLine = (String s) -> System.out.println(s);

        Function<Integer, Integer> multiplyNumberToTwo = (Integer i) -> i * 2;

        Supplier<List<Integer>> supplyRandomNumber = () -> {
            int minValue = 1;
            int maxValue = 1000;
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            List<Integer> randomNumberList = new ArrayList<>();
            randomNumberList.add(randomValue);
            return randomNumberList;
        };

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", "Viorel", 25, "Financial"));
        employeeList.add(new Employee("Viorica", "Musta", 19, "HR"));
        employeeList.add(new Employee("Helen", "Mura", 36, "Juridic"));
        employeeList.add(new Employee("Alla", "Li", 26, "Software Engineering"));

        Predicate<Employee> checkEmployeeWorksInDepartmentSoftwareEngineering = (Employee e) -> {
            return e.department.equals("Software Engineering");
        };

        Predicate<Employee> checkEmployeeAgeIsBiggerThanTwenty = (Employee e) -> {
            return e.age > 20;
        };
        Predicate<Employee> employeeNameBeginsWithA = (Employee e) -> {
            return e.name.startsWith("A");
        };

        System.out.println("In department Software Engineering work: ");
        testEmployee(employeeList, checkEmployeeWorksInDepartmentSoftwareEngineering);
        System.out.println("Employee whom age is bigger than 20 is: ");
        testEmployee(employeeList, checkEmployeeAgeIsBiggerThanTwenty);
        System.out.println("Employee name that begins with A is: ");
        testEmployee(employeeList, employeeNameBeginsWithA);
    }
    public static void testEmployee(List <Employee> inputList, Predicate<Employee> testMethod) {
        for (Employee element :
                inputList) {
            if (testMethod.test(element))
                System.out.println(element.name);
        }
    }
    public static void verifyIfNumberForSomething(List<Integer> inputList, Predicate<Integer> predicate) {
        for (Integer element :
                inputList) {
            if (predicate.test(element))
                System.out.println(element);
        }
    }

    public static void applyConsumerForAllElements(List<String> inputList, Consumer<String> consumer) {
        for (String element :
                inputList) {
            consumer.accept(element);
        }
    }

    public static void applyFunctionForAllElementsAndMultiplyThemToTwo(List<Integer> inputList, Function<Integer, Integer> inputFunction) {
        for (Integer element :
                inputList) {
            System.out.println(inputFunction.apply(element));
        }
    }

    public static List<Integer> supplyANewListWithRandomNumber(Supplier<List<Integer>> supply) {
        return supply.get();
    }
}
