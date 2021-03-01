package edu.ant.algorithms.algo.sort.utils;

import edu.ant.algorithms.algo.sort.Sorter;
import java.util.Random;

public class SorterUtils {

    private static final Random RAND = new Random();

    private SorterUtils() {}

    public static String getName(Sorter sorter) {
        return sorter.getClass().getSimpleName();
    }

    public static int[] generateInput(int itemsNumber, int maxRange){
        int[] input = new int[itemsNumber];
        int i = 0;
        while (i < itemsNumber) {
            input[i++] = RAND.nextInt(maxRange);
        }
        return input;
    }

    public static long getTime(Sorter sorter) {
        long startTime = System.currentTimeMillis();
        sorter.sort();
        return System.currentTimeMillis() - startTime;
    }

}
