import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import unittest.StringHelper;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)                      // class contains parameterized method
public class StringHelperParameterizedTest {

    StringHelper stringHelper = new StringHelper();
    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs [][] = {{"AABCDE","BCDE"},{"ABCDEA","BCDEA"},{"BCADEA","BCADEA"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input)); //expected, actual
    }
}
