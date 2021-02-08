package edu.ant.algorithms.algo.sort.bubble

import spock.lang.Specification

class BubbleSort3Test extends Specification {

    int[] input = [4, 7, 1, 3, 9, 34, 76, 13, 0]

    def "should sort input"() {
        given:
        BubbleSort3 bubbleSort3 = new BubbleSort3(input)

        when:
        def result = bubbleSort3.sort() as ArrayList<Integer>

        then:
        result == [0, 1, 3, 4, 7, 9, 13, 34, 76]
    }

    def "should reverse sort input"() {
        given:
        BubbleSort3 bubbleSort3 = new BubbleSort3(input)

        when:
        def result = bubbleSort3.reverseSort() as ArrayList<Integer>

        then:
        result == [76, 34, 13, 9, 7, 4, 3, 1, 0]
    }
    
}
