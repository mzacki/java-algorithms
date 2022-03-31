package edu.ant.algorithms.algo.search.duplicate

import spock.lang.Specification

class OneDuplicateSortedNumbersTest extends Specification {

    def "should find one duplicate in series that starts with 1"() {
        given:
        int[] input = [1, 2, 3, 4, 5, 6, 7, 8, 8]
        def sorter = new OneDuplicateSortedNumbers(input)

        expect:
        sorter.search() == 8

    }

    def "should return 0 if no duplicate found"() {
        given:
        int[] input = [1, 2, 3, 4, 5, 6, 7, 8]
        def sorter = new OneDuplicateSortedNumbers(input)

        expect:
        sorter.search() == 0

    }

}
