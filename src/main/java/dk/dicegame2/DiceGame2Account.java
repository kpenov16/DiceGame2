package dk.dicegame2;

import dk.dicegame2.port.Account;
import dk.dicegame2.port.Owner;

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
        balance = newBalance;
    }
    @Override
    public void setOwner(Owner newOwner) {
        owner = newOwner;
    }
    @Override
    public Owner getOwner() {
        return owner;
    }

    @Override
    public String getOwnerName() {
        return owner.getName();
    }

}
