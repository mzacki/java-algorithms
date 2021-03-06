package edu.ant.algorithms.algo.sort.counting

import spock.lang.Specification

class CountingSortTest extends Specification {

    def "should sort input"() {
        expect:
        CountingSort countingSort = new CountingSort(input as int[])
        result == countingSort.sort() as ArrayList<Integer>

        where:
        input | result
        [13] | [13]
        [13, 22] | [13, 22]
        [56, 33, 8, 456] | [8, 33, 56, 456]
        [13, 4, 0, 7, 22] | [0, 4, 7, 13, 22]
        [13, 4, 0, 7, 22, 156] | [0, 4, 7, 13, 22, 156]
        [4, 7, 1, 2, 9, 34, 76, 12, 0] | [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        expect:
        CountingSort countingSort = new CountingSort(input as int[])
        result == countingSort.reverseSort() as ArrayList<Integer>

        where:
        input | result
        [13] | [13]
        // TODO explain why cannot be already sorted
        // TODO add already sorted case to other algorithms
        // [3, 2, 1] | [3, 2, 1]
        [2, 13] | [13, 2]
        [56, 33, 8, 456] | [456, 56, 33, 8]
        [13, 4, 0, 7, 22] | [22, 13, 7, 4, 0]
        [13, 4, 0, 7, 22, 156] | [156, 22, 13, 7, 4, 0]
        [4, 7, 1, 2, 9, 34, 76, 12, 0] | [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }

}
