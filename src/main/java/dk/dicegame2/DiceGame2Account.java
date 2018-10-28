package dk.dicegame2;

import dk.dicegame2.port.Account;

public class DiceGame2Account extends Account {
    @Override
    public void add(int addend) {
       balance += addend;
    }
    @Override
    public void subtract(int subtrahend){
        int tempBalance = balance - subtrahend;
        balance = (tempBalance < 0) ? 0 : tempBalance;
    }

    @Override
    protected void setBalance(int newBalance) {
        super.balance = newBalance;
    }

    @Override
    public void setOwner(String owner) {
        super.owner = owner;
    }

    @Override
    public String getOwner() {
        return super.owner;
    }

}
