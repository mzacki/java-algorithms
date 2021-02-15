package edu.ant.algorithms.algo.sort.insertion

import spock.lang.Specification

class InsertionSort3Test extends Specification {

    int[] input = [4, 7, 1, 2, 9, 34, 76, 12, 0]

    def "should sort input"() {
        given:
        InsertionSort3 insertionSort3 = new InsertionSort3(input)

        when:
        def result = insertionSort3.sort() as ArrayList<Integer>

        then:
        result == [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        given:
        InsertionSort3 insertionSort3 = new InsertionSort3(input)

        when:
        def result = insertionSort3.reverseSort() as ArrayList<Integer>

        then:
        result == [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }

}
