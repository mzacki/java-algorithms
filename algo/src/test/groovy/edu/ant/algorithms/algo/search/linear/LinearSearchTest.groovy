package edu.ant.algorithms.algo.search.linear

import spock.lang.Specification

class LinearSearchTest extends Specification {

    int[] input = [1, 2, 3, 4, 5, 6, 7, 8]

    def "O(n) - should return array length as max steps"() {
        given:
        LinearSearch linearSearch = new LinearSearch(input, 8);

        when:
        linearSearch.search();

        then:
        linearSearch.maxStep() == input.length
    }

    def "data-driven test"() {
        expect:
        LinearSearch linearSearch = new LinearSearch(input, target)
        result == linearSearch.search()
        step == linearSearch.getStep()

        where:
        target | result | step
         8       |    7      |    8
        10      |   -1      |    8
         1       |    0      |    1
    }

}
