package edu.ant.algorithms.puzzle.solutions.advent2020;

import edu.ant.patterns.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day6Puzzle2 {

    public static void main(String[] args) {
        InputStream is = Day6Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/input6.txt");
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

        Long result = answers.stream()
                .map(a -> {

                    int size = a.size();
                    StringBuilder sb = new StringBuilder();
                    a.forEach(sb::append);
                    char[] array = sb.toString().toCharArray();

                    List<Character> list = new ArrayList<>();
                    for (int i = 0; i < array.length; i++) {
                        list.add(array[i]);
                    }

                    return list.stream()
                            .filter(e -> list.stream()
                                    .filter(x -> x.equals(e))
                                    .count() == size)
                            .distinct()
                            .collect(Collectors.toList());
                })
                .map(List::size)
                .mapToLong(Integer::longValue)
                .sum();

        LoggingService.logMsg(result);
    }

}
