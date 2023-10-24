package homework_nr_13;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws InvalidAirplaneException, InvalidRangeException {
        createAirplaneLBYL("Mfg", "G-33", 6);
        createAirplaneEAFP("HJK", "Sdf", 8);
        countDivisibleBy7Numbers();

    }
    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        return new Airplane(manufacturer, model, nrOfEngines);
    }
    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        try {
            new Airplane(manufacturer, model, nrOfEngines);
        } catch (NullPointerException ignored){
        }
        return new Airplane(manufacturer, model, nrOfEngines);
    }
    public static int countDivisibleBy7Numbers() throws InvalidRangeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number \"from\":");
        int inferiorLimit = sc.nextInt();
        System.out.println("Please enter the number \"to\":");
        int superiorLimit = sc.nextInt();
        System.out.println("The numbers from range that can be divided by 7 are:");
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                System.out.print( i + " | ");
            }
        }
        if (inferiorLimit > superiorLimit)
        throw new InvalidRangeException("Invalid Range");
        return 0;
    }
}
