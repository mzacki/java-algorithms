package edu.ant.algorithms.puzzle.solutions.hackerrank;

import edu.ant.patterns.utils.logger.LoggingService;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StackBalancedString {


    public static void main(String[] args) {

        // LoggingService.logMsg(checkBalance("{}()"));
        // LoggingService.logMsg(checkBalance("({()})"));
        // LoggingService.logMsg(checkBalance("{}("));
        // LoggingService.logMsg(checkBalance("[]"));
        // LoggingService.logMsg(checkBalance(""));
        LoggingService.logMsg(checkBalance("("));

    }

    private static boolean checkBalance(String input) {
        LinkedList<Character> stack = new LinkedList<>();

        char[] array = input.toCharArray();
        if (array.length <= 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        stack.push(array[0]);

        for (int i = 1; i < array.length; i++) {

            if (pairs.get(array[i]) != null && pairs.get(array[i]).equals(stack.peek())) {
                stack.pop();
                continue;
            }

            stack.push(array[i]);
        }

        LoggingService.logMsg(stack);

        return stack.isEmpty();
    }

}