public class SavingsAccount extends BankAccount {

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    // example: limit withdraw
    @Override
    public void withdraw(double amount) {
        if (amount <= 500) {
            super.withdraw(amount);
        } else {
            System.out.println("Limit exceeded (max 500)");
        }
    }
}