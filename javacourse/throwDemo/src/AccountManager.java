public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) throws BalancaInsufficentException {
        if(balance>=amount) {
            balance=getBalance()-amount;
        }else {
            throw new BalancaInsufficentException("Bakiye yetersiz");
        }
    }

    public double getBalance() {
        return balance;
    }
}
