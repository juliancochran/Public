import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @Test
    public void romanToDecimalTest() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("MCMLXIV"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("XIXIXIXI"), 42);
    }
}