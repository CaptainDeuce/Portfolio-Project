package components.fflineup;

import components.standard.Standard;

/**
 * FFLineup kernel component with primary methods.
 */
public interface FFLineupKernel extends Standard<FFLineup>, Iterable<Player> {

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
     * Reports whether {@code p} is in {@code this}.
     *
     * @param p
     *            the player to be checked
     * @return true iff player is in {@code this}
     * @ensures contains = (p is in this)
     */
    boolean contains(Player p);

    /**
     * Returns the name of the lineup {@code this}.
     *
     * @return the name of the lineup {@code this}
     * @ensures name = linuep name of {@code this}
     */
    String getName();
}
