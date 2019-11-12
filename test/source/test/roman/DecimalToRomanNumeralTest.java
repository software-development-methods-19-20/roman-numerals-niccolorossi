package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DecimalToRomanNumeralTest {

    private void check(int decimal, String expected) {
        RomanNumeral romanNumeral = new RomanNumeral(decimal);
        assertEquals(expected, romanNumeral.toString());
    }

    // first test: verifying that 0 returns empty string
    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    // verifying that 1 returns string "I"
    @Test
    void oneIsI() {
        check(1, "I");
    }

    @Test
    void twoIsII() {
        check(2, "II");
    }

}
