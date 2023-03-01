package edu.ant.algorithms.puzzle.solutions.codewars;

import java.util.stream.Collectors;

public class SquareDigits {

   public static int squareDigits(int n) {
       return Integer.parseInt(String.valueOf(n)
               .chars()
               .map(i -> Integer.parseInt(String.valueOf((char) i)))
               .map(i -> i * i)
               .mapToObj(String::valueOf)
               .collect(Collectors.joining()));
   }

}
