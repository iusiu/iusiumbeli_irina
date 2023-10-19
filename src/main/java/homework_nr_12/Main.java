package homework_nr_12;

public class Main {
    public static void main(String[] args) {
        int x = 5;

        //Print all months
        Months[] allMonths = Months.values();
        for (Months element: allMonths) {
            System.out.println(element);
        }
        System.out.println("-----------------------");

        //Check if fuel is Liquid
        FuelTypes fuel1 = FuelTypes.DIESEL;
        FuelTypes fuel2 = FuelTypes.ELECTRIC;
        FuelTypes fuel3 = FuelTypes.CNG;
        System.out.println("The " + fuel1 + " is liquid: " + fuel1.isLiquidFuel());
        System.out.println("The " + fuel2 + " is liquid: " + fuel2.isLiquidFuel());
        System.out.println("The " + fuel3 + " is liquid: " + fuel3.isLiquidFuel());
        System.out.println("-----------------------");

        //Check Integer
        resultCheckInteger(x,CheckInteger.CHECK_IF_EVEN);
        resultCheckInteger(x,CheckInteger.CHECK_IF_ODD);
        resultCheckInteger(x,CheckInteger.CHECK_IF_NEGATIVE);
        resultCheckInteger(x,CheckInteger.CHECK_IF_POSITIVE);

        System.out.println(" ");


        x = -2;
        resultCheckInteger(x,CheckInteger.CHECK_IF_EVEN);
        resultCheckInteger(x,CheckInteger.CHECK_IF_ODD);
        resultCheckInteger(x,CheckInteger.CHECK_IF_NEGATIVE);
        resultCheckInteger(x,CheckInteger.CHECK_IF_POSITIVE);

        System.out.println(" ");

        x = 0;
        resultCheckInteger(x,CheckInteger.CHECK_IF_EVEN);
        resultCheckInteger(x,CheckInteger.CHECK_IF_ODD);
        resultCheckInteger(x,CheckInteger.CHECK_IF_NEGATIVE);
        resultCheckInteger(x,CheckInteger.CHECK_IF_POSITIVE);

    }
    public static void resultCheckInteger(int x, CheckInteger checkInteger){
        System.out.println("The Integer " + x + " " + checkInteger + " is: " + checkInteger.getCheckInteger().test(x));
    }
}
