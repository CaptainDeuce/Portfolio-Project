package components.fflineup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for {@code FFLineup}'s kernel methods and the Standard
 * methods.
 */
public abstract class FFLineupKernelTest {

    /**
     * Testing the addPlayer method with 1 QB.
     *
     * @param p
     *            the player
     */
    @Test
    public void testAddPlayer1QB(Player p) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();

        f.addPlayer(p);
        fCopy.addPlayer(p);

        assertEquals(fCopy, f);
    }

    /**
     * Testing the removePlayer method with 1 QB.
     *
     * @param p
     *            the player
     */
    @Test
    public void testRemovePlayer1QB(Player p) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();

        f.addPlayer(p);
        fCopy.addPlayer(p);
        f.removePlayer(p);
        fCopy.removePlayer(p);

        assertEquals(fCopy, f);
    }
}
