package dk.dicegame2;

public class InfoService {
    private String message;
    private int score;
    private int points;

    public void setPoints(int points) {
        this.points = points;
        evaluate();
    }

    private void evaluate() {
        switch (points){
            case 2:{
                score = 250;
                message = "Du har fundet Tower og får 250 kr, du er rig!";
                break;
            }
            case 3:{
                score = -100;
                message = "Du har fundet Crater og får -100 kr, du er ikke rig!";
                break;
            }
            default:
                score = 0;
                message = "";
                break;
        }
    }

    public int getScore() {
        return score;
    }

    public String getMessage() {
        return message;
    }
}
