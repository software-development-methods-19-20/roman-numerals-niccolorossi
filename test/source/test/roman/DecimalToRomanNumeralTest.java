package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DecimalToRomanNumeralTest {

    // first test: verifying that 0 returns empty string
    @Test
    void zeroIsEmptyString() {
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("", romanNumeral.toString());
    }

}
