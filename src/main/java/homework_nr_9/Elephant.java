package homework_nr_9;

public class Elephant extends Herbivore implements Animal {

    @Override
    public void makeSound() {
        System.out.println("The elephant is making sound");
    }

    @Override
    public void eat() {
        System.out.println("The elephant eats grass");
    }

    @Override
    public void doSomething() {
        System.out.println("The elephant performs in the circus");
        }

    @Override
    public void hide() {
        System.out.println("The elephant is hiding from predators");
    }

    @Override
    public void afraidOf() {
        System.out.println("The elephant afraids of mouses");
    }
}
