package dk.dicegame2;

public class SevenSidedDieImpl extends Die {

    public int roll() {
        value = (int)(Math.random()*7) + 1;
        return value;
    }

}
