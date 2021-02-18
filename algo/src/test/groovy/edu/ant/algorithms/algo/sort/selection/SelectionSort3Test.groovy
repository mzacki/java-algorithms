package edu.ant.algorithms.algo.sort.selection

import spock.lang.Specification

class SelectionSort3Test extends Specification {
    
    int[] input = [4, 7, 1, 2, 9, 34, 76, 12, 0]

    def "should sort input"() {
        given:
        SelectionSort3 selectionSort3 = new SelectionSort3(input)

        when:
        def result = selectionSort3.sort() as ArrayList<Integer>

        then:
        result == [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        given:
        SelectionSort3 selectionSort3 = new SelectionSort3(input)

        when:
        def result = selectionSort3.reverseSort() as ArrayList<Integer>

        then:
        result == [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }
}
