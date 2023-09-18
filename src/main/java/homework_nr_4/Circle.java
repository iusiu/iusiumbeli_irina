package homework_nr_4;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        //Creating new object from class Circle
        Circle circle = new Circle(8);
        float area = circle.calculateArea();
        System.out.println("The area of circle is: " + area);

    }

    //Calculating Area of Circle
    public float calculateArea() {
        return (float) (Math.PI * radius);
    }

}
