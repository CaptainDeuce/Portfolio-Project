package components.fflineup;

/**
 * Class that uses the FFLineup component to model a fantasy football starting
 * roster.
 */
public final class StartingRoster {

    private FFLineup f;

    public StartingRoster() {
        this.f = new FFLineupOnArrayList("Starting Roster");
    }

    /**
     * Method that returns the total number of points the roster scored.
     *
     * @return total points of the roster
     * @ensures each player's points are added to get the total points
     */
    public double rosterPoints() {

        double total = 0;
        for (int i = 0; i < this.f.size(); i++) {
            Player p = this.f.removeAny();
            total += p.points();
        }
        return total;
    }

    /**
     * Method that returns the starting quarterback of the roster.
     *
     * @return quarterback player
     * @ensures player returned is a quarterback
     */
    public Player quaterBack() {

        FFLineup qb1 = this.f.returnPosition("QB");
        return qb1.removeAny();
    }
}
