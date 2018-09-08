package edu.ant.algorithms.concurrency.streams;

import edu.ant.algorithms.collections.generic.KeyValuePair;
import edu.ant.algorithms.utils.logger.LoggingService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;

/**
 * Arity (/ˈærɪti/ is the number of arguments or operands taken by a function or operation in logic,
 * mathematics, and computer science.
 * In logic and philosophy, it is also called adicity and degree. In linguistics, it is usually named valency.
 * Eg. unary, binary, ternary, monadic, polyvalent
 * Source: Wikipedia
 * */
public class TwoArityFunctional {

    private static final Map<Long, String> players = new HashMap<>();

    public static void main(String[] args) {

        players.put(1L, "Magnus Carlsen");
        players.put(2L, "Hikaru Nakamura");
        players.put(3L, "Fabiano Caruana");
        players.put(4L, "Jan Krzysztof");

        // bi-functional in replaceAll()
        players.replaceAll((id, oldValue) ->
                id < 10L ? oldValue : oldValue + " GM" );

        players.forEach(LoggingService::logTwoArgs);

        Map<Long, String> newMap = new HashMap<>();
        players.forEach(newMap::put);

        // bi-functional used within randomize()
        randomize(players).forEach(LoggingService::logTwoArgs);

    }

    private static<T, U> Map<T, U> randomize(Map<T, U> input) {
        List<T> keyList = new ArrayList<>(input.keySet());
        List<U> valueList = new ArrayList<>(input.values());
        Collections.shuffle(keyList);
        Collections.shuffle(valueList);
        Map<T, U> map = new HashMap<>();
        BiFunction<T, U, U> biFunction = map::put;

        for (int i = 0; i < keyList.size(); i++) {
            biFunction.apply(keyList.get(i), valueList.get(i));
        }

        return map;
    }

}
