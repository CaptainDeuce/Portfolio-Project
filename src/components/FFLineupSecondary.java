package components;

/**
 * Layered implementations of secondary methods for {@code FFLineup}.
 */
public abstract class FFLineupSecondary implements FFLineup {

    @Override
    public final void displayLineup() {
        System.out.println("Lineup: ");
        for (Player p : this.players) {
            System.out.println("- " + p.name() + ", " + p.position() + ": "
                    + p.points() + " points");
        }
    }

    @Override
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
        this.players.transferFrom(tempThisPlayers);
        return returnedPlayers;
    }

    @Override
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
        this.players.transferFrom(tempThisPlayers);
        return returnedPlayers;
    }

    @Override
    public String toString() {
        return "FFLineup{name='" + name + "', players=" + players + "}"
    }

    @Override
    public boolean equals(Object obj) {
        boolean check = false;
        if (this == obj) {
            check = true;
        }
        if (obj == null) {
            check = false;
        }

        return check;
    }

}
