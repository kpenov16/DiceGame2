package dk.dicegame2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoServiceTest {
    private  InfoService infoService;

    @BeforeEach
    void setUp() {
        infoService = new InfoService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void given2Points_returnScoreIsPositive250(){
        //arrange
        //act
        infoService.setPoints(2);

        //assert
        assertEquals(250, infoService.getScore());
        assertEquals("Du har fundet Tower og får 250 kr, du er rig!", infoService.getMessage());
    }

    @Test
    public void given3Points_returnScoreIsNegative100(){
        //act
        infoService.setPoints(3);

        //assert
        assertEquals(-100, infoService.getScore());
        assertEquals("Du har fundet Crater og får -100 kr, du er ikke rig!", infoService.getMessage());
    }

    @Test
    public void givenInvalidPoints_returnScoreIsZero(){
        //act
        infoService.setPoints(1);

        //assert
        assertEquals(0, infoService.getScore());
        assertEquals("", infoService.getMessage());
    }
}