package components.fflineup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for {@code FFLineup}'s secondary methods.
 */
public class FFLineupTest {

    /**
     * Testing the returnPosition method with 0 TEs.
     */
    @Test
    public void testReturnPosition0TE() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPosition("TE");
        FFLineup returnedCopy = fCopy.returnPosition("TE");
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPosition method with 1 QB.
     */
    @Test
    public void testReturnPosition1QB() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPosition("QB");
        FFLineup returnedCopy = fCopy.returnPosition("QB");
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPosition method with 2 RBs.
     */
    @Test
    public void testReturnPosition2RB() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player bijanRobinson = new Player("Bijan Robinson", "RB", null);
        Player devonAchane = new Player("De'von Achane", "RB", null);
        f.addPlayer(bijanRobinson);
        fCopy.addPlayer(bijanRobinson);
        f.addPlayer(devonAchane);
        fCopy.addPlayer(devonAchane);

        FFLineup returned = f.returnPosition("RB");
        FFLineup returnedCopy = fCopy.returnPosition("RB");
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPosition method with 3 WRs.
     */
    @Test
    public void testReturnPosition3WR() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        Player tankDell = new Player("Tank Dell", "WR", null);
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player cedricTillman = new Player("Cedric Tillman", "WR", null);
        f.addPlayer(tankDell);
        fCopy.addPlayer(tankDell);
        f.addPlayer(nicoCollins);
        fCopy.addPlayer(nicoCollins);
        f.addPlayer(cedricTillman);
        fCopy.addPlayer(cedricTillman);

        FFLineup returned = f.returnPosition("WR");
        FFLineup returnedCopy = fCopy.returnPosition("WR");
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with no players matching the points.
     */
    @Test
    public void testReturnPointsNoMatch() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        final double points = 21.23;
        Player jalenHurts = new Player("Jalen Hurts", "QB", points);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPoints(0.0);
        FFLineup returnedCopy = fCopy.returnPoints(0.0);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with 1 QB.
     */
    @Test
    public void testReturnPoints1QB() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        final double points = 21.23;
        Player jalenHurts = new Player("Jalen Hurts", "QB", points);
        f.addPlayer(jalenHurts);
        fCopy.addPlayer(jalenHurts);

        FFLineup returned = f.returnPoints(points);
        FFLineup returnedCopy = fCopy.returnPoints(points);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with 2 RBs.
     */
    @Test
    public void testReturnPoints2RB() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        final double points = 16.5;
        Player bijanRobinson = new Player("Bijan Robinson", "RB", points);
        Player devonAchane = new Player("De'von Achane", "RB", points);
        f.addPlayer(bijanRobinson);
        fCopy.addPlayer(bijanRobinson);
        f.addPlayer(devonAchane);
        fCopy.addPlayer(devonAchane);

        FFLineup returned = f.returnPoints(points);
        FFLineup returnedCopy = fCopy.returnPoints(points);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }

    /**
     * Testing the returnPoints method with 3 WRs.
     */
    @Test
    public void testReturnPoints3WR() {
        FFLineup f = new FFLineupOnArrayList();
        FFLineup fCopy = new FFLineupOnArrayList();
        final double points = 22.4;
        final double pointsNew = 20.2;
        Player tankDell = new Player("Tank Dell", "WR", pointsNew);
        Player nicoCollins = new Player("Nico Collins", "WR", points);
        Player cedricTillman = new Player("Cedric Tillman", "WR", pointsNew);
        f.addPlayer(tankDell);
        fCopy.addPlayer(tankDell);
        f.addPlayer(nicoCollins);
        fCopy.addPlayer(nicoCollins);
        f.addPlayer(cedricTillman);
        fCopy.addPlayer(cedricTillman);

        FFLineup returned = f.returnPoints(pointsNew);
        FFLineup returnedCopy = fCopy.returnPoints(pointsNew);
        assertEquals(returnedCopy, returned);
        assertEquals(fCopy, f);
    }
}
