package dk.dicegame2.common;

public class RollingDicePresenter {
    private DiceGame2Gui diceGame2Gui;
    private RollingDiceViewModel vm;
    public RollingDicePresenter(DiceGame2Gui diceGame2Gui, RollingDiceViewModel vm) {
        this.diceGame2Gui = diceGame2Gui;
        this.vm = vm;
    }

    public void present(int firstDie, int secondDie, int balance, boolean isWinner, String msg) {
        vm.firstDie = firstDie;
        vm.secondDie = secondDie;
        vm.msg = vm.playerName + ": "+ msg;
        vm.balance = balance;
        vm.isWinner = isWinner;
        diceGame2Gui.update();
    }

}
