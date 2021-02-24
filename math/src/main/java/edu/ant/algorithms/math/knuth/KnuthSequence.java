package edu.ant.algorithms.math.knuth;

import java.util.ArrayList;
import java.util.List;

public class KnuthSequence {

    private KnuthSequence() {}

    public static long getHighestOfRange(int range) {
        long h = 1;
        long h1 = 1;
        while (h <= range && h1 <= range) {
            h = 3 * h + 1;
            h1 = 3 * h + 1;
        }
        return h;
    }

    public static long[] getSequenceOfRange(int range) {
        List<Long> list = new ArrayList<>();
        long h = 1;
        long h1 = 1;
        while (h <= range && h1 <= range) {
            h = 3 * h + 1;
            h1 = 3 * h + 1;
            list.add(h);
        }
        return list.stream().mapToLong(l -> l).toArray();
    }

}
