package dk.dicegame2.port;

public abstract class Player extends Owner{
    public abstract int getBalance();

    public abstract Account getAccount();

    protected abstract void setAccount( Account account);

    public abstract boolean isWinner();
}
