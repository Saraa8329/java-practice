public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if(balance<0) {
            System.out.println("Balance should be 0 or above !");
        }
        else {
            this.balance = balance;
        }
    }

    public boolean deposit(double amount) {
        if(amount>0) {
            this.balance += amount;
            System.out.println("Balance successfully updated !");
            return true;
        }
        return false;
    }

    public boolean withdraw (double amount) {
        if(this.balance<0) return false;
        if(amount>0 && amount<this.balance) {
            this.balance -= amount;
            System.out.println("Balance successfully updated !");
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println ("Account holder : "+accountHolder);
        System.out.println ("Account Number : "+accountNumber);
        System.out.println ("Account balance : "+balance);

    }
}
