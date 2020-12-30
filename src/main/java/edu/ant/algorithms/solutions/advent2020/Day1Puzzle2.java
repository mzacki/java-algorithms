package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day1Puzzle2 {


    public static void main(String[] args) {
        InputStream is = Day1Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/input1.txt");
        List<Long> longs = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .map(Long::valueOf)
                .collect(Collectors.toList());

        // finds and prints all threesomes that sum up to given value
        List<List<Long>> threesomes = new ArrayList<>();

        longs.forEach(l -> longs.forEach(m -> longs.stream()
                .filter(n -> n + m + l == 2020).forEach(n -> threesomes.add(new ArrayList<>(Arrays.asList(n, m, l))))));

        threesomes.forEach(LoggingService::logMsg);

        // getting the result
        List<Long> result = threesomes.stream()
                .map(sublist -> sublist.stream()
                        .reduce(((long) 1), (a, b) -> a * b))
                .distinct()
                .collect(Collectors.toList());

        result.forEach(LoggingService::logMsg);
    }

}
