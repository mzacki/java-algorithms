package edu.ant.algorithms.algo.sort.insertion

import edu.ant.algorithms.algo.sort.bubble.BubbleSort
import spock.lang.Specification

class InsertionSortTest extends Specification {
    int[] input = [4, 7, 1, 2, 9, 34, 76, 12, 0]

    def "should sort input"() {
        given:
        InsertionSort insertionSort = new InsertionSort(input)

        when:
        def result = insertionSort.sort() as ArrayList<Integer>

        then:
        result == [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        given:
       InsertionSort insertionSort = new InsertionSort(input)

        when:
        def result = insertionSort.reverseSort() as ArrayList<Integer>

        then:
        result == [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }
}
