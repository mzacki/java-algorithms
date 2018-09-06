package edu.ant.algorithms.concurrency.streams;

import edu.ant.algorithms.utils.logger.LoggingService;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
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

    }

}
