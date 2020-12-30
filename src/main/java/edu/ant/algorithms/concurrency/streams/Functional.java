package edu.ant.algorithms.concurrency.streams;

import edu.ant.utils.logger.LoggingService;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Functional interface - every interface with single abstract method (SAM).
 * Functional interface can still have multiple default method.
 * Interfaces with SAM can be used in lambda expressions.
 * */

public class Functional {

    private static final List<String> STRING_LIST = Arrays.asList("Commodore", "Amiga", "Atari");
    private static final List<Integer> INT_LIST = Arrays.asList(12, 13, 14, 15);

    public static void main(String[] args) {

        // implemented own custom functional interface with void() method
        CustomFunctional customFunctional = LoggingService::logMsg;

        // Consumer within Consumer
        Consumer<List<String>> stringConsumer = p -> p.forEach(customFunctional::display);
        stringConsumer.accept(STRING_LIST);

        // IntConsumer, specialized type of Consumer interface
        // accepts argument, returns nothing
        IntConsumer integerConsumer = customFunctional::display;
        integerConsumer.accept(1992);

        // Function accepts arg of first parametrized type and returns another (or the same) type
        // here list of Integers is transformed into stream of Integers with easy sum up.
        Function<List<Integer>, Stream<Integer>> function = Collection::stream;
        customFunctional.display(function.apply(INT_LIST).reduce(0, Integer::sum));

        // Unary, simplier than Function<String, String>
        UnaryOperator<String> unary = String::toUpperCase;
        customFunctional.display(unary.apply("Once upon a time there were beez in the beehive...."));

        LongFunction<Long> longFunction = l -> l * l;
        customFunctional.display(longFunction.apply(1243));

        // String to Int Function
        ToIntFunction<String> intFunction = String::length;
        customFunctional.display("Password length: " + intFunction.applyAsInt("MyImpossibleToBreakPass"));

        // Predicate - tests condition
        Predicate<String> predicate = s -> s.length() >= 8;

        customFunctional.display("Password has at least 8 chars: " + predicate.test("Pass123"));

    }


}
