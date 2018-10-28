package dk.dicegame2;

public class HandImpl {
    private Die[] dice;
    private boolean diceAreSame = true;

    public int roll() {
        int hand = 0;
        int currentDie = dice[0].roll();//1
        int previousDie = -1;
        hand += currentDie;
        for(int i = 1; i< dice.length; i++){
            previousDie = currentDie;
            currentDie = dice[i].roll();//3
            if(currentDie != previousDie)
                diceAreSame = false;
            hand += currentDie;
        }
        return hand;
    }

    protected void setDice(Die[] dice){
        this.dice = dice;
    }
}
