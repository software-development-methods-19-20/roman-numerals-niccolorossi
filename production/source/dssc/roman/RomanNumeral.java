package dssc.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if (decimal == 0) {
            return "";
        } else if (decimal < 4) {
            return "I".repeat(decimal);
        } else if (decimal == 4) {
            return "IV";
        } else if (decimal < 9) {
            return "V".concat("I".repeat(decimal-5));
        } else if (decimal == 9) {
            return "IX";
        } else if (decimal == 10) {
            return "X";
        } else if (decimal < 14) {
            return "X".concat("I".repeat(decimal-10));
        } else return "";

    }
}
