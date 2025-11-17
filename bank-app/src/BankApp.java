import java.util.Scanner;

public class BankApp {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount account = null;

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 6) {
             System.out.println("Thank you for using Sara's Bank!");
                break;
            }

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositeMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    displayInfo();
                    break;
                default:
                    System.out.println("Invalid option! Please choose 1-6.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n======== Sara's Bank ========");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Display Account Info");
        System.out.println("6. Exit");
        System.out.println("=============================");
        System.out.print("Choose an option: ");
    }

    private static void createAccount() {
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter initial deposit: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine();

        account = new BankAccount(accountHolder, accountNumber, deposit);
        System.out.println("Account created successfully!");
    }

    private static void depositeMoney() {
        if (account == null) {
            System.out.println("Please create an account first!");
            return;
        }

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        account.deposit(amount);
    }

    private static void withdrawMoney() {
        if (account == null) {
            System.out.println("Please create an account first!");
            return;
        }

        System.out.print("Enter withdraw amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        account.withdraw(amount);
    }

    private static void checkBalance() {
        if (account == null) {
            System.out.println("Please create an account first!");
            return;
        }
        System.out.println("Current Balance: "+ account.getBalance());
    }

    private static void displayInfo() {
        if (account == null) {
            System.out.println("Please create an account first!");
            return;
        }
        account.displayAccountInfo();
    }
}
