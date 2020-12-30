package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day1Puzzle1 {

    public static void main(String[] args) {
        InputStream is = Day1Puzzle1.class.getClassLoader().getResourceAsStream("advent2020/input1.txt");
        List<Long> longs = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .map(Long::valueOf)
                .collect(Collectors.toList());

        // finds and prints all pairs that sum up to given value
        Map<Long, Long> pairs = new HashMap<>();

        longs.forEach(l -> longs.stream()
                .filter(n -> n + l == 2020).forEach(n -> pairs.put(l, n)));

        pairs.forEach(LoggingService::logTwoArgs);

        //  getting the result
        List<Long> result = pairs
                .entrySet()
                .stream()
                .map(e -> e.getKey() * e.getValue())
                .distinct()
                .collect(Collectors.toList());

        result.forEach(LoggingService::logMsg);
    }

}
