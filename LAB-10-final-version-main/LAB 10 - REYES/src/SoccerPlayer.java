/* Lab 10,
Niko Reyes
IST 240 Mark Choman
 */

public class SoccerPlayer extends Player {

    private int goals;
    private int yellowCards;


    public SoccerPlayer() {
        super();
        setGoals(0);
        setYellowCards(0);
    }

    public SoccerPlayer(int goals, int yellowCards, int par2, String soccer, int par3, String jaden_Dottin) {
        super();
        setGoals(goals);
        setYellowCards(yellowCards);
    }

    public SoccerPlayer(int goals, int yellowCards, int number, String sports,
            int gamesPlayed) {

        super(number, sports, gamesPlayed);
        setGoals(goals);
        setYellowCards(yellowCards);
    }

    public SoccerPlayer(int goals, int yellowCards, int number, String sports,
            int gamesPlayed, String name, Address address) {

        super(number, sports, gamesPlayed, name, address);
        setGoals(goals);
        setYellowCards(yellowCards);
    }


    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public double getRatings() {
        {
            if (getGoals() == 0 || getGamesPlayed() == 0) {
                return 0;
            } else {
                return (double) (getGoals() - getYellowCards()) / getGamesPlayed();
            }
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\nSoccerPlayer{goals=" + getGoals()
                + ", yellowCards="
                + getYellowCards() + ", ratings="
                + String.format("%.2f", getRatings()) + "}"
                + "\n=========================================================="
                + "============================================================";

    }

}
