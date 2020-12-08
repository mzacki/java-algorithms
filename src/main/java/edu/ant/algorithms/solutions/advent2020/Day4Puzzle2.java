package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Day4Puzzle2 {

    private static final String BIRTH_YEAR = "byr:";
    private static final String ISSUE_YEAR = "iyr:";
    private static final String EXP_YEAR = "eyr:";
    private static final String HEIGHT = "hgt:";
    private static final String HAIR = "hcl:";
    private static final String EYE = "ecl";
    private static final String PASS_ID = "pid:";
    private static final String COUNTRY_ID = "cid:";


    /**
     * Instead of an extense use of regex, one may make own validators
     */


    public static void main(String[] args) {
        InputStream is = Day4Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/input4.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        List<String> passports = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        // input format suitable to further work

        for (int i = 0; i < input.size(); i++) {

            if (input.get(i).isEmpty()) {
                passports.add(sb.toString());
                sb.setLength(0);
            }
            sb.append(input.get(i));
            sb.append(" ");
        }

        List<String> valids = passports.stream()
                .filter(s -> validate(s, BIRTH_YEAR))
                .filter(s -> validate(s, ISSUE_YEAR))
                .filter(s -> validate(s, EXP_YEAR))
                .filter(s -> validate(s, HEIGHT))
                .filter(s -> validate(s, HAIR))
                .filter(s -> validate(s, EYE))
                .filter(s -> validate(s, PASS_ID))
                .collect(Collectors.toList());

        LoggingService.logMessage(valids.size());
    }

    private static boolean validate(String s, String exp) {
        List<String> params = Arrays.asList(s.split(" "));
        Optional<String> param = params.stream().filter(p -> p.contains(exp)).findAny();

        //TODO replace this ugly IF
        if (param.isEmpty()) {
            return false;
        }
        //TODO replace this bad style get
        String paramString = param.get();

        switch (exp) {
            case BIRTH_YEAR:
                return validateYear(paramString, 1920L, 2002L);
            case ISSUE_YEAR:
                return validateYear(paramString, 2010L, 2020L);
            case EXP_YEAR:
                return validateYear(paramString, 2020L, 2030L);
            case HEIGHT:
                return validateHeight(paramString);
            case HAIR:
                return validateHair(paramString);
            case EYE:
                return validateEye(paramString);
            case PASS_ID:
                return validateNumber(paramString);
            default:
                return false;
        }
    }

    // validators can be refactored

    private static boolean validateYear(String s, long min, long max) {
        List<String> toValidate = Arrays.asList(s.split(":"));

        if (toValidate.size() != 2) {
            return false;
        }

        long year;

        try {
            year = Long.parseLong(toValidate.get(1));
        } catch (NumberFormatException e) {
            return false;
        }

        return year >= min && year <= max;
    }

    private static boolean validateHeight(String s) {
        List<String> toValidate = Arrays.asList(s.split(":"));
        if (toValidate.size() != 2) {
            return false;
        }

        if (toValidate.get(1).length() < 4 || toValidate.get(1).isEmpty()) {
            return false;
        }
        String unit = toValidate.get(1).substring(toValidate.get(1).length() - 2);
        long height;

        try {
            height = Long.parseLong(toValidate.get(1).substring(0, toValidate.get(1).length() - 2));
        } catch (NumberFormatException e) {
            return false;
        }

        if (unit.equals("cm")) {
            return height >= 150 && height <= 193;
        } else if (unit.equals("in")) {
            return height >= 59 && height <= 76;
        } else {
            return false;
        }

    }

    private static boolean validateNumber(String s) {
        List<String> toValidate = Arrays.asList(s.split(":"));

        if (toValidate.size() != 2) {
            return false;
        }

        if (toValidate.get(1).length() != 9) {
            return false;
        }

        try {
            Long.parseLong(toValidate.get(1));
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private static boolean validateEye(String s) {
        List<String> toValidate = Arrays.asList(s.split(":"));

        if (toValidate.size() != 2) {
            return false;
        }

        switch (toValidate.get(1)) {
            case "amb":
            case "blu":
            case "brn":
            case "gry":
            case "grn":
            case "hzl":
            case "oth":
                return true;
            default:
                return false;
        }
    }

    private static boolean validateHair(String s) {
        List<String> toValidate = Arrays.asList(s.split(":"));

        if (toValidate.size() != 2) {
            return false;
        }

        if (toValidate.get(1).charAt(0) != '#') {
            return false;
        }

        if (toValidate.get(1).substring(1).length() != 6) {
            return false;
        }

        // here it's easier to use regex instead of custom string to hex parsers / converters
        return toValidate.get(1).substring(1).matches("[0-9,abcdef]{6}");
    }

}
