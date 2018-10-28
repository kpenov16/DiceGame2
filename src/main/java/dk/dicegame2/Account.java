package dk.dicegame2;

public class Account {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void add(int addend) {
        this.balance += addend;
    }

    public void subtract(int subtrahen) {
        this.balance -= subtrahen;
    }
}
