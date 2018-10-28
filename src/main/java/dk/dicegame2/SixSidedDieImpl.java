package dk.dicegame2;

public class SixSidedDieImpl extends Die {

    public int roll() {
        return (int)(Math.random()*6) + 1;
    }

}
