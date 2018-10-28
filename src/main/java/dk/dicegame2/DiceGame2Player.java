package dk.dicegame2;

import dk.dicegame2.port.Account;
import dk.dicegame2.port.Player;

public class DiceGame2Player extends Player {
    Account account;

    public DiceGame2Player(Account account){
        setAccount(account);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getBalance() {
        return account.getBalance();
    }

    @Override
    public Account getAccount() {
        return account;
    }

    protected void setAccount(Account account){
        account.setOwner(this);
        this.account = account;
    }

    @Override
    public boolean isWinner() {
        return getBalance() >= 3000;
    }
}
