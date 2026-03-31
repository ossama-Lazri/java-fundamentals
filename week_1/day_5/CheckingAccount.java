public class CheckingAccount extends BankAccount {

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    // allow overdraft (simple version)
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}