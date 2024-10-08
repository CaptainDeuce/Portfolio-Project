import java.util.LinkedList;
import java.util.List;

public class FantasyFootball<> {

    /**
     * Elements included in {@code this}.
     */
    private List<String> football;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.football = new LinkedList<String>();
    }

    /**
     * No-argument constructor.
     */
    public FantasyFootball() {
        this.createNewRep();
    }

    // add
    private static void addPlayerStats(int index, String s) {
        this.football.add(index, s);
    }

    // remove
    private static String removePlayerStats(int index) {
        return this.football.remove(index);
    }

    // replace
    private static String replace(int index, String s) {
        this.football.add(index + 1, s);
        String returnedPlayer = this.football.remove(index);
        return returnedPlayer;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        // initialize new component
        FantasyFootball<String> startingLineup = new FantasyFootball<String>();
        FantasyFootball<String> bench = new FantasyFootball<String>();

        /**
         * Testing add and remove with quarterbacks.
         */

        // player, position, and points in the form "Name, Position: Points"
        String jalenHurts = "Jalen Hurts, QB: 16.32";
        String bakerMayfield = "Baker Mayfield, QB: 28.88";

        startingLineup.add(0, jalenHurts);
        startingLineup.add(1, bakerMayfield);

        String benchedPlayer = startingLineup.remove(1);

        /**
         * Testing replace with starting lineup and bench
         */
        String bijanRobinson = "Bijan Robinson, RB: 11.4";
        String jamesCook = "James Cook, RB: 5.8";
        String davidMontgomery = "David Montgomery, RB: 15.0";

        startingLineup.add(1, bijanRobinson);
        startingLineup.add(2, jamesCook);
        bench.add(0, davidMontgomery);

        String benchedPlayer = startingLineup.replace(2, bench.remove(0));
        bench.add(0, benchedPlayer);
    }
}
