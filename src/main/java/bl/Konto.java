package bl;

public class Konto {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Konto(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;

    }

    public void transferTo(Konto k, int amount) {
        this.withdraw(amount);
        k.deposit(amount);

    }

}
