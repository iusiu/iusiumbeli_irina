package homework_nr_8;

import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Do homework nr 8");
        toDoList.add("Clean aquarium");
        toDoList.add("Buy glasses");
        toDoList.add("Cook dinner");
        System.out.println("My to-do list fot today is:");
        System.out.println(toDoList);
    }
}
