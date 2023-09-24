package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        Invoice firstInvoice = new Invoice("SamsungGalaxySS", "Black", 2, 14586);
        System.out.println("The amount of Invoice is equal to " + firstInvoice.getAmount());
        Date dataClass = new Date();
        dataClass.setDay(7);
        dataClass.setMonth(1);
        dataClass.setYear(2024);
        dataClass.displayDate();
    }
}
