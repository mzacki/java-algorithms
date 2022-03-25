package edu.ant.algorithms.puzzle.solutions.hackerrank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BigDec {

    public static void main(String[] args) {

        String[] s = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        List<String> input = Arrays.asList(s);

        Map<String, BigDecimal> map = new HashMap<>();

        input.forEach(sitem -> map.put(sitem, new BigDecimal(sitem)));

        Map<String, BigDecimal> topTen =
                map.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        ArrayList<String> list = new ArrayList<>();

        topTen.forEach((k, v) -> list.add(k));

        for (int i = 0; i < list.size(); i++) {
            s[i] = list.get(i);
        }

        System.out.println(Arrays.toString(s));
    }

}
