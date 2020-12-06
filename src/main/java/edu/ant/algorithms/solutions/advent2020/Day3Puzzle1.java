package edu.ant.algorithms.solutions.advent2020;

import edu.ant.algorithms.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day3Puzzle1 {

    public static void main(String[] args) {
        InputStream is = Day3Puzzle1.class.getClassLoader().getResourceAsStream("advent2020/input3.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        List<Character> characterList = new ArrayList<>();
        for (int stringIndex = 1, letterIndex = 3; stringIndex < input.size() && letterIndex <= 30;
                stringIndex++, letterIndex += 3) {

            if (input.get(stringIndex).charAt(letterIndex) == '#') {
                characterList.add(input.get(stringIndex).charAt(letterIndex));
            }

            if (letterIndex + 3 > 30) {
                letterIndex = (letterIndex + 3 - 30) - 4;
            }
        }

        LoggingService.logMessage(characterList.size());

    }

}
