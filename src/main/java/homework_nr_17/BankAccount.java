package homework_nr_17;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName,String lastName,double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    private String getFullName() {
        return firstName + " " + lastName;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Current balance: " + getFullName() + ": " + balance);
        notifyAll();
    }

    public synchronized void withdraw(double amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Insufficient funds for " + getFullName() + ". Waiting for deposit...");
            wait();
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + ". Current balance for " + getFullName() + ": " + balance);
    }

    public synchronized void transfer(BankAccount destination, double amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Insufficient funds for transfer from " + getFullName() + ". Waiting for deposit...");
            wait();
        }
        withdraw(amount);
        destination.deposit(amount);
        System.out.println("Transferred " + amount + " from " + getFullName() + " to " + destination.getFullName());
    }
}



