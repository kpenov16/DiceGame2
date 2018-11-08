package dk.dicegame2;

public class SixSidedDieImpl extends Die {
    public int roll() {
        value = (int)(Math.random()*6) + 1;
        return value;
    }

}
