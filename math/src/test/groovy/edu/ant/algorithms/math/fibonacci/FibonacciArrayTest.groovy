package edu.ant.algorithms.math.fibonacci

import spock.lang.Specification
import spock.lang.Unroll

class FibonacciArrayTest extends Specification {

   @Unroll
    def "should return correct Fibo sequence until nth number"() {
        expect:
        FibonacciArray.countSequence(n) == sequence as int[]

        where:
        n   | sequence
        1   | [0]
        2   | [0, 1]
        3   | [0, 1, 1]
        10 | [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }

}
