package edu.ant.algorithms.solutions.advent2020;

import edu.ant.algorithms.utils.logger.LoggingService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day3Puzzle2 {

    private static final int RIGHT_1 = 1;
    private static final int RIGHT_3 = 3;
    private static final int RIGHT_5 = 5;
    private static final int RIGHT_7 = 7;
    private static final int DOWN_1 = 1;
    private static final int DOWN_2 = 2;
    private static final char TREE = '#';

    public static void main(String[] args) {
        int rightOne = getSlope(RIGHT_1, DOWN_1);
        int rightThree = getSlope(RIGHT_3, DOWN_1);
        int rightFive = getSlope(RIGHT_5, DOWN_1);
        int rightSeven = getSlope(RIGHT_7, DOWN_1);
        int downTwo = getSlope(RIGHT_1, DOWN_2);

        LoggingService.logMessage(rightOne);
        LoggingService.logMessage(rightThree);
        LoggingService.logMessage(rightFive);
        LoggingService.logMessage(rightSeven);
        LoggingService.logMessage(downTwo);
        LoggingService.logMessage("=======");
        LoggingService.logMessage((long) rightOne * rightThree * rightFive * rightSeven * downTwo);

    }

    public static int getSlope(int right, int down) {

        InputStream is = Day3Puzzle2.class.getClassLoader().getResourceAsStream("advent2020/input3.txt");
        List<String> input = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.toList());

        int stringLastIndex = input.get(0).length() - 1;

        List<Character> characterList = new ArrayList<>();
        for (int stringIndex = down, charIndex = right; stringIndex < input.size() && charIndex <= stringLastIndex;
                stringIndex += down, charIndex += right) {

            if (input.get(stringIndex).charAt(charIndex) == TREE) {
                characterList.add(input.get(stringIndex).charAt(charIndex));
            }

            if (charIndex + right > stringLastIndex) {
                charIndex = (charIndex + right - stringLastIndex) - right - 1;
            }
        }
        return characterList.size();
    }

}
