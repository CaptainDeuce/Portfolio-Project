// class for player object
class Player {
    private String name;
    private String position;
    private String points;

    public Player(String name, String position, Double points) {
        this.name = name;
        this.position = position;
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public Double getPoints() {
        return this.points;
    }
}

public class FFLineup {

    private String name;
    private ArrayList<Player> players;

    public FFLineup(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // add
    public final void addPlayer(Player p) {
        this.players.add(p);
    }

    // remove
    public final Player removePlayer(Player p) {
        Player temp = new Player("", "", "");
        if (this.players.remove(p)) {
            temp = p;
        }
        return temp;
    }

    // removeAny
    public final Player removeAny() {
        Player temp = new Player("", "", "");
        temp = this.players.remove(0);
        return temp;
    }

    // displayLineup
    public final void displayLineup() {
        System.out.println("Lineup: ");
        for (Player p : this.players) {
            System.out.println("- " + p.getName() + ", " + p.getPosition()
                    + ": " + p.getPoints() + " points");
        }
    }

    // returnPosition
    public final FFLineup returnPosition(String s) {
        FFLineup returnedPlayers = new FFLineup(s + " Position");
        FFLineup tempThisPlayers = new FFLineup("Temp");
        tempThisPlayers.transferFro(this.players);
        int i = 0;
        while (i < tempThisPlayers.size()) {
            Player tempPlayer = tempThisPlayers.removeAny();
            if (tempPlayer.getPosition().equals(s)) {
                returnedPlayers.addPlayer(tempPlayer);
            } else {
                tempThisPlayers.addPlayer(tempPlayer);
            }
            i++;
        }
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        // create a new lineup for my cousin league
        FFLineup startingLineup = new FFLineup("Cousin League");

        // creating players
        Player qb1 = new Player("Jalen Hurts", "QB", "21.86");
        Player qb2 = new Player("Baker Mayfield", "QB", "25.9");

        // testing add and remove with the qbs
        startingLineup.addPlayer(qb1);
        startingLineup.addPlayer(qb2);
        Player benchedQB = startingLineup.removePlayer(qb2);

        // testing display lineup
        Player rb1 = new Player("Bijan Robinson", "RB", "25.5");
        Player wr1 = new Player("Jayden Reed", "WR", "14.8");
        startingLineup.addPlayer(rb1);
        startingLineup.addPlayer(wr1);
        startingLineup.displayLineup();

        // testing returnPosition
        startingLineup.returnPosition("RB");
    }
}
