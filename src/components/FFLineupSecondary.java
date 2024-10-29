package components;

/**
 * Layered implementations of secondary methods for {@code FFLineup}.
 */
public abstract class FFLineupSecondary implements FFLineup {

    public final void displayLineup() {
        System.out.println("Lineup: ");
        for (Player p : this.players) {
            System.out.println("- " + p.name() + ", " + p.position() + ": "
                    + p.points() + " points");
        }
    }

    public final FFLineup returnPosition(String s) {
        FFLineup returnedPlayers = new FFLineup(s + " Position");
        FFLineup tempThisPlayers = new FFLineup("Temp");
        tempThisPlayers.transferFrom(this.players);
        int i = 0;
        while (i < tempThisPlayers.size()) {
            Player tempPlayer = tempThisPlayers.removeAny();
            if (tempPlayer.position().equals(s)) {
                returnedPlayers.addPlayer(tempPlayer);
                i--;
            } else {
                tempThisPlayers.addPlayer(tempPlayer);
            }
            i++;
        }
        return returnedPlayers;
    }

    public final FFLineup returnPoints(double d) {
        FFLineup returnedPlayers = new FFLineup(d + " Points");
        FFLineup tempThisPlayers = new FFLineup("Temp");
        tempThisPlayers.transferFrom(this.players);
        int i = 0;
        while (i < tempThisPlayers.size()) {
            Player tempPlayer = tempThisPlayers.removeAny();
            if (tempPlayer.points().equals(d)) {
                returnedPlayers.addPlayer(tempPlayer);
                i--;
            } else {
                tempThisPlayers.addPlayer(tempPlayer);
            }
            i++;
        }
        return returnedPlayers;
    }

    @Override
    public String toString() {

    }

    @Override
    public boolean equals(Object secondObject) {

    }

}
