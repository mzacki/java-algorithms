package edu.ant.algorithms.math.converter;

public final class NumberConverter {

    private NumberConverter() {}

    public static long binaryToDecimal(String binary) {
        long decimal = 0;
        /**
         * power of two value for given bit position:
         * current value of nth bit in binary number (if bit == 1)
         * starting from the rightmost: 2 to power 0 equals 1 (if bit == 1)
         * then 2 to 1st = 2, then 2 to 2nd = 4 and so on.
         * */
        long bitValue = 1;

        for (int bitPosition = binary.length() - 1; bitPosition >= 0; bitPosition--) {
            if (binary.charAt(bitPosition) == '1') {
                decimal += bitValue;
            }
            bitValue *= 2;
        }
        return decimal;
    }

    public static String decimalToBinary(long decimal) {
        StringBuilder binaryBuilder = new StringBuilder();
        /**
         * divide by 2, remainder is least significant bit (LSB)
         * then divide quotient by 2, remainder is next LSB
         * repeat until quotient == 1
         * */
        while(decimal > 0) {
            binaryBuilder.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binaryBuilder.toString().equals("") ?
                "0" : binaryBuilder.toString();
    }

}
