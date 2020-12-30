package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day4Puzzle1 {

    private static final String BIRTH_YEAR = "byr:";
    private static final String ISSUE_YEAR = "iyr:";
    private static final String EXP_YEAR = "eyr:";
    private static final String HEIGHT = "hgt:";
    private static final String HAIR = "hcl:";
    private static final String EYE = "ecl";
    private static final String PASS_ID = "pid:";
    private static final String COUNTRY_ID = "cid:";


    public static void main(String[] args) {
        InputStream is = Day4Puzzle1.class.getClassLoader().getResourceAsStream("advent2020/input4.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        List<String> passports = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.size(); i++) {

            if (input.get(i).isEmpty()) {
                passports.add(sb.toString());
                sb.setLength(0);
            }
            sb.append(input.get(i));
        }

        LoggingService.logMsg(passports.size());

        long valid = passports.stream()
                .filter(s -> s.contains(BIRTH_YEAR))
                .filter(s -> s.contains(ISSUE_YEAR))
                .filter(s -> s.contains(EXP_YEAR))
                .filter(s -> s.contains(HEIGHT))
                .filter(s -> s.contains(HAIR))
                .filter(s -> s.contains(EYE))
                .filter((s -> s.contains(PASS_ID)))
                .count();

        LoggingService.logMsg(valid);

        passports.forEach(s -> LoggingService.logMsg(s));
    }



}
