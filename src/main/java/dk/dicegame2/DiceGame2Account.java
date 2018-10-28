package dk.dicegame2;

import dk.dicegame2.port.Account;

public class DiceGame2Account extends Account {
    @Override
    public void add(int addend) {
       super.balance += addend;
    }
    @Override
    public void subtract(int subtrahend){
        super.balance -= subtrahend;
    }
}
