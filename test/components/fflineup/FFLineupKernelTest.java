package components.fflineup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test fixture for {@code FFLineup}'s kernel methods and the Standard
 * methods.
 */
public class FFLineupKernelTest {

    /**
     * Testing the addPlayer method with 1 QB.
     */
    @Test
    public void testAddPlayer1QB() {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);

        test.addPlayer(jalenHurts);

        assertEquals(jalenHurts, test.removePlayer(jalenHurts));
    }

    /**
     * Testing the addPlayer method with 2 RB.
     */
    @Test
    public void testAddPlayer2RB() {
        FFLineup test = new FFLineupOnArrayList();
        Player bijanRobinson = new Player("Bijan Robinson", "RB", null);
        Player buckyIrving = new Player("Bucky Irving", "RB", null);

        test.addPlayer(bijanRobinson);
        test.addPlayer(buckyIrving);

        assertEquals(bijanRobinson, test.removePlayer(bijanRobinson));
    }

    /**
     * Testing the addPlayer method with 3 WR.
     */
    @Test
    public void testAddPlayer3WR() {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'Marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);

        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);

        assertEquals(nicoCollins, test.removePlayer(nicoCollins));
    }

    /**
     * Testing the removePlayer method with 1 QB.
     */
    @Test
    public void testRemovePlayer1QB() {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);

        test.addPlayer(jalenHurts);

        Player play = test.removePlayer(jalenHurts);

        assertEquals(jalenHurts, play);
        assertEquals(false, test.contains(jalenHurts));
    }

    /**
     * Testing the removePlayer method with 2 RBs.
     */
    @Test
    public void testRemovePlayer2RB() {
        FFLineup test = new FFLineupOnArrayList();
        Player bijanRobinson = new Player("Bijan Robinson", "RB", null);
        Player buckyIrving = new Player("Bucky Irving", "RB", null);

        test.addPlayer(bijanRobinson);
        test.addPlayer(buckyIrving);

        Player play = test.removePlayer(bijanRobinson);

        assertEquals(bijanRobinson, play);
        assertEquals(false, test.contains(bijanRobinson));
    }

    /**
     * Testing the removePlayer method with 3 WRs.
     */
    @Test
    public void testRemovePlayer3WR() {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'Marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);

        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);

        Player play = test.removePlayer(nicoCollins);

        assertEquals(nicoCollins, play);
        assertEquals(false, test.contains(nicoCollins));
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
        Player jamarrChase = new Player("Ja'Marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);
        Player davanteAdams = new Player("Davante Adams", "WR", null);

        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);
        test.addPlayer(davanteAdams);

        int s = test.size();

        final int four = 4;
        assertEquals(four, s);
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
        assertEquals(false, test.contains(removed));
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
        assertEquals(false, test.contains(removed));
    }

    /**
     * Testing the removeAny method when the lineup has 3 WRs.
     */
    @Test
    public void testRemoveAny3WR() {
        FFLineup test = new FFLineupOnArrayList();
        FFLineup testExpected = new FFLineupOnArrayList();

        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'Marr Chase", "WR", null);
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
        assertEquals(false, test.contains(removed));
    }

    /**
     * Testing the contains method when the lineup is empty.
     */
    @Test
    public void testContainsEmpty() {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);

        boolean check = test.contains(jalenHurts);

        assertEquals(false, check);
    }

    /**
     * Testing the contains method when the lineup has 1 QB.
     */
    @Test
    public void testContains1QBTrue() {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);

        boolean check = test.contains(jalenHurts);

        assertEquals(true, check);
    }

    /**
     * Testing the contains method when the lineup has 1 QB.
     */
    @Test
    public void testContains1QBFalse() {
        FFLineup test = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        Player bakerMayfield = new Player("Baker Mayfield", "QB", null);
        test.addPlayer(jalenHurts);

        boolean check = test.contains(bakerMayfield);

        assertEquals(false, check);
    }

    /**
     * Testing the contains method when the lineup has multiple WRs.
     */
    @Test
    public void testContainsMultipleTrue() {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'Marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);
        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);
        test.addPlayer(drakeLondon);

        boolean check = test.contains(drakeLondon);

        assertEquals(true, check);
    }

    /**
     * Testing the contains method when the lineup has multiple WRs.
     */
    @Test
    public void testContainsMultipleFalse() {
        FFLineup test = new FFLineupOnArrayList();
        Player nicoCollins = new Player("Nico Collins", "WR", null);
        Player jamarrChase = new Player("Ja'Marr Chase", "WR", null);
        Player drakeLondon = new Player("Drake London", "WR", null);
        test.addPlayer(nicoCollins);
        test.addPlayer(jamarrChase);

        boolean check = test.contains(drakeLondon);

        assertEquals(false, check);
    }

    /**
     * Testing the getName method with an empty string.
     */
    @Test
    public void testGetNameEmpty() {
        FFLineup test = new FFLineupOnArrayList();

        String name = test.getName();

        assertEquals("", name);
    }

    /**
     * Testing the getName method with a sample name.
     */
    @Test
    public void testGetName1() {
        FFLineup test = new FFLineupOnArrayList("Starting Roster");

        String name = test.getName();

        assertEquals("Starting Roster", name);
    }

    /**
     * Testing the clear method when the lineup is empty and has no name.
     */
    @Test
    public void testClearEmpty() {
        FFLineup test = new FFLineupOnArrayList();
        FFLineup testExpected = new FFLineupOnArrayList();

        test.clear();

        assertEquals(testExpected, test);
    }

    /**
     * Testing the clear method when the lineup is empty, but has a name.
     */
    @Test
    public void testClearName() {
        FFLineup test = new FFLineupOnArrayList("Test");
        FFLineup testExpected = new FFLineupOnArrayList();

        test.clear();

        assertEquals(testExpected, test);
    }

    /**
     * Testing the clear method when the lineup is not empty and has a name.
     */
    @Test
    public void testClearNameAndPlayer() {
        FFLineup test = new FFLineupOnArrayList("Test");
        FFLineup testExpected = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);

        test.clear();

        assertEquals(testExpected, test);
    }

    /**
     * Testing the newInstance method with empty lineup.
     */
    @Test
    public void testNewInstanceEmpty() {
        FFLineup test = new FFLineupOnArrayList();

        FFLineup test2 = test.newInstance();

        assertEquals(test2, test);
    }

    /**
     * Testing the newInstance method with empty lineup, but has a name.
     */
    @Test
    public void testNewInstanceName() {
        FFLineup test = new FFLineupOnArrayList("Test");
        FFLineup testExpected = new FFLineupOnArrayList();

        FFLineup test2 = test.newInstance();

        assertEquals(testExpected, test2);
    }

    /**
     * Testing the newInstance method with a non-empty lineup and has a name.
     */
    @Test
    public void testNewInstanceNameAndPlayer() {
        FFLineup test = new FFLineupOnArrayList("Test");
        FFLineup testExpected = new FFLineupOnArrayList();
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);

        FFLineup test2 = test.newInstance();

        assertEquals(testExpected, test2);
    }

    /**
     * Testing the trasferFrom method when the lineup is empty.
     */
    @Test
    public void testTransferFromEmpty() {
        FFLineup test = new FFLineupOnArrayList();
        FFLineup test2 = new FFLineupOnArrayList();

        test2.transferFrom(test);

        assertEquals(test2, test);
    }

    /**
     * Testing the trasferFrom method when the lineup is empty, but has a name.
     */
    @Test
    public void testTransferFromName() {
        FFLineup test = new FFLineupOnArrayList("Test");
        FFLineup test2 = new FFLineupOnArrayList();

        test2.transferFrom(test);

        assertEquals("Test", test2.getName());
        assertEquals("", test.getName());
    }

    /**
     * Testing the trasferFrom method when the lineup is non-empty, but has a
     * name.
     */
    @Test
    public void testTransferFromNameAndPlayer() {
        FFLineup test = new FFLineupOnArrayList("Test");
        Player jalenHurts = new Player("Jalen Hurts", "QB", null);
        test.addPlayer(jalenHurts);
        FFLineup test2 = new FFLineupOnArrayList();

        test2.transferFrom(test);

        assertEquals("Test", test2.getName());
        assertEquals("", test.getName());
        assertEquals(true, test2.contains(jalenHurts));
        assertEquals(false, test.contains(jalenHurts));
    }
}
