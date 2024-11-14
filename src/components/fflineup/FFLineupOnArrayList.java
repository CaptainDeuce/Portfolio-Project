package components.fflineup;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * {@code FFLineup} represented as an {@link ArrayList} of elements with
 * implementations of primary methods.
 *
 * @convention |$this.elements| = |entries($this.elements)|
 * @correspondence this = entries($this.elements)
 */
public class FFLineupOnArrayList extends FFLineupSecondary {

    /**
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private String name;
    private ArrayList<Player> players;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {

        this.name = "";
        this.players = new ArrayList<>();
    }

    /**
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public FFLineupOnArrayList() {

        this.createNewRep();
    }

    /**
     * Constructor from {@code String}.
     *
     * @param s
     *            {@code String} to initialize from
     */
    public FFLineupOnArrayList(String s) {
        assert s != null : "Violation of: s is not null";

        this.name = s;
        this.players = new ArrayList<>();
    }

    /**
     * Standard methods. ------------------------------------------------------
     */

    @Override
    public final FFLineup newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(FFLineup source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof FFLineupOnArrayList : ""
                + "Violation of: source is of dynamic type FFLineupOnArrayList";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        FFLineupOnArrayList localSource = (FFLineupOnArrayList) source;
        this.name = localSource.name;
        this.players = localSource.players;
        localSource.createNewRep();
    }

    /**
     * Kernel methods. --------------------------------------------------------
     */

    @Override
    public final void addPlayer(Player p) {
        assert p != null : "Violation of: p is not null";
        assert !this.contains(p) : "Violation of: p is not in this";

        this.players.add(p);
    }

    @Override
    public final Player removePlayer(Player p) {
        assert p != null : "Violation of: p is not null";

        Player temp = new Player("", "", null);
        for (int i = 0; i < this.players.size(); i++) {
            Player play = this.players.remove(i);
            if (play.equals(p)) {
                temp = p;
            } else {
                this.players.add(play);
            }
        }
        return temp;
    }

    @Override
    public final int size() {

        return this.players.size();
    }

    @Override
    public final Player removeAny() {
        assert this.size() > 0 : "Violation of: |this| > 0";

        return this.players.remove(0);
    }

    @Override
    public final boolean contains(Player p) {
        assert p != null : "Violation of: p is not null";

        return this.players.contains(p);
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final Iterator<Player> iterator() {
        return this.players.iterator();
    }

}
