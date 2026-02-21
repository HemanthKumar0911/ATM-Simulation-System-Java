class BankAccount {
    private int balance;
    private int pin;

    // Constructor
    BankAccount(int balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // PIN verification method
    boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    // Deposit method
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Available Balance : " + balance);
    }
}
