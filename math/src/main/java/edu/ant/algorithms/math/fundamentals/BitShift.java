package edu.ant.algorithms.math.fundamentals;

import java.util.Random;

public class BitShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));
    }

    public class BitManipulation {
        // TODO print it properly and make excercise from Eckel
        public static void main(String[] args) {
            Random rand = new Random(47);
            int i = rand.nextInt();
            int j = rand.nextInt();
            printBinaryInt("-1", -1);
            printBinaryInt("+1", +1);
            int maxpos = 2147483647;
            printBinaryInt("maxpos", maxpos);
            int maxneg = -2147483648;
            printBinaryInt("maxneg", maxneg);
            printBinaryInt("i", i);
            printBinaryInt("~i", ~i);
            printBinaryInt("-i", -i);
            printBinaryInt("j", j);
            printBinaryInt("i & j", i & j);
            printBinaryInt("i | j", i | j);
            printBinaryInt("i ^ j", i ^ j);
            printBinaryInt("i << 5", i << 5);
            printBinaryInt("i >> 5", i >> 5);
            printBinaryInt("(~i) >> 5", (~i) >> 5);
            printBinaryInt("i >>> 5", i >>> 5);
            printBinaryInt("(~i) >>> 5", (~i) >>> 5);
            long l = rand.nextLong();
            long m = rand.nextLong();
            printBinaryLong("-1L", -1L);
            printBinaryLong("+1L", +1L);
            long ll = 9223372036854775807L;
            printBinaryLong("maxpos", ll);
            long lln = -9223372036854775808L;
            printBinaryLong("maxneg", lln);
            printBinaryLong("l", l);
            printBinaryLong("~l", ~l);
            printBinaryLong("-l", -l);
            printBinaryLong("m", m);
            printBinaryLong("l & m", l & m);
            printBinaryLong("l | m", l | m);
            printBinaryLong("l ^ m", l ^ m);
            printBinaryLong("l << 5", l << 5);
            printBinaryLong("l >> 5", l >> 5);
            printBinaryLong("(~l) >> 5", (~l) >> 5);
            printBinaryLong("l >>> 5", l >>> 5);
            printBinaryLong("(~l) >>> 5", (~l) >>> 5);
        }
        static void printBinaryInt(String s, int i) {
            System.out.println(s + ", int: " + i + ", binary: " +
                    Integer.toBinaryString(i));
        }
        static void printBinaryLong(String s, long l) {
            System.out.println(s + ", long: " + l + ", binary: " +
                    Long.toBinaryString(l));
        }
    }
}
