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
        FFLineup test = new FFLineupOnArrayList();

        test.addPlayer(p);

        assertEquals(p, test.removePlayer(p));
    }

    /**
     * Testing the addPlayer method with 2 RB.
     *
     * @param p
     *            the player
     */
    @Test
    public void testAddPlayer2RB(Player p) {
        FFLineup test = new FFLineupOnArrayList();
        Player bijanRobinson = new Player("Bijan Robinson", "RB", null);

        test.addPlayer(bijanRobinson);
        test.addPlayer(p);

        assertEquals(p, test.removePlayer(p));
    }

    /**
     * Testing the addPlayer method with 3 WR.
     *
     * @param p
     *            the player
     */
    @Test
    public void testAddPlayer3WR(Player p) {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'marr Chase", "WR", null);

        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(p);

        assertEquals(p, test.removePlayer(p));
    }

    /**
     * Testing the removePlayer method with 1 QB.
     *
     * @param p
     *            the player
     */
    @Test
    public void testRemovePlayer1QB(Player p) {
        FFLineup test = new FFLineupOnArrayList();

        test.addPlayer(p);

        test.removePlayer(p);


        assertEquals(p, );
    }

    /**
     * Testing the size method when the lineup is empty.
     */
    @Test
    public void testSizeEmpty() {
        FFLineup test = new FFLineupOnArrayList();

        int s = test.size();

        assertEquals(0, s);
    }

    /**
     * Testing the size method when the lineup has 1 QB.
     */
    @Test
    public void testSize1() {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);

        int s = test.size();

        assertEquals(1, s);
    }

    /**
     * Testing the size method when the lineup has 4 WRs.
     */
    @Test
    public void testSizeMultiple() {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);
        Player davanteAdams = new Player("Davante Adams", "WR", null);

        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);
        test.addPlayer(davanteAdams);

        int s = test.size();

        assertEquals(4, s);
    }

    /**
     * Testing the removeAny method when the lineup has 1 QB.
     */
    @Test
    public void testRemoveAny1QB() {
        FFLineup test = new FFLineupOnArrayList();
        FFLineup testExpected = new FFLineupOnArrayList();

        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);
        testExpected.addPlayer(jalenHurts);

        Player removed = test.removeAny();
        testExpected.removePlayer(removed);

        assertEquals(testExpected, test);
        assertEquals(jalenHurts, removed);
    }

    /**
     * Testing the removeAny method when the lineup has 2 RBs.
     */
    @Test
    public void testRemoveAny2RB() {
        FFLineup test = new FFLineupOnArrayList();
        FFLineup testExpected = new FFLineupOnArrayList();

        Player bijanRobinson = new Player("Bijan Robinson", "RB", null);
        Player buckyIrving = new Player("Bucky Irving", "RB", null);
        test.addPlayer(bijanRobinson);
        test.addPlayer(buckyIrving);
        testExpected.addPlayer(bijanRobinson);
        testExpected.addPlayer(buckyIrving);

        Player removed = test.removeAny();
        Player checkRemoved = testExpected.removePlayer(removed);

        assertEquals(testExpected, test);
        assertEquals(checkRemoved, removed);
    }

    /**
     * Testing the removeAny method when the lineup has 3 WRs.
     */
    @Test
    public void testRemoveAny3WR() {
        FFLineup test = new FFLineupOnArrayList();
        FFLineup testExpected = new FFLineupOnArrayList();

        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);
        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);
        testExpected.addPlayer(nicoCollins);
        testExpected.addPlayer(jamarrChase);
        testExpected.addPlayer(drakeLondon);

        Player removed = test.removeAny();
        Player checkRemoved = testExpected.removePlayer(removed);

        assertEquals(testExpected, test);
        assertEquals(checkRemoved, removed);
    }

    /**
     * Testing the contains method when the lineup is empty.
     *
     * @param p
     *            the player
     */
    @Test
    public void testContainsEmpty(Player p) {
        FFLineup test = new FFLineupOnArrayList();

        boolean check = test.contains(p);

        assertEquals(false, check);
    }

    /**
     * Testing the contains method when the lineup has 1 QB.
     *
     * @param p
     *            the player
     */
    @Test
    public void testContains1QBTrue(Player p) {
        FFLineup test = new FFLineupOnArrayList();
        test.addPlayer(p);

        boolean check = test.contains(p);

        assertEquals(true, check);
    }

    /**
     * Testing the contains method when the lineup has 1 QB.
     *
     * @param p
     *            the player
     */
    @Test
    public void testContains1QBFalse(Player p) {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);

        boolean check = test.contains(p);

        assertEquals(false, check);
    }

    /**
     * Testing the contains method when the lineup has 3 WRs.
     *
     * @param p
     *            the player
     */
    @Test
    public void testContainsMultipleTrue(Player p) {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'marr Chase", "WR", null);
        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(p);

        boolean check = test.contains(p);

        assertEquals(true, check);
    }

    /**
     * Testing the contains method when the lineup has 3 WRs.
     *
     * @param p
     *            the player
     */
    @Test
    public void testContainsMultipleFalse(Player p) {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);
        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);

        boolean check = test.contains(p);

        assertEquals(false, check);
    }

    @Test
    public void testGetName() {
        FFLineup test = new FFLineupOnArrayList("Starting Roster");

        String name = test.getName();

        assertEquals("Starting Roster", name);
    }
}
