import unittest.StringHelper;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AInFirstTwoPos() {
        assertEquals("BCDE", stringHelper.truncateAInFirst2Positions("AABCDE")); //expected, actual
    }

    @Test
    public void testTruncateAInFirst2Positions_AatFirstPos() {
        assertEquals("BCDEA", stringHelper.truncateAInFirst2Positions("ABCDEA")); //expected, actual
    }

    @Test
    public void testTruncateAInFirst2Positions_ANotAtFirstTwoPos() {
        assertEquals("BCADEA", stringHelper.truncateAInFirst2Positions("BCADEA")); //expected, actual
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_SingleValue() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("a"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_SingleValueFailCond() {
        assertFalse("condition fails", stringHelper.areFirstAndLastTwoCharactersTheSame("a"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_TwoChar() {
        //assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("af"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("af"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirsLastCharSame() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("afklklklaf"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirsLastCharNotSame() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("apklklklaf"));
    }
}
