public class CreditCard {
    private double balance;
    
    public CreditCard() {
        balance = 0;
    }
    
    public void payment(double amount) {
        balance += amount;
    }
    
    public void purchase(double amount) {
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
}