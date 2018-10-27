package dk.dicegame2;

public class DieImpl {
    public int roll() {
        return (int)(Math.random()*6) + 1;
    }
    public boolean hasSameDices() {
        return false;
    }
}
