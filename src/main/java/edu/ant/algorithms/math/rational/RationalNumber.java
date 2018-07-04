package edu.ant.algorithms.math.rational;

public final class RationalNumber {

    private final int numerator;
    private final int denominator;

    private RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private RationalNumber(int integer) {
        this(integer, 1);
    }

    // use static factory methods instead of public constructors - good practice according to Effective Java
    public static RationalNumber ofNumAndDen(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalDenominatorException("Denominator in rational number has to be non-zero");
        }
        return new RationalNumber(numerator, denominator);
    }

    public static RationalNumber fromInteger(int integer) {
        return new RationalNumber(integer);
    }

    public RationalNumber multiply(RationalNumber number) {
        int resultNumerator = this.numerator * number.numerator;
        int resultDenominator = this.denominator * number.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber divide(RationalNumber number) {
        int resultNumerator = this.numerator * number.denominator;
        int resultDenominator = this.denominator * number.numerator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber getOpposite() {
        return new RationalNumber(-numerator, denominator);
    }

    public RationalNumber getInverse() {
        return new RationalNumber(denominator, numerator);
    }

    // gcd: greatest common divisor (aka gcf, greatest common factor)
    // using Euclidean algorithm
    private int gcd(int a, int b) {
        return b == 0 ? a : Math.abs(gcd(b, a % b));
    }

    public RationalNumber reduce() {
        int gcd = gcd(denominator, numerator);

        return denominator < 0 ?
                new RationalNumber(-1 * numerator / gcd, -1 * denominator / gcd) :
                new RationalNumber(numerator / gcd, denominator / gcd);
    }

    public RationalNumber add(RationalNumber number) {
        int resultDenominator = this.denominator * number.denominator;
        int resultNumerator = this.numerator * number.denominator
                + this.denominator * number.numerator;
        return new RationalNumber(resultNumerator, resultDenominator).reduce();
    }

    public RationalNumber add(int integer) {
        return this.add(new RationalNumber(integer));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RationalNumber) {
            RationalNumber number = (RationalNumber) obj;
            return this.denominator * number.numerator == this.numerator * number.denominator;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

}


