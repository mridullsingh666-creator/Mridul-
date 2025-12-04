import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        String acc = sc.nextLine();

        BankAccount account = new BankAccount(acc);

        int choice;
        do {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Amount to deposit: Rs.");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Amount to withdraw: Rs.");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 4);

        sc.close();
    }
}
