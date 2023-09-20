package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        //Initializing the array
        int y = 100;
        int[] numbers = new int[y];
        for (int index = numbers.length - 1, i = 0; index >= 0; index--, i++) {
            numbers[i] = index;
        }

        //The array output
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " contains number: " + numbers[i]);
        }

        //Determining the sum of even numbers & multiplication of odd numbers in array
        int sum = 0;
        double multiplication = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                multiplication = multiplication * numbers[i];
            }
        }
        System.out.println("The sum of even numbers is: " + sum);
        System.out.println("The subtraction of odd numbers is: " + multiplication);

        //Copying array number into a new array copyNumbers
        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i < copyNumbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
    }
}
