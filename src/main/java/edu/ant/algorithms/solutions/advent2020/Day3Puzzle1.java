package edu.ant.algorithms.solutions.advent2020;

import edu.ant.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day3Puzzle1 {

    private static final int RIGHT = 3;
    private static final int DOWN = 1;

    public static void main(String[] args) {
        InputStream is = Day3Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/input3.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        List<Character> characterList = new ArrayList<>();
        for (int stringIndex = DOWN, charIndex = RIGHT; stringIndex < input.size() && charIndex <= 30;
                stringIndex++, charIndex += RIGHT) {

            if (input.get(stringIndex).charAt(charIndex) == '#') {
                characterList.add(input.get(stringIndex).charAt(charIndex));
            }

            if (charIndex + RIGHT > 30) {
                charIndex = (charIndex + RIGHT - 30) - RIGHT - 1;
            }
        }

        LoggingService.logMessage(characterList.size());

    }

}
