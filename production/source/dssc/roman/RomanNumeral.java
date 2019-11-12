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
        } else return "IX";
    }
}
