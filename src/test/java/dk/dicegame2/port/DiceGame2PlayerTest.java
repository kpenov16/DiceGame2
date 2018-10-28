package dk.dicegame2.port;

import dk.dicegame2.DiceGame2Account;
import dk.dicegame2.DiceGame2Player;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGame2PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new DiceGame2Player(new DiceGame2Account());
        player.setName("Jan");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void givenNewPlayer_returnEmpltyPalyerName(){
        //arrange
        //act
        player = new DiceGame2Player(new DiceGame2Account());
        //assert
        assertEquals("",player.getName());
    }

    @Test
    public void givenNewPlayerWithName_returnPalyerName(){
        //arrange
        //act

        //assert
        assertEquals("Jan",player.getName());
    }

    @Test
    public void givenNewPlayer_returnAccountBalanceIsPositive1000(){
        //arrange
        //act

        //assert
        assertEquals(+1000,player.getBalance());
    }

    @Test
    public void givenNewPlayer_returnPlayerOwnsTheAccount(){
        //arrange
        //act

        //assert
        assertEquals("Jan", player.getAccount().getOwnerName());
    }

    @Test
    public void givenPlayerReachesScoreOf3000_returnPlayerWinsTheGame(){
        //arrange
        //act
        FakeAccount account = new FakeAccount();
        account.setBalance(3000);
        player.setAccount(account);

        //assert
        assertEquals(true, player.isWinner());
    }

    @Test
    public void givenPlayerScoreIsLessThan3000_returnPlayerNotWinner(){
        //arrange
        //act
        FakeAccount account = new FakeAccount();
        account.setBalance(2000);
        player.setAccount(account);

        //assert
        assertEquals(false, player.isWinner());
    }

    private class FakeAccount extends Account{
        @Override
        public void add(int addend) {

        }
        @Override
        public void subtract(int subtrahend) {

        }
        @Override
        protected void setBalance(int newBalance) {
            balance = newBalance;
        }
        @Override
        public void setOwner(Owner owner) {

        }
        @Override
        public Owner getOwner() {
            return null;
        }
        @Override
        public String getOwnerName() {
            return "";
        }
    }
}