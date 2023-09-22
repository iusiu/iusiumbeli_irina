package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;
    boolean isCorrectDate = true;

    public Date(int day, int month, int year) {
        if (day > 0 && day < 32) {
            this.day = day;
        } else {
            isCorrectDate = false;
            System.out.println("Please introduce the correct day from 1 to 31");
        }
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            isCorrectDate = false;
            System.out.println("Please introduce the correct month from 1 to 12");
        }
        if (year > 0 && year < 2027) {
            this.year = year;
        } else {
            isCorrectDate = false;
            System.out.println("Please introduce the correct year");
        }
    }

    public Date() {
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        } else {
            isCorrectDate = false;
            System.out.println("Please introduce the correct day from 1 to 31");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            isCorrectDate = false;
            System.out.println("Please introduce the correct month from 1 to 12");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year < 2027) {
            this.year = year;
        } else {
            isCorrectDate = false;
            System.out.println("Please introduce the correct year");
        }
    }

    public void displayDate() {
        if (isCorrectDate){
        System.out.println("The date is: " + getDay() + "/" + getMonth() + "/" + getYear());
        }
    }
}

