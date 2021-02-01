package edu.ant.algorithms.algo.search.binary


import edu.ant.algorithms.math.logarithm.Logarithm
import spock.lang.Specification

class BinarySearchTest extends Specification {

    int[] input = [1, 2, 3, 4, 5, 6, 7, 8]

    def "O(log n) - should return log 2 of array length as max steps"() {
        given:
        BinarySearch binarySearch = new BinarySearch(input, 8);

        when:
        binarySearch.search();

        then:
        binarySearch.maxStep() == Logarithm.of(2, input.length)
    }

    def "data-driven test"() {
        expect:
        BinarySearch binarySearch = new BinarySearch(input, target)
        result == binarySearch.search()
        step == binarySearch.getStep()

        where:
        target | result | step
        8       |    7      |    4
        10     |   -1      |    4
        1       |    0      |    3
    }
}
