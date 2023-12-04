package homework_nr_17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("John", "Doe", 100));
        accounts.add(new BankAccount("Jane", "Smith",50));
        accounts.add(new BankAccount("Sam", "Faith",60));

        Bank bank = new Bank(accounts);


        OperationWithdraw withdrawOperation = new OperationWithdraw(accounts.get(0),30);
        Thread withdrawThread = new Thread(withdrawOperation);
        withdrawThread.start();

        OperationWithdraw withdrawOperation2 = new OperationWithdraw(accounts.get(2), 40);
        Thread withdrawThread2 = new Thread(withdrawOperation2);
        withdrawThread2.start();


        OperationDeposit depositOperation = new OperationDeposit(accounts.get(1), 20);
        Thread depositThread = new Thread(depositOperation);
        depositThread.start();

        OperationDeposit depositOperation2 = new OperationDeposit(accounts.get(2), 50);
        Thread depositThread2 = new Thread(depositOperation2);
        depositThread2.start();

        new Thread(() -> {
            bank.transferBetweenAccounts(0, 1, 15);
        }).start();
    }
}
