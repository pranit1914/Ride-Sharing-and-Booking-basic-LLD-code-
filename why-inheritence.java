// without inheritance we have to write the same code again and again for each class which is not efficient and it will take more time to write the code and also it will take more time to debug the code if there is any error in the code. so inheritance is used to avoid this problem and it allows us to reuse the code and also it allows us to create a new class based on an existing class. so we can create a new class which is called child class or subclass which inherits the properties of parent class or superclass. so we can use the properties of parent class in child class without writing the same code again and again. so inheritance is used to achieve code reusability and also it allows us to create a new class based on an existing class.

class SavingsAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

class CurrentAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

class LoanAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        System.out.println("Savings Account Balance: " + sa.balance);

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(2000);
        System.out.println("Current Account Balance: " + ca.balance);

        LoanAccount la = new LoanAccount();
        la.deposit(5000);
        System.out.println("Loan Account Balance: " + la.balance);
    }
}
// in above code we have to write the same code for each class which is not efficient and it will take more time to write the code and also it will take more time to debug the code if there is any error in the code. so we can use inheritance to avoid this problem and we can create a new class which is called child class or subclass



//with inheritance we can create a new class which is called child class or subclass which inherits the properties of parent class or superclass. so we can use the properties of parent class in child class without writing the same code again and again. so inheritance is used to achieve code reusability and also it allows us to create a new class based on an existing class.
    class Account { 
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}
class SavingsAccount extends Account {
    void addInterest() {
        balance += balance * 0.05;
    }
}

class CurrentAccount extends Account {
    void allowOverdraft() {
        System.out.println("Overdraft allowed");
    }
}

class LoanAccount extends Account {
    void calculateEMI() {
        System.out.println("Calculating EMI");
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.addInterest();
        System.out.println("Savings Account Balance: " + sa.balance);

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(2000);
        ca.allowOverdraft();
        System.out.println("Current Account Balance: " + ca.balance);

        LoanAccount la = new LoanAccount();
        la.deposit(5000);
        la.calculateEMI();
        System.out.println("Loan Account Balance: " + la.balance);
    }
}
// so in inheritence we can access the parent class properties and we can access self properties of child classes. so we can achieve code reusability and also we can create a new class based on an existing class. so inheritance is used to achieve code reusability and also it allows us to create a new class based on an existing class.
