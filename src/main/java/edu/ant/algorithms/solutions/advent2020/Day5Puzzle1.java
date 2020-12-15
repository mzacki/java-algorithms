package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class Day5Puzzle1 {


    public static void main(String[] args) throws IOException {
        InputStream is = Day5Puzzle1.class.getClassLoader().getResourceAsStream("advent2020/input5.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        Integer max = input.stream()
                .map(Day5Puzzle1::toId)
                .mapToInt(v -> v)
                .max()
                .orElseThrow();

        LoggingService.logTwoArgs(max);

        // min value is needed for Day5Puzzle2

        Integer min = input.stream()
                .map(Day5Puzzle1::toId)
                .mapToInt(v -> v)
                .min()
                .orElseThrow();

        LoggingService.logTwoArgs(min);

        // print out ids needed for Day5Puzzle2
        List<String> output = input.stream().map(Day5Puzzle1::toId).map(Object::toString).collect(Collectors.toList());
        try (PrintWriter pw = new PrintWriter(
                "src/main/resources/advent2020/output5.txt", StandardCharsets.UTF_8)) {
            output.forEach(pw::println);
        }
    }

    private static int toId(String s) {

        int row = findRow(s.substring(0, 7).toCharArray());
        int col = findCol(s.substring(7).toCharArray());

        return row * 8 + col;
    }

    private static int findRow(char[] rows) {
        int minRow = 0;
        int maxRow = 127;
        for (char ch: rows) {
            int middle = minRow + (maxRow - minRow) / 2;
            if (ch == 'F') {
                maxRow = middle;
            }
            if (ch == 'B') {
                minRow = middle + 1;
            }
        }
        return minRow;
    }

    private static int findCol(char[] cols) {
        int minCol = 0;
        int maxCol = 7;

        for (char ch: cols) {
            int middle = minCol + (maxCol - minCol) / 2;
            if (ch == 'L') {
                maxCol = middle;
            }
            if (ch == 'R') {
                minCol = middle + 1;
            }
        }
        return minCol;
    }

}
