package dssc.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};

        int thousandsDigit = decimal / 1000;
        int hundredsDigit = decimal % 1000 / 100;
        int tensDigit = decimal % 100 / 10;
        int unitsDigit = decimal % 10;

        String result = thousands[thousandsDigit] +
                            hundreds[hundredsDigit] + tens[tensDigit] + units[unitsDigit];

        return result;
    }
}
