
import components.fflineup.FFLineup;
import components.fflineup.FFLineupOnArrayList;
import components.fflineup.Player;

/**
 * Class that helps the user to model different fantasy football leagues that
 * they're in.
 */
public class MultipleLineups {

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        FFLineup cousins = new FFLineupOnArrayList("Cousins League");
        FFLineup neighborhood = new FFLineupOnArrayList("Neighborhood League");

        Player cousinsQB = new Player("Jalen Hurts", "QB", 21.86);
        Player cousinsRB1 = new Player("Jonathan Taylor", "RB", 16.8);
        Player cousinsRB2 = new Player("Chase Brown", "RB", 17.5);
        Player cousinsWR1 = new Player("Puka Nacua", "WR", 14.8);
        Player cousinsWR2 = new Player("DJ Moore", "WR", 19.7);
        Player cousinsWR3 = new Player("Brian Thomas", "WR", 16.7);

        Player neighborhoodQB = new Player("Baker Mayfield", "QB", 10.2);
        Player neighborhoodRB1 = new Player("Bijan Robinson", "RB", 25.5);
        Player neighborhoodRB2 = new Player("David Montgomery", "RB", 15.4);
        Player neighborhoodWR1 = new Player("Nico Collins", "WR", 19.9);
        Player neighborhoodWR2 = new Player("Ja'Marr Chase", "WR", 20.6);
        Player neighborhoodWR3 = new Player("Davante Adams", "WR", 17.6);

        cousins.addPlayer(cousinsQB);
        cousins.addPlayer(cousinsRB1);
        cousins.addPlayer(cousinsRB2);
        cousins.addPlayer(cousinsWR1);
        cousins.addPlayer(cousinsWR2);
        cousins.addPlayer(cousinsWR3);

        neighborhood.addPlayer(neighborhoodQB);
        neighborhood.addPlayer(neighborhoodRB1);
        neighborhood.addPlayer(neighborhoodRB2);
        neighborhood.addPlayer(neighborhoodWR1);
        neighborhood.addPlayer(neighborhoodWR2);
        neighborhood.addPlayer(neighborhoodWR3);

        cousins.displayLineup();
        neighborhood.displayLineup();
    }
}
