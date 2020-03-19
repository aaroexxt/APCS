public class BankAccount implements Comparable<BankAccount>
{
    private double balance;
    /**
    Compares two bank accounts.
    @param other the other BankAccount
    @return 1 if this bank account has a greater balance than the other
    one,
    -1 if this bank account is has a smaller balance than the other one,
    and 0 if both bank accounts have the same balance
    */
    public int compareTo(BankAccount other)
    {
        if (balance > other.getBalance()) {
            return -1;
        } else if (balance == other.getBalance()) {
            return 0;
        } else {
            return 1;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public BankAccount(double amount) {
        balance = amount;
    }
}