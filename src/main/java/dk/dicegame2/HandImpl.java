package dk.dicegame2;

import java.util.ArrayList;

public class HandImpl {
    private DieImpl[] dices;
    private boolean dicesAreSame = true;

    public int roll() {
        int hand = 0;
        int currentDice = dices[0].roll();//1
        int previousDice = -1;
        hand += currentDice;
        for(int i=1; i< dices.length; i++){
            previousDice = currentDice;
            currentDice = dices[i].roll();//3
            if(currentDice != previousDice)
                dicesAreSame = false;
            hand += currentDice;
        }
        return hand;
    }

    public boolean hasSameDices() {
        return dicesAreSame;
    }

    protected void setDice(DieImpl[] dices){
        this.dices = dices;
    }
}
