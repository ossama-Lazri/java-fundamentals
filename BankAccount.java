public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter (controlled update)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ossama", 1000);

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Balance: " + acc.getBalance());
    }
}