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

        int tensDigit = decimal / 10;
        int unitsDigit = decimal % 10;

        String result = tens[tensDigit] + units[unitsDigit];

        return result;
    }
}
