package edu.ant.algorithms.math.fundamentals;

public class Numbers {

    // Java is a strongly typed language. This means that every variable must have a declared type.

    /**
     * INTEGER TYPES
     * - int 4 bytes, range: –2,147,483,648 to 2,147,483, 647 (just over 2 billion)
     * - short 2 bytes, range: –32,768 to 32,767
     * - long 8 bytes, range: –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     * - byte 1 byte, range: –128 to 127
     * <p>
     * FLOATING-POINT TYPES follow the IEEE 754 specification
     * - float 4 bytes, range: ±3.40282347E+38F (6–7 significant decimal digits)
     * - double 8 bytes, range: ±1.79769313486231570E+308 (15 significant decimal digits)
     */

    /**
     * You can specify floating-point literals in hexadecimal. For example, 0.125
     * = 2 –3 can be written as 0x1.0p-3 . In hexadecimal notation, you use a p , not an e ,
     * to denote the exponent. (An e is a hexadecimal digit.) Note that the mantissa is
     * written in hexadecimal and the exponent in decimal. The base of the exponent
     * is 2, not 10.
     * */

    // if (x == Double.NaN) // shoud not be tested like this - it is never true
    // if (Double.isNaN(x)) is correct

    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println("i1: " + Long.toBinaryString(i1));
        int i2 = 0X2F; // Hexadecimal (uppercase)
        System.out.println("i2: " + Integer.toBinaryString(i2));
        System.out.println("i2: " + Long.toBinaryString(i2));
        int i3 = 0177; // Octal (leading zero)
        System.out.println("i3: " + Integer.toBinaryString(i3));
        System.out.println("i3: " + Long.toBinaryString(i3));
        char c = 0xffff; // max char hex value
        System.out.println("c: " + Integer.toBinaryString(c));
        System.out.println("c: " + Long.toBinaryString(c));
        byte b = 0x7f; // max byte hex value
        System.out.println("b: " + Integer.toBinaryString(b));
        System.out.println("b: " + Long.toBinaryString(b));
        short s = 0x7fff; // max short hex value
        System.out.println("s: " + Integer.toBinaryString(s));
        System.out.println("s: " + Long.toBinaryString(s));
        long n1 = 200L; // long suffix
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // float suffix
        float f3 = 1f; // float suffix
        double d1 = 1d; // double suffix
        double d2 = 1D; // double suffix
        // (Hex and Octal also work with long)
        // Since Java 7, binary are allowed with prefix 0b or 0B
        // underscores are allowed
        int binaryExample = 0b1001;
        int binaryUnderscored = 0b1111_0100_0010_0100_0000;

    }

    private class Exponents {

        /**
         * Bruce Eckel, Thinking in Java, p. 75 In science and engineering, ‘e’ refers to the base of natural
         * logarithms, approximately 2.718. (A more precise double value is available in Java as Math.E.) This is used
         * in exponentiation expressions such as 1.39 x e -43 , which means 1.39 x 2.718 -43 . However, when the FORTRAN
         * programming language was invented, they decided that e would mean “ten to the power”, which is an odd
         * decision because FORTRAN was designed for science and engineering, and one would think its designers would be
         * sensitive about introducing such an ambiguity. 2 At any rate, this custom was followed in C, C++ and now
         * Java. So if you’re used to thinking in terms of e as the base of natural logarithms, you must do a mental
         * translation when you see an expression such as 1.39 e-43f in Java; it means 1.39 x 10 -43 .
         */

        // static possible in private class since JDK16
        public static void main(String[] args) {
            // Uppercase and lowercase ‘e’ are the same:
            float expFloat = 1.39e-43f;
            expFloat = 1.39E-43f;
            System.out.println(expFloat);
            double expDouble = 47e47d; // ‘d’ is optional
            double expDouble2 = 47e47; // Automatically double
            System.out.println(expDouble);
            System.out.println(expDouble2);

            //TODO Display the largest and smallest numbers for both float and double exponential notation.
            var maximalFloatValue = Float.MAX_VALUE;
            System.out.println(maximalFloatValue);
            // convert to exp notation and print
        }
    }

    /**
     * WHY TO USE BIG DECIMAL FOR FINANCIAL CALCULATIONS?
     *
     * System.out.println(2.0 - 1.1) prints 0.8999999999999999 , not 0.9
     *
     * Such roundoff errors are caused by the fact that floating-point numbers are
     * represented in the binary number system.
     *
     * There is no precise binary representation of the fraction 1/10, just as there is no accurate representation of the
     * fraction 1/3 in the decimal system.
     * */
}
