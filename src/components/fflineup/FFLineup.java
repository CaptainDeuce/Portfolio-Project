package components.fflineup;

/**
 * {@code FFLineupKernel} enhanced with secondary methods.
 */
public interface FFLineup extends FFLineupKernel {

    /**
     * Displays the lineup for the user.
     *
     * @requires |this| > 0
     * @ensures the lineup prints for the user
     */
    void displayLineup();

    /**
     * Removes and returns all players with the position {@code s}.
     *
     * @param s
     *            the position to check
     * @return the players with position {@code s}
     * @updates this
     * @requires |this| > 0
     * @ensures <pre>
     * returnPosition is in #this and
     * this = #this \ {returnPosition}
     * </pre>
     */
    FFLineup returnPosition(String s);

    /**
     * d returns all players with the position {@code d}.
     *
     * @param d
     *            the points to check
     * @return the players with points {@code d}
     * @updates this
     * @requires |this| > 0
     * @ensures <pre>
     * returnPoints is in #this and
     * this = #this \ {returnPoints}
     * </pre>
     */
    FFLineup returnPoints(double d);
}
