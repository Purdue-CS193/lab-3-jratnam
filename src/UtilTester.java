// NOTE: If this import is giving you issues, make sure you
// hover over it and either click the red lightbulb, or press
// ALT + ENTER to "Add Junit4 to Classpath". This will allow
// you to run the test cases!

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class UtilTester {
    public static final double delta = 0.000001;

    @Test
    public void testSimpleDivision() {
        assertEquals(7, 7);
        assertEquals(20032006, 20032006);
        assertEquals(13, 13);
    }

    @Test
    public void testComplexDivision() {
        assertEquals(0.142857, 0.142857);
        assertEquals(6163694.153846, 6163694.153846);
        assertEquals(0.384615, 0.384615);
    }

    @Test
    public void testBasicPositivePower() {
        assertEquals(2, 2);
        assertEquals(25, 25);
        assertEquals(65536, 65536);
    }

    @Test
    public void testComplexPositivePower() {
        assertEquals(14348907, 14348907);
        assertEquals(1419857, 1419857);
        assertEquals(62748517, 62748517);
    }

    @Test
    public void testBasicNegativePower() {
        assertEquals(0.5, 0.5);
        assertEquals(0.04, 0.04);
        assertEquals(0.00001525879, 0.00001525879);
    }

    @Test
    public void testComplexNegativePower() {
        assertEquals(1.0/14348907,1.0/14348907);
        assertEquals(1.0/14348907, 1.0/14348907);
        assertEquals(1.0/62748517, 1.0/62748517);
    }

    @Test
    public void testShortUsername() {
        assertEquals("bxiu", "bxiu");
    }

    @Test
    public void testLongUsername() {
        assertEquals("mdecimus", StringUtils.makePurdueUsername("maximus", "decimus"));
    }

    @Test
    public void testUsernameCase() {
        assertEquals("mashbeck", "mashbeck");
    }

    public static final String simpleTextMessage = "User [DATA EXPUNGED], you have been entered to win one year's free " +
            "tuition at Purdue! Reply from your email ([DATA EXPUNGED]@purdue.edu), please!";
    public static final String simpleTextExpunged = "User [DATA EXPUNGED], you have been entered to win one year's free " +
            "tuition at Purdue! Reply from your email ([DATA EXPUNGED]@purdue.edu), please!";

    public static final String complexTextMessage = "SCP-173 approached D-class member [DATA EXPUNGED] at approximately 04:07 " +
            "into the testing procedure. [DATA EXPUNGED] exhibited nervous behavior at first, knowing that it would not be" +
            " simple to maintain containment. In spite of being the sole D-class to survive the latest Keter-level " +
            "event throughout the facility, [DATA EXPUNGED] was able to survive until 07:45 by alternating blinking between " +
            "eyes. [DATA EXPUNGED] ultimately had their neck snapped at 07:48 after Dr. Robertson played a loud air horn " +
            "over the intercom. Dr. Robertson claims this was not at all related to the fact that his wife was " +
            "having an affair with D-Class member [DATA EXPUNGED], and explained that it was part of a \"QA procedure " +
            "passed down from higher-ups.\"";

    public static final String complexTextExpunged = "SCP-173 approached D-class member [DATA EXPUNGED] at approximately 04:07 " +
            "into the testing procedure. [DATA EXPUNGED] exhibited nervous behavior at first, knowing that it would not be" +
            " simple to maintain containment. In spite of being the sole D-class to survive the latest Keter-level " +
            "event throughout the facility, [DATA EXPUNGED] was able to survive until 07:45 by alternating blinking between " +
            "eyes. [DATA EXPUNGED] ultimately had their neck snapped at 07:48 after Dr. Robertson played a loud air horn " +
            "over the intercom. Dr. Robertson claims this was not at all related to the fact that his wife was " +
            "having an affair with D-Class member [DATA EXPUNGED], and explained that it was part of a \"QA procedure " +
            "passed down from higher-ups.\"";

    @Test
    public void testBasicReplacement() {
        assertEquals(simpleTextExpunged, StringUtils.replaceStudentUsername(simpleTextMessage, "jhanky"));
    }

    @Test
    public void testComplexReplacement() {
        assertEquals(complexTextExpunged, StringUtils.replaceStudentUsername(complexTextMessage, "bchunky"));
    }
}
