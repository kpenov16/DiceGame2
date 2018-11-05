package dk.dicegame2;

public class SevenSidedDieImpl extends Die {
    private int value;
    public int roll() {
        value = (int)(Math.random()*7) + 1;
        return value;
    }

    @Override
    public int getValue() {
        return value;
    }

}
