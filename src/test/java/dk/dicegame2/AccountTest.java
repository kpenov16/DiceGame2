package dk.dicegame2;

import dk.dicegame2.port.Account;
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

}