package components;

import java.util.Iterator;

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
        boolean check = true;
        if (obj == this) {
            check = true;
        }
        if (obj == null) {
            check = false;
        }
        if (!(obj instanceof FFLineup)) {
            check = false;
        }
        FFLineup f = (FFlineup) obj;
        if (this.length() != f.size()) {
            check = false;
        }
        Iterator<T> it1 = this.iterator();
        Iterator<T> it2 = f.iterator();
        while (it1.hasNext()) {
            T x1 = it1.next();
            Object x2 = it2.next();
            if (!x1.equals(x2)) {
                check = false;
            }
        }

        return check;
    }

}
