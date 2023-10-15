package homework_nr_9;

public interface Animal {
    String type = null;
    String habitat = null;
    String name = null;

    void makeSound();
    void eat();
    static void move(){
        System.out.println("This animal is moving");
    }
    default void doSomething(){
    }

}
