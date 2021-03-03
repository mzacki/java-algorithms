package edu.ant.algorithms.algo.sort.radix

import spock.lang.Specification

class RadixSortTest extends Specification {

    def "should sort input"() {
        expect:
        RadixSort radixSort = new RadixSort(input as int[], 10, 2)
        result == radixSort.sort() as ArrayList<Integer>

        where:
        input                                | result
        [13]                                  | [13]
        [13, 22]                            | [13, 22]
        [56, 33, 18]                      | [18, 33, 56]
        [13, 43, 30, 73]                | [13, 30, 43, 73]
        [13, 43, 30, 73, 22]          | [13, 22, 30, 43, 73]
        [13, 43, 30, 73, 22, 15]    | [13, 15, 22, 30, 43, 73]
        [43, 73, 13, 23, 93, 34, 76, 12, 30] | [12, 13, 23, 30, 34, 43, 73, 76, 93]
    }

    def "should reverse sort input"() {
        expect:
        RadixSort radixSort = new RadixSort(input as int[], 10,  2)
        result == radixSort.reverseSort() as ArrayList<Integer>

        where:
        input                                | result
        [13]                                  | [13]
        [13, 22]                            | [13, 22]
        [56, 33, 18]                      | [18, 33, 56]
        [13, 43, 30, 73]                | [13, 30, 43, 73]
        [13, 43, 30, 73, 22]          | [13, 22, 30, 43, 73]
        [13, 43, 30, 73, 22, 15]    | [13, 15, 22, 30, 43, 73]
        [43, 73, 13, 23, 93, 34, 76, 12, 30] | [12, 13, 23, 30, 34, 43, 73, 76, 93]
    }
}