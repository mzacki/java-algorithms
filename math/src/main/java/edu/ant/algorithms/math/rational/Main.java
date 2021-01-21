package edu.ant.algorithms.math.rational;

public class Main {

    public static void main(String[] args) {
        System.out.println("From integer: " + RationalNumber.fromInteger(6));
        System.out.println("From numerator and denominator: " + RationalNumber.ofNumAndDen(5, 1));
        System.out.println("Multiply: " + RationalNumber.fromInteger(6).multiply(RationalNumber.ofNumAndDen(5, 1)));


    }

}
