package edu.ant.algorithms.math.fundamentals;

public class Numbers {

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
    }

    private class Exponents {

        /**
         * Bruce Eckel, Thinking in Java, p. 75
         * In science and engineering, ‘e’ refers to the base of natural logarithms, approximately 2.718.
         * (A more precise double value is available in Java as Math.E.) This is used in exponentiation
         * expressions such as 1.39 x e -43 , which means 1.39 x 2.718 -43 . However, when the FORTRAN
         * programming language was invented, they decided that e would mean “ten to the power”,
         * which is an odd decision because FORTRAN was designed for science and engineering, and
         * one would think its designers would be sensitive about introducing such an ambiguity. 2 At
         * any rate, this custom was followed in C, C++ and now Java. So if you’re used to thinking in
         * terms of e as the base of natural logarithms, you must do a mental translation when you see
         * an expression such as 1.39 e-43f in Java; it means 1.39 x 10 -43 .
         *
         * */

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
}
