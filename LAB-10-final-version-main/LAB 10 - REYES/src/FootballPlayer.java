/* Lab 10,
Niko Reyes
IST 240 Mark Choman
 */

public class FootballPlayer extends Player {

    private int yards;
    private int minutesPlayed;

    //Constructors
    public FootballPlayer() {
        super();
        setYards(0);
        setMinutesPlayed(0);
    }

    public FootballPlayer(int yards, int minutesPlayed) {
        super();
        setYards(yards);
        setMinutesPlayed(minutesPlayed);
    }

    public FootballPlayer(int yards, int minutesPlayed, int number,
            String sports, int gamesPlayed) {

        super(number, sports, gamesPlayed);
        setYards(yards);
        setMinutesPlayed(minutesPlayed);
    }

    public FootballPlayer(int yards, int minutesPlayed, int number,
            String sports, int gamesPlayed, String name, Address address) {

        super(number, sports, gamesPlayed, name, address);
        setYards(yards);
        setMinutesPlayed(minutesPlayed);
    }

    public int getYards() {
        return yards;
    }

    private void setYards(int yards) {
        this.yards = yards;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    private void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public double getRatings() {
        {
            if (getYards() == 0 || getGamesPlayed() == 0) {
                return 0;
            } else {
                return (double) ((getYards() - getMinutesPlayed() / 10.0))
                        / getGamesPlayed();
            }
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\nFootballPlayer{" + "yards=" + getYards()
                + ", minutesPlayed=" + getMinutesPlayed() + ", ratings="
                + String.format("%.2f", getRatings()) + "}"
                + "\n=========================================================="
                + "============================================================";
    }
}
