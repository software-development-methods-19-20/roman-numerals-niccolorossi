package test.roman;

import dssc.roman.RomanNumeral;
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

    @Test
    void threeIsIII() {
        check(3, "III");
    }

    @Test
    void fourIsIV() {
        check(4, "IV");
    }

    @Test
    void fiveIsV() {
        check(5, "V");
    }

    @Test
    void eightIsVIII() {
        check(8, "VIII");
    }

    @Test
    void nineIsIX() {
        check(9, "IX");
    }

    @Test
    void tenIsX() {
        check(10, "X");
    }

    @Test
    void elevenIsXI() {
        check(11, "XI");
    }

    @Test
    void thirteenIsXIII() {
        check(13, "XIII");
    }

    @Test
    void thirtynineIsXXXIX() {
        check(39, "XXXIX");
    }

    @Test
    void fortyfiveIsXLV() {
        check(45, "XLV");
    }

    @Test
    void fiftynineIsLIX() {
        check(59, "LIX");
    }

    @Test
    void ninetytwoIsXCII() {
        check(92, "XCII");
    }

}
