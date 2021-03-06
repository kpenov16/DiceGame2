package dk.dicegame2;

import dk.dicegame2.port.Account;
import dk.dicegame2.port.Hand;
import dk.dicegame2.port.InfoService;
import dk.dicegame2.port.Player;

public class DiceGame2Player extends Player {
    protected Account account;

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
    public InfoService getInfoService() {
        return infoService;
    }

    @Override
    public void setInfoService(InfoService infoService) {
        super.infoService = infoService;
    }

    @Override
    public boolean isWinner() {
        return getBalance() >= 3000;
    }

    @Override
    public void play() {
        int point = hand.roll();
        infoService.setPoints(point);
        int score = infoService.getScore();
        if(score > 0)
            account.add(score);
        else
            account.subtract(Math.abs(score));
    }

    @Override
    public void setHand(Hand hand) {
        super.hand = hand;
    }

    @Override
    public String getLocation() {
        return super.infoService.getLocation();
    }

    @Override
    public String getMessage() {
        return super.infoService.getMessage();
    }

    @Override
    public int getDie(int index) {
        return hand.getDie(index);
    }


}
