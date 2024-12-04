package components.fflineup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for {@code FFLineup}'s secondary methods.
 */
public class FFLineupTest {

    /**
     * Testing the returnPosition method with 0 TEs.
     *
     * @param s
     *            the position
     */
    @Test
    public void testReturnPosition0TE(String s) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPosition(s);
        FFLineup returnedCopy = fCopy.returnPosition(s);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPosition method with 1 QB.
     *
     * @param s
     *            the position
     */
    @Test
    public void testReturnPosition1QB(String s) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", s, null);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPosition(s);
        FFLineup returnedCopy = fCopy.returnPosition(s);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPosition method with 2 RBs.
     *
     * @param s
     *            the position
     */
    @Test
    public void testReturnPosition2RB(String s) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player bijanRobinson = new Player("Bijan Robinson", s, null);
        Player devonAchane = new Player("De'von Achane", s, null);
        f.addPlayer(bijanRobinson);
        fCopy.addPlayer(bijanRobinson);
        f.addPlayer(devonAchane);
        fCopy.addPlayer(devonAchane);

        FFLineup returned = f.returnPosition(s);
        FFLineup returnedCopy = fCopy.returnPosition(s);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPosition method with 3 WRs.
     *
     * @param s
     *            the position
     */
    @Test
    public void testReturnPosition3WR(String s) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player tankDell = new Player("Tank Dell", s, null);
        Player nicoCollins = new Player("Nico Collins", s, null);
        Player cedricTillman = new Player("Cedric Tillman", s, null);
        f.addPlayer(tankDell);
        fCopy.addPlayer(tankDell);
        f.addPlayer(nicoCollins);
        fCopy.addPlayer(nicoCollins);
        f.addPlayer(cedricTillman);
        fCopy.addPlayer(cedricTillman);

        FFLineup returned = f.returnPosition(s);
        FFLineup returnedCopy = fCopy.returnPosition(s);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with no players matching the points.
     *
     * @param d
     *            the points
     */
    @Test
    public void testReturnPointsNoMatch(double d) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        final double points = 21.23;
        Player jalenHurts = new Player("Jalen Hurts", "QB", points);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPoints(d);
        FFLineup returnedCopy = fCopy.returnPoints(d);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with 1 QB.
     *
     * @param d
     *            the points
     */
    @Test
    public void testReturnPoints1QB(double d) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", d);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPoints(d);
        FFLineup returnedCopy = fCopy.returnPoints(d);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with 2 RBs.
     *
     * @param d
     *            the points
     */
    @Test
    public void testReturnPoints2RB(double d) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player bijanRobinson = new Player("Bijan Robinson", "RB", d);
        Player devonAchane = new Player("De'von Achane", "RB", d);
        f.addPlayer(bijanRobinson);
        fCopy.addPlayer(bijanRobinson);
        f.addPlayer(devonAchane);
        fCopy.addPlayer(devonAchane);

        FFLineup returned = f.returnPoints(d);
        FFLineup returnedCopy = fCopy.returnPoints(d);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with 3 WRs.
     *
     * @param d
     *            the points
     */
    @Test
    public void testReturnPoints3WR(double d) {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        final double points = 22.4;
        Player tankDell = new Player("Tank Dell", "WR", d);
        Player nicoCollins = new Player("Nico Collins", "WR", points);
        Player cedricTillman = new Player("Cedric Tillman", "WR", d);
        f.addPlayer(tankDell);
        fCopy.addPlayer(tankDell);
        f.addPlayer(nicoCollins);
        fCopy.addPlayer(nicoCollins);
        f.addPlayer(cedricTillman);
        fCopy.addPlayer(cedricTillman);

        FFLineup returned = f.returnPoints(d);
        FFLineup returnedCopy = fCopy.returnPoints(d);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }
}
