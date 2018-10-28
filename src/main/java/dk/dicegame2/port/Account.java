package dk.dicegame2.port;

public abstract class Account {
    //En spiller starter med 1000 kr i sin pengebeholdning.
    protected int balance = 1000;

    public int getBalance() {
        return balance;
    }
    public abstract void add(int addend);
    public abstract void subtract(int subtrahend);
}
