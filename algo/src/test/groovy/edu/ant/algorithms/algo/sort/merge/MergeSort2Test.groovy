package edu.ant.algorithms.algo.sort.merge

import spock.lang.Specification

class MergeSort2Test extends Specification {

    def "should sort input"() {
        expect:
        MergeSort2 mergeSort = new MergeSort2(input as int[])
        result == mergeSort.sort() as ArrayList<Integer>

        where:
        input | result
        [13] | [13]
        [13, -22] | [-22, 13]
        [56, 33, -8, 456] | [-8, 33, 56, 456]
        [13, 4, 0, -7, -22] | [-22, -7, 0, 4, 13]
        [13, 4, 0, -7, -22, 156] | [-22, -7, 0, 4, 13, 156]
        [4, 7, 1, 2, 9, 34, 76, 12, 0] | [0, 1, 2, 4, 7, 9, 12, 34, 76]
    }

    def "should reverse sort input"() {
        expect:
        MergeSort2 mergeSort = new MergeSort2(input as int[])
        result == mergeSort.reverseSort() as ArrayList<Integer>

        where:
        input | result
        [13] | [13]
        [13, -22] | [13, -22]
        [56, 33, -8, 456] | [456, 56, 33, -8]
        [13, 4, 0, -7, -22] | [13, 4, 0, -7, -22]
        [13, 4, 0, -7, -22, 156] | [156, 13, 4, 0, -7, -22]
        [4, 7, 1, 2, 9, 34, 76, 12, 0] | [76, 34, 12, 9, 7, 4, 2, 1, 0]
    }

}