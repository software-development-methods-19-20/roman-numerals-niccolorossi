package dssc.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        int tensDigit = decimal / 10;
        int unitsDigit = decimal % 10;
        String result = "";

        if (tensDigit < 4) {
            result += "X".repeat(tensDigit);
        } else if (tensDigit == 4) {
            result += "XL";
        } else if (tensDigit < 9) {
            result += "L".concat("X".repeat(tensDigit-5));
        } else if (tensDigit == 9) {
            result += "XC";
        } else result += "";

        if (unitsDigit < 4) {
            result += "I".repeat(unitsDigit);
        } else if (unitsDigit == 4) {
            result += "IV";
        } else if (unitsDigit < 9) {
            result += "V".concat("I".repeat(unitsDigit-5));
        } else if (unitsDigit == 9) {
            result += "IX";
        } else result += "";

        return result;
    }
}
