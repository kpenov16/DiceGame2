package dk.dicegame2.common;

public class SetUpPresenter {
    private DiceGame2Gui diceGame2Gui;
    private SetUpViewModel vm;

    public SetUpPresenter(DiceGame2Gui diceGame2Gui, SetUpViewModel vm) {
        this.diceGame2Gui = diceGame2Gui;
        this.vm = vm;
    }


    public void sendSuccessMsg() {
        vm.msg = "Successfully created players: " + vm.nameFirstPlayer + ", " + vm.nameSecondPlayer;
        diceGame2Gui.sendSuccessMsg();
    }

    public void execute(int balanceFirstPlayer, int balanceSecondPlayer) {
        vm.balanceFirstPlayer = balanceFirstPlayer;
        vm.balanceSecondPlayer = balanceSecondPlayer;

    }
}
