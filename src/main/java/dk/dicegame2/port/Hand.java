package dk.dicegame2.port;

import dk.dicegame2.Die;

public abstract class Hand {
    protected Die[] dice;
    protected boolean diceAreSame = true;
    protected int hand;

    public abstract int roll();
    protected abstract void setDice(Die[] dice);
}
