package edu.ant.algorithms.algo.shuffle;

import edu.ant.patterns.utils.logger.LoggingService;
import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {

    /**
     * for given int n
     * return all int values from 1 to n (inclusive)
     * in random order
     * */

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        LoggingService.logMsg(Arrays.toString(getRandomized(5)));
    }

    private static int[] getRandomized(int n) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        return shuffle(array);
    }
    
    private static int[] shuffle(int[] array) {
        // shuffles with any index - even if it had been shuffled before
        for (int i = 0; i < array.length; i++) {
            int randomIndex = RANDOM.nextInt(array.length);
            swap(array, i, randomIndex);
        }
        
        return array;
    }

    private static void swap(int[] array, int currentIndex, int randomIndex) {
        int temp = array[currentIndex];
        array[currentIndex] = array[randomIndex];
        array[randomIndex] = temp;
    }

}
