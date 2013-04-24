package edu.zzabost.spoj.addrev;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * User: Zbigniew Zabost
 * Date: 4/24/13
 */
public class AddRevTest {

    @Test
    public void testReversNumberHappyPath() throws Exception {
        final String input = "123";
        final Integer expectedOutput = 321;
        final Integer actualOutput = AddRev.reversNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReversNumberWithZeros() throws Exception {
        final String input = "123000";
        final Integer expectedOutput = 321;
        final Integer actualOutput = AddRev.reversNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReversNumberWithZeroInside() throws Exception {
        final String input = "503";
        final Integer expectedOutput = 305;
        final Integer actualOutput = AddRev.reversNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReversNumberOneDigit() throws Exception {
        final String input = "1";
        final Integer expectedOutput = 1;
        final Integer actualOutput = AddRev.reversNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReversNumberOneZero() throws Exception {
        final String input = "0";
        final Integer expectedOutput = 0;
        final Integer actualOutput = AddRev.reversNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }


    // examples from spoj

    @Test
    public void testAddRev1() throws Exception {
        final String input1 = "24";
        final String input2 = "1";
        final Integer expectedOutput = 34;
        final Integer actualOutput = AddRev.addRev(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAddRev2() throws Exception {
        final String input1 = "4358";
        final String input2 = "754";
        final Integer expectedOutput = 1998;
        final Integer actualOutput = AddRev.addRev(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testAddRev3() throws Exception {
        final String input1 = "305";
        final String input2 = "794";
        final Integer expectedOutput = 1;
        final Integer actualOutput = AddRev.addRev(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }

}
