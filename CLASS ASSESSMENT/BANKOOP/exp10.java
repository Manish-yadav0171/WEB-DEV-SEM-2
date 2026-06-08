// Abstract class
abstract class BankAccount {

    // Data members
    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Display account detalateils
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Abstract method
    abstract void calculateInterest();
}

// SavingsAccount class
class SavingsAccount extends BankAccount {

    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    // Implement abstract method
    void calculateInterest() {
        double interest = balance * 0.05; // 5% interest
        System.out.println("Savings Account Interest: " + interest);
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount {

    // Constructor
    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    // Implement abstract method
    void calculateInterest() {
        double interest = balance * 0.02; // 2% interest
        System.out.println("Current Account Interest: " + interest);
    }
}

// Main class
public class Exp10 {

    public static void main(String[] args) {

        // Creating Savings Account object
        SavingsAccount sa = new SavingsAccount(101, "Rahul", 10000);

        // Creating Current Account object
        CurrentAccount ca = new CurrentAccount(102, "Anita", 20000);

        // Savings Account Operations
        System.out.println("----- Savings Account -----");
        sa.deposit(2000);
        sa.displayDetails();
        sa.calculateInterest();

        System.out.println();

        // Current Account Operations
        System.out.println("----- Current Account -----");
        ca.deposit(3000);
        ca.displayDetails();
        ca.calculateInterest();
    }
}