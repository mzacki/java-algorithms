package edu.ant.algorithms.math.knuth

import spock.lang.Specification

class KnuthSequenceTest extends Specification {

    def "should return highest Knuth number within given range"() {
        when:
        def result = KnuthSequence.getHighestOfRange(41)

        then:
        result == 40
    }

    def "should return array of Knuth numbers"() {
        when:
        def result = KnuthSequence.getSequenceOfRange(41) as ArrayList<Integer>

        then:
        result == [4, 13, 40]
    }

}
