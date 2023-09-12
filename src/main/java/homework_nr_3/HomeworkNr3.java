package homework_nr_3;

public class HomeworkNr3 {
    public static void main(String[] args) {
    // Ex. nr 4
        int month = 3;
        System.out.print("The " + month + " month is: ");
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
        // Ex. nr 5
        System.out.println("Numbers from 100 to 1000, that can be divided to 5:");
        for (int x = 100; x <= 1000; x++) {
            if (x % 5 == 0) {
                System.out.print(x + " | ");
            }
        }
        //Ex. nr 6
        System.out.println();
        float sum = 0;
        for (int i = 1; i + 2 < 100; i += 2) {
            sum = sum + (float)i / (i + 2);
        }
        System.out.println("The sum of division of odd numbers from 1 to 100 is: " + sum);
    }
}