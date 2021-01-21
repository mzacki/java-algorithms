package edu.ant.algorithms.puzzle.solutions.advent2020;

import edu.ant.patterns.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day5Puzzle2 {

    private static final int ROWS = 128; // indexes 0-127
    private static final int COLS = 8; // indexes 0-7

    public static void main(String[] args) {
        InputStream is = Day5Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/output5.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        final int allSeats = ROWS * COLS;

        List<Integer> availableSeats = new ArrayList<>();
        // row 0 and 127 not considered
        // total: allSeats - front and back rows
        for (int i = 1; i < 127; i++) {
            for (int j = 0; j < 8; j++) {
                int id =i * 8 + j;
                availableSeats.add(id);
            }
        }

        List<Integer> freeSeats = availableSeats.stream()
                .filter(s -> !input.contains(s.toString()))
                .filter(s -> s < 991) // max taken seat id from previous puzzle
                .filter(s -> s > 46) // min taken seat id from previous puzzle
                .collect(Collectors.toList());

        freeSeats.forEach(LoggingService::logMsg);
    }

}
