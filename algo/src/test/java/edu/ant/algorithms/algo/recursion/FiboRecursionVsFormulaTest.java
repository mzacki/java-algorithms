package edu.ant.algorithms.algo.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FiboRecursionVsFormulaTest {

    @Test
    void shouldReturnGIvenElement() throws Exception {
        // arrange;
        double result;
        // act
        result = FiboRecursionVsFormula.fibonacciFormula(7);
        // assert
        assertTrue(result == 13);
    }

}