/* Lab 10,
Niko Reyes
IST 240 Mark Choman
 */

abstract class Player extends Person {

    private int number;
    private String sports;
    private int gamesPlayed;

    public Player() {
        super();
        setNumber(0);
        setSports("none");
        setGamesPlayed(0);

    }

    public Player(int number, String sports, int gamesPlayed) {
        super();
        setNumber(number);
        setSports(sports);
        setGamesPlayed(gamesPlayed);
    }

    public Player(int number, String sports, int gamesPlayed, String name,
            Address address) {
        super(name, address);
        setNumber(number);
        setSports(sports);
        setGamesPlayed(gamesPlayed);

    }

    public abstract double getRatings();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlayer{" + "number=" + getNumber()
                + ", sports=" + getSports() + ", gamesPlayed="
                + getGamesPlayed() + '}';
    }

}
