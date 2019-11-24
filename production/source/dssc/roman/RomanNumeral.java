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

        int hundredsDigit = decimal / 100;
        int tensDigit = decimal % 100 / 10;
        int unitsDigit = decimal % 100 % 10;

        String result = hundreds[hundredsDigit] + tens[tensDigit] + units[unitsDigit];

        return result;
    }
}
