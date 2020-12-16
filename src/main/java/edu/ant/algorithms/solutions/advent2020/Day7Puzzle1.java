package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day7Puzzle1 {

    static final long[] counter = {0};
    static List<String> keysToCheck = new ArrayList<>();
    static List<String> keysToCheck2 = new ArrayList<>();
    static List<String> keysToCheck3 = new ArrayList<>();
    static List<String> keysToCheck4 = new ArrayList<>();
    static List<String> keysToCheck5 = new ArrayList<>();
    static List<String> keysToCheck6 = new ArrayList<>();
    static List<String> keysToCheck7 = new ArrayList<>();
    static List<String> keysToCheck8 = new ArrayList<>();
    static List<String> keysToCheck9 = new ArrayList<>();
    static List<String> keysToCheck10 = new ArrayList<>();

    public static void main(String[] args) {
        InputStream is = Day7Puzzle1.class.getClassLoader().getResourceAsStream("advent2020/input7.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        Map<String, List<String>> map = new LinkedHashMap<>();
        input.forEach(i -> {
            String[] firstSplit = i.split("contain");
            String key = firstSplit[0].replace(" bags", "").stripTrailing();
            String[] secondSplit = firstSplit[1].split(",");
            map.put(key, Arrays.asList(secondSplit));
        });

        // 1st iteration
        map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains("shiny gold"))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck.add(key);
            }
        });

        // 2nd iteration
        keysToCheck.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck2.add(key);
            }
        }));

        // 3rd iteration
        keysToCheck2.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck3.add(key);
            }
        }));

        // 4th iteration
        keysToCheck3.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck4.add(key);
            }
        }));

        // 5th iteration
        keysToCheck4.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck5.add(key);
            }
        }));

        // 6th iteration
        keysToCheck5.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck6.add(key);
            }
        }));

        // 7th iteration
        keysToCheck6.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck7.add(key);
            }
        }));

        // 8th iteration
        keysToCheck7.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck8.add(key);
            }
        }));

        // 9th iteration
        keysToCheck8.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck9.add(key);
            }
        }));

        // 10th iteration
        keysToCheck9.forEach(k -> map.forEach((key, value) -> {
            long occurences = value.stream()
                    .filter(s -> s.contains(k))
                    .count();

            counter[0] = counter[0] + occurences;

            if (occurences > 0) {
                keysToCheck10.add(key);
            }
        }));

       long result = Stream.of(keysToCheck, keysToCheck2, keysToCheck3, keysToCheck4, keysToCheck5, keysToCheck6,
                keysToCheck7, keysToCheck8, keysToCheck9, keysToCheck10)
               .flatMap(Collection::stream)
               .distinct()
               .count();

        LoggingService.logMessage("counter: " + Arrays.toString(counter));
        LoggingService.logMessage("keys to check" + keysToCheck);
        LoggingService.logMessage("keys to check" + keysToCheck2);
        LoggingService.logMessage("keys to check" + keysToCheck3);
        LoggingService.logMessage("keys to check" + keysToCheck4);
        LoggingService.logMessage("keys to check" + keysToCheck5);
        LoggingService.logMessage("keys to check" + keysToCheck6);
        LoggingService.logMessage("keys to check" + keysToCheck7);
        LoggingService.logMessage("keys to check" + keysToCheck8);
        LoggingService.logMessage("keys to check" + keysToCheck9);
        LoggingService.logMessage("keys to check" + keysToCheck10);

        LoggingService.logMessage(result);
    }

}
