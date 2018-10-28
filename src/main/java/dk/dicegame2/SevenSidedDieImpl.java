package dk.dicegame2;

public class SevenSidedDieImpl extends Die {

    public int roll() {
        return (int)(Math.random()*7) + 1;
    }

}
