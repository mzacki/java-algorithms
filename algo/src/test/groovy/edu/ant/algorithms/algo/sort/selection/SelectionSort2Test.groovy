package edu.ant.algorithms.algo.sort.selection

import spock.lang.Specification

class SelectionSort2Test extends Specification {

    int[] input = [4, 7, 1, 2, 9, 34, 76, 12, 0]

    def "should sort input"() {
        given:
        SelectionSort2 selectionSort2 = new SelectionSort2(input)

        when:
        def result = selectionSort2.sort() as ArrayList<Integer>

        then:
        result == [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        given:
        SelectionSort2 selectionSort2 = new SelectionSort2(input)

        when:
        def result = selectionSort2.reverseSort() as ArrayList<Integer>

        then:
        result == [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }

}
