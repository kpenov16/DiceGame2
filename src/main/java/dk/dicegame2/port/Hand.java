package dk.dicegame2.port;

import dk.dicegame2.Die;

public abstract class Hand {
    protected Die[] dice = null;
    protected boolean diceAreSame = true;
    protected int hand;

    public abstract int roll();
    public abstract void setDice(Die[] dice);

    public abstract int getDie(int index);
}
