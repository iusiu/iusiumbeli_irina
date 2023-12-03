package homework_nr_17;

import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void transferBetweenAccounts(int sourceAccountIndex, int destinationAccountIndex, double amount) {
        BankAccount sourceAccount = accounts.get(sourceAccountIndex);
        BankAccount destinationAccount = accounts.get(destinationAccountIndex);

        try {
            sourceAccount.transfer(destinationAccount, amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
