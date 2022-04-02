package edu.ant.algorithms.math.fibonacci

import spock.lang.Specification
import spock.lang.Unroll

class FibonacciFasterTest extends Specification {

    @Unroll
    def "should return nth number"() {
        expect:
        FibonacciFaster.fiboN(n) == m

        where:
        n | m
        1 | 0
        2 | 1
        3 | 1
        4 | 2
        5 | 3
        6 | 5
        7 | 8
        8 | 13
    }

}
