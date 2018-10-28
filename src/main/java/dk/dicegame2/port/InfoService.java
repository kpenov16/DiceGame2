package dk.dicegame2.port;

public abstract class InfoService {
    protected String message;
    protected int score;
    protected int points;
    protected String location;

    public abstract void setPoints(int points);

    public abstract int getScore();

    public abstract String getMessage();

    public abstract String getLocation();
}
