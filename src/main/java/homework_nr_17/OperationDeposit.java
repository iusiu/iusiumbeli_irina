package homework_nr_17;

public class OperationDeposit implements Runnable{
    private BankAccount account;
    private double amount;

    public OperationDeposit(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
