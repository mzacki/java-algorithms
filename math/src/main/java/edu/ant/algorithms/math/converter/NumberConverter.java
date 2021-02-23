package edu.ant.algorithms.math.converter;

public final class NumberConverter {

    private NumberConverter() {}

    /**
     * power of two value for given bit position:
     * current value of nth bit in binary number (if bit == 1)
     * starting from the rightmost: 2 to power 0 equals 1 (if bit == 1)
     * then 2 to 1st = 2, then 2 to 2nd = 4 and so on.
     * @param binary String representation of binary number
     * @return decimal number (long)
     */
    public static long binaryToDecimal(String binary) {
        long decimal = 0;
        long bitValue = 1;

        for (int bitPosition = binary.length() - 1; bitPosition >= 0; bitPosition--) {
            if (binary.charAt(bitPosition) == '1') {
                decimal += bitValue;
            }
            bitValue *= 2;
        }
        return decimal;
    }

    /**
     * divide by 2, remainder is least significant bit (LSB)
     * then divide quotient by 2, remainder is next LSB
     * repeat until quotient == 1
     * @param decimal (long)
     * @return String of binary number
     */
    public static String decimalToBinary(long decimal) {
        StringBuilder binaryBuilder = new StringBuilder();
        while (decimal > 0) {
            binaryBuilder.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binaryBuilder.toString().equals("") ?
                "0" : binaryBuilder.toString();
    }


    /**
     * supports power of n <= 16 (hex included)
     * similar to binary conversion but n power customizable
     * @param number (String)
     * @param n (int)
     * @return decimal (long)
     */
    public static long baseToDecimal(String number, int n) {
        long decimal = 0;
        int nthPower = 1;

        for(int digitPosition = number.length() - 1; digitPosition >= 0; digitPosition--) {
            int digit = charToInt(number.toUpperCase().charAt(digitPosition));
            decimal += (long) nthPower * digit;
            nthPower *= n;
        }
        return decimal;
    }

    /**
     * similar to decimal to binary but n power customizable
     * supports power of n <= 10
     * @param decimal (long)
     * @param n (int)
     * @return String of base n number
     */
    public static String decimalToBase(long decimal, int n) {
        StringBuilder numberBuilder = new StringBuilder();
        while (decimal > 0) {
            numberBuilder.insert(0, decimal % n);
            decimal /= n;
        }
        return numberBuilder.toString().equals("") ?
                "0" : numberBuilder.toString();
    }

    // TODO HEX converter (power of n > 10)

    private static int charToInt(char c) {
        if ((int) c >= 48 && (int) c <= 57) {
            return (int) c - 48;
        }

        if ((int) c >= 65 && (int) c <= 70) {
            return (int) c - 55;
        }
        throw new IllegalArgumentException();
    }



}
