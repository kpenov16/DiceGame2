package dk.dicegame2.port;

import dk.dicegame2.DiceGame2Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        //arrange
        account = new DiceGame2Account();
        account.setBalance(1000);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void givenNewAccount_returnBalanceIs1000(){
        //assert
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void givenSubtracting1000FromNewAccount_returnBalanceIsZero(){
        //act
        account.subtract(1000);

        //assert
        assertEquals(0, account.getBalance());
    }

    @Test
    public void givenAdding1000ToNewAccount_returnBalanceIs2000(){
        //act
        account.add(1000);

        //assert
        assertEquals(2000, account.getBalance());
    }

    //Spillerens pengebeholdning skal aldrig går i minus.
    @Test
    public void givenSubtractingMoreThanInAccount_returnBalanceIsZero(){
        //act
        account.subtract(2 * account.getBalance());

        //assert
        assertEquals(0, account.getBalance());
    }

    //Spilleren skal kunne bruge sin pengebeholdning i andre spil.
    @Test
    public void givenNewAccountWithOwner_returnAccountOwner(){
        //arrange
        //act
        Owner owner = new FakePlayer();
        owner.setName("Player1");
        account.setOwner(owner);

        //assert
        assertEquals("Player1", account.getOwner().getName());
        assertEquals("Player1", account.getOwnerName());
    }
    private class FakePlayer extends Player{
        @Override
        public String getName() {
            return super.name;
        }
        @Override
        public void setName(String name) {
            super.name = name;
        }
    }

}