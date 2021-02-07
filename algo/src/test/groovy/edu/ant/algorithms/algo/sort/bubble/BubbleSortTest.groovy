package edu.ant.algorithms.algo.sort.bubble

import spock.lang.Specification

class BubbleSortTest extends Specification {

    int[] input = [4, 7, 1, 2, 9, 34, 76, 12, 0]

    def "should sort input"() {
        given:
        BubbleSort bubbleSort = new BubbleSort(input)

        when:
        def result = bubbleSort.sort() as ArrayList<Integer>

        then:
        result == [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        given:
        BubbleSort bubbleSort = new BubbleSort(input)

        when:
        def result = bubbleSort.reverseSort() as ArrayList<Integer>

        then:
        result == [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }
    
}
