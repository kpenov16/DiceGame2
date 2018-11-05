package dk.dicegame2;

import dk.dicegame2.common.DiceGame2Gui;
import dk.dicegame2.common.PlayerGateway;
import dk.dicegame2.common.SetUpController;
import dk.dicegame2.common.SetUpPresenter;
import dk.dicegame2.port.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args){

        DiceGame2Gui diceGame2Gui = new DiceGame2Gui();
        diceGame2Gui.start();

    }

}
