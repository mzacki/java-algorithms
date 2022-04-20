package edu.ant.algorithms.puzzle.solutions.hackerrank;

public class OneDimArrayPart2Recursive {

    public static boolean canWin(int leap, int[] game) {
        return canWinRecursive(0, leap, game);
    }

    private static boolean canWinRecursive(int index, int leap, int[] game) {

        if (index < 0 || game[index] != 0) return false;

        if (index + 1 >= game.length - 1 || index + leap >= game.length) return true;

        // mark field already checked - to avoid going round in circles
        game[index] = 2;

        return canWinRecursive(index - 1, leap, game) ||
                canWinRecursive(index + 1, leap, game) ||
                canWinRecursive(index + leap, leap, game);
    }

    public static void main(String[] args) {
        // example
        int[] array1 = {0, 1, 0, 1, 0, 1};
        int leap1 = 2;

        System.out.println(canWin(leap1, array1));
    }

}
