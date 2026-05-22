class Account {
    private double balance;
    private double dailyLimit;

    public Account(double balance, double dailyLimit) {
        this.balance = balance;
        this.dailyLimit = dailyLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void deduct(double amount) {
        balance -= amount;
    }
}

class Transaction {

    public static void process(Account account, double amount) {

        if (amount > account.getBalance()) {
            System.out.println("Transaction Failed - Insufficient Balance");
            return;
        }

        if (amount > account.getDailyLimit()) {
            System.out.println("Transaction Failed - Exceeds Daily Limit");
            return;
        }

        double charge = 0;
        if (amount > 10000) {
            charge = amount * 0.02;
        }

        double total = amount + charge;
        account.deduct(total);

        System.out.println("Transaction Approved");
        System.out.println("Charge Applied: " + charge);
        System.out.println("Remaining Balance: " + account.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(50000, 15000);

        Transaction.process(acc, 12000);
    }
}