package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 20.12.2018 at 20:06.
 */

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int MB = kiloBytes / 1024;
        int KB = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB" + " = " + MB + " MB and " + KB + " KB");
        }
    }
}
