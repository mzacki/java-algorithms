package edu.ant.algorithms.puzzle.solutions.advent2020;

import edu.ant.patterns.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day2Puzzle2 {

    public static void main(String[] args) {
        InputStream is = Day2Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/input2.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        long result = input.stream()
                .map(Day2Puzzle2::split)
                .filter(Day2Puzzle2::validate)
                .count();

        LoggingService.logMsg(result);

    }

    private static List<String> split(String s) {
        String[] temp = s.split(" ");
        String[] minMax = temp[0].split("-");
        String letter = temp[1].substring(0, 1);
        String toCheck = temp[2];
        return new ArrayList<>(Arrays.asList(minMax[0], minMax[1], letter, toCheck));
    }

    private static boolean validate(List<String> list) {
        char[] pass = list.get(3).toCharArray();
        char letter = list.get(2).toCharArray()[0];
        int firstPosition = Integer.parseInt(list.get(0)) - 1;
        int lastPostition = Integer.parseInt(list.get(1)) - 1;

        return pass[firstPosition] == letter ^ pass[lastPostition] == letter;

    }

}
