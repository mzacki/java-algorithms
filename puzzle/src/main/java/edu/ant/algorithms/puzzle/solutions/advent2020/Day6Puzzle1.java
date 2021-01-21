package edu.ant.algorithms.puzzle.solutions.advent2020;

import edu.ant.patterns.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day6Puzzle1 {

    public static void main(String[] args) {
        InputStream is = Day6Puzzle1.class.getClassLoader().getResourceAsStream("advent2020/input6.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        List<List<String>> answers = new ArrayList<>();

        List<String> group = new ArrayList<>();
        for (String s : input) {

            if (s.isBlank()) {
                answers.add(new ArrayList<>(group));
                group.clear();
                continue;
            }
            group.add(s);
        }

        Long joint = answers.stream()
                .map(a -> {
                    StringBuilder sb = new StringBuilder();
                    a.forEach(sb::append);
                    return sb.toString();
                })
                .map(String::toCharArray)
                .map(a -> {
                    List<Character> list = new ArrayList<>();
                    for (int i = 0; i < a.length; i++) {
                        list.add(a[i]);
                    }
                    return list;
                })
                .map(a -> a.stream()
                        .distinct()
                        .count())
                .mapToLong(Long::longValue)
                .sum();

        LoggingService.logMsg(joint);
    }

}
