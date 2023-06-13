/* Lab 10,
Niko Reyes
IST 240 Mark Choman
 */

import java.util.ArrayList;

public class ModelData {

    private ArrayList<Player> players;

    public ModelData() {
        players = new ArrayList<>();
        LoadPlayers();
    }

    public ModelData(ArrayList<Player> players) {
       setPlayers(players);
       LoadPlayers();
    }
    
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        setPlayers(players);
    }

    private void LoadPlayers() {

        players.add(new FootballPlayer(80, 220, 1,
                "Football", 10, "Saquon Barkley",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new FootballPlayer(120, 100, 14,
                "Football", 7, "John Dunmore",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new FootballPlayer(10, 70, 15,
                "Football", 5, "Daniel George",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new FootballPlayer(30, 250, 20,
                "Football", 11, "Will Levis",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new FootballPlayer(100, 100, 33,
                "Football", 14, "Jaden Dottin",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new SoccerPlayer(2, 0, 1,
                "Soccer", 10, "Julia Dohle",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new SoccerPlayer(7, 0, 14,
                "Soccer", 2, "Ellie Jean",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new SoccerPlayer(3, 3, 15,
                "Soccer", 5, "Devon Olive",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new SoccerPlayer(7, 5, 20,
                "Soccer", 11, "Angela Aguero",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));
        ////////////////////////////////////////////////////////////  
        players.add(new SoccerPlayer(4, 3, 33,
                "Soccer", 1, "Laura Suero",
                new Address(201, "Old Main", "Street",
                        new ZipCode("16802", "0001"), "PA", 0)));

    }

    public Player findHighestRatings(String sports) {
        double ratings = Double.MIN_VALUE;
        int highRatings = 0;
        for (int result = 0; result < players.size(); result++) {
            if (players.get(result).getSports().equalsIgnoreCase(sports)
                    && players.get(result).getRatings() > ratings) {
                highRatings = result;
                ratings = players.get(result).getRatings();
            }
        }
        return players.get(highRatings);
    }

    public boolean containsName(String name) {
        for (Player player : players) {
            while (name.equalsIgnoreCase(player.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsPartialName(String name) {
        for (int i = 0; i < players.size(); i++) {
            while (players.get(i).getName().contains(name)
                    || players.get(i).getName().equalsIgnoreCase(name)
                    || players.get(i).getName().matches(name)) {
                return true;
            }
        }
        return false;
    }

    public Player findHighestYards() {
        int yards = 0;
        int mostYards = 0;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getSports().equalsIgnoreCase("Football")) {
                FootballPlayer fp;
                fp = (FootballPlayer) players.get(i);
                if (fp.getYards() > yards) {
                    mostYards = i;
                    yards = fp.getYards();
                }
            }
        }
        return players.get(mostYards);
    }
}
