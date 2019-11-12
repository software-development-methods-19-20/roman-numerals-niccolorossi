package dssc.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        int decimalDigit = decimal / 10;
        int unitDigit = decimal % 10;
        String result = "";

        if(decimalDigit < 4) {
            result += "X".repeat(decimalDigit);
        } else result += "";

        if (unitDigit < 4) {
            result += "I".repeat(unitDigit);
        } else if (unitDigit == 4) {
            result += "IV";
        } else if (unitDigit < 9) {
            result += "V".concat("I".repeat(unitDigit-5));
        } else if (unitDigit == 9) {
            result += "IX";
        } else result += "";

        return result;
    }
}
