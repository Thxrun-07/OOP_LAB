abstract class BankAccount {
    public static final String BANK_NAME = "State Bank Of India";
    protected String accountHolder;
    private double balance;
    int failedLoginAttempts;
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public final void printBankName() {
        System.out.println("Bank name is: " + BANK_NAME);
    }
    abstract void processFee();
    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    void processFee() {
        double currentBalance = getBalance();
        setBalance(currentBalance - 5.00);
        System.out.println("Fee of Rs.5 processed.");
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("John", 1000.00);
        sa.printBankName();
        System.out.println("Account holder: " + sa.accountHolder);
        System.out.println("Starting balance: Rs." + sa.getBalance());
        sa.processFee();
        System.out.println("Balance after fee: Rs." + sa.getBalance());
        sa.failedLoginAttempts = 2;
        System.out.println("Failed login attempts: " + sa.failedLoginAttempts);
        System.out.println("Bank name directly: " + BankAccount.BANK_NAME);
    }
}