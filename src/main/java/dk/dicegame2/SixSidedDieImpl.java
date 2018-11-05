package dk.dicegame2;

public class SixSidedDieImpl extends Die {

    private int value;
    public int roll() {
        value = (int)(Math.random()*6) + 1;
        return value;
    }

    @Override
    public int getValue() {
        return value;
    }


}
