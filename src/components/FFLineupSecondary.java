package components;

/**
 * Layered implementations of secondary methods for {@code FFLineup}.
 */
public abstract class FFLineupSecondary implements FFLineup {

    public final void displayLineup() {
        System.out.println("Lineup: ");
        for (Player p : this.players) {
            System.out.println("- " + p.getName() + ", " + p.getPosition()
                    + ": " + p.getPoints() + " points");
        }
    }

    public final FFLineup returnPosition(String s) {
        FFLineup returnedPlayers = new FFLineup(s + " Position");
        FFLineup tempThisPlayers = new FFLineup("Temp");
        for (int i = 0; i < this.players.size(); i++) {
            tempThisPlayers.addPlayer(this.players.remove(i));
        }
        int i = 0;
        while (i < this.players.size()) {
            Player tempPlayer = tempThisPlayers.removeAny();
            if (tempPlayer.getPosition().equals(s)) {
                returnedPlayers.addPlayer(tempPlayer);
            } else {
                tempThisPlayers.addPlayer(tempPlayer);
            }
            i++;
        }
        if (returnedPlayers.equals(null)) {
            System.out.println(
                    "There are no players with the " + s + " position.");
        }
        return returnedPlayers;
    }

    public final FFLineup returnPoints(double d) {
        FFLineup returnedPlayers = new FFLineup(d + " Points");
        FFLineup tempThisPlayers = new FFLineup("Temp");
        for (int i = 0; i < this.players.size(); i++) {
            tempThisPlayers.addPlayer(this.players.remove(i));
        }
        int i = 0;
        while (i < this.players.size()) {
            Player tempPlayer = tempThisPlayers.removeAny();
            if (tempPlayer.getPoints().equals(d)) {
                returnedPlayers.addPlayer(tempPlayer);
            } else {
                tempThisPlayers.addPlayer(tempPlayer);
            }
            i++;
        }
        if (returnedPlayers.equals(null)) {
            System.out.println(
                    "There are no players with the " + s + " position.");
        }
        return returnedPlayers;
    }

}