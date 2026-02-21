import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create BankAccount object (default balance and PIN)
        BankAccount account = new BankAccount(5000, 1234);

        System.out.print("Enter your ATM PIN: ");
        int enteredPin = sc.nextInt();

        // Verify PIN
        if (!account.verifyPin(enteredPin)) {
            System.out.println("Invalid PIN. Access Denied.");
            System.exit(0);
        }

        System.out.println("PIN verified successfully!\n");

        while (true) {
            System.out.println("***** ATM MENU *****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
