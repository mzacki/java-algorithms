package edu.ant.algorithms.data.structures.iterator

import spock.lang.Specification

class ArrayIteratorTest extends Specification {


    def "should create iterator and iterate through elements"() {
        given:
        Integer[] array = [0, 1]
        ArrayIterator<Integer> iterator = new ArrayIterator(array)

        when:
        def initialCheck = iterator.hasNext()
        def firstIteration = iterator.next()
        def secondIteration = iterator.next()
        def finalCheck = iterator.hasNext()

        then:
        initialCheck
        !finalCheck
        firstIteration == 0
        secondIteration == 1
    }

    def "should throw if no such element"() {
        given:
        Integer[] array = []
        ArrayIterator<Integer> iterator = new ArrayIterator(array)

        when:
        def initialCheck = iterator.hasNext()
        iterator.next()

        then:
        !initialCheck
        thrown(NoSuchElementException.class)
    }

}
