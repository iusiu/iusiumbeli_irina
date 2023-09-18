package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {
        //Initializing object from class TemperatureConverter
        TemperatureConverter temperature = new TemperatureConverter();
        float celsius = temperature.toCelsius(50);
        float fahrenheit = temperature.toFahrenheit(10);
        System.out.println("The Fahrenheit degree in Celsius is: " + celsius);
        System.out.println("The Celsius degree in Fahrenheit is: " + fahrenheit);
    }

    public float toCelsius(int fahrenheit) {
        return (float) ((fahrenheit - 32) / 1.8);
    }

    public float toFahrenheit(int celsius) {
        return (float) (celsius * 1.8 + 32);
    }
}
