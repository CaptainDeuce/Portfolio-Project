import components.standard.Standard;

/**
 * FFLineup kernel component with primary methods.
 */
public interface FFLineupKernel extends Standard<FFLineup> {

    /**
     * Adds {@code p} to this.
     *
     * @param p
     *            the player to be added
     * @aliases reference {@code p}
     * @updates this
     * @requires p is not in this
     * @ensures this = #this union {p}
     */
    void addPlayer(Player p);

    /**
     * Removes {@code p} from this, and returns it.
     *
     * @param p
     *            the player to be removed
     * @return the player removed
     * @updates this
     * @requires p is in this
     * @ensures <pre>
     * this = #this \ {p}  and
     * remove = p
     * </pre>
     */
    Player removePlayer(Player p);

    /**
     * Reports the size of {@code this}.
     *
     * @return the number of elements in {@code this}.
     * @ensures size = |this|
     */
    int size();

    /**
     * Removes and returns an arbitrary player from {@code this}.
     *
     * @return the player removed from {@code this}
     * @updates this
     * @requires |this| > 0
     * @ensures <pre>
     * removeAny is in #this and
     * this = #this \ {removeAny}
     * </pre>
     */
    Player removeAny();

    /**
     * Reports whether {@code s} is in {@code this}.
     *
     * @param s
     *            the string to be checked
     * @return true iff string is in {@code this}
     * @ensures contains = (s is in this)
     */
    boolean contains(String s);
}
