package homework_nr_17;

import java.util.List;

public class OperationWithdraw implements Runnable{
    private BankAccount account;
    private double amount;

    public OperationWithdraw(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            account.withdraw(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
