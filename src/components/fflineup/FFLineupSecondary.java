package components.fflineup;

import java.util.Iterator;

/**
 * Layered implementations of secondary methods for {@code FFLineup}.
 */
public abstract class FFLineupSecondary implements FFLineup {

    @Override
    public final void displayLineup() {
        System.out.println("Lineup: ");
        for (Player p : this) {
            System.out.println("- " + p.name() + ", " + p.position() + ": "
                    + p.points() + " points");
        }
    }

    @Override
    public final FFLineup returnPosition(String s) {
        FFLineup returnedPlayers = this.newInstance();
        FFLineup tempThisPlayers = this.newInstance();
        tempThisPlayers.transferFrom(this);
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
        this.transferFrom(tempThisPlayers);
        return returnedPlayers;
    }

    @Override
    public final FFLineup returnPoints(double d) {
        FFLineup returnedPlayers = this.newInstance();
        FFLineup tempThisPlayers = this.newInstance();
        tempThisPlayers.transferFrom(this);
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
        this.transferFrom(tempThisPlayers);
        return returnedPlayers;
    }

    @Override
    public String toString() {
        String output = "FFLineup{name= " + this.getName() + "; players= ";
        for (Player p : this) {
            output += p + ",";
        }
        output += "}";
        return output;
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
        FFLineup f = (FFLineup) obj;
        if (this.size() != f.size()) {
            check = false;
        }
        Iterator<Player> it1 = this.iterator();
        Iterator<Player> it2 = f.iterator();
        while (it1.hasNext()) {
            Player x1 = it1.next();
            Object x2 = it2.next();
            if (!x1.equals(x2)) {
                check = false;
            }
        }

        return check;
    }

}
