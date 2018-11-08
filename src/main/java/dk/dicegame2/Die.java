package dk.dicegame2;

public abstract class Die {
    protected int value;
    public abstract int roll();
    public int getValue() {
        return value;
    }
}
