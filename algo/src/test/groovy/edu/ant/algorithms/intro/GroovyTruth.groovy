package edu.ant.algorithms.intro

import spock.lang.Specification

class GroovyTruth extends Specification{

    def "assert true"() {
        expect:
        assert true
    }

    def "assert !false"() {
        expect:
        assert !false // redunant, simplification possible
    }

    def "assert true || false"() {
        expect:
        assert true || false // redunant, simplification possible
    }

    def "assert true && !false"() {
        expect:
        assert true && !false // redundant, simplification possible
    }

    def "non-empty string is true"() {
        given:
        String name = "non-empty"
        expect:
        name // no need to use assert keyword
    }

    def "empty string is false"() {
        given:
        String name = ""
        expect:
        !name
    }

    def "valid (non null) reference is true"() {
        given:
        def ref = new GroovyExample()
        expect:
        assert ref
    }

    def "null object is false"() {
        given:
        def ref
        // or
        // GroovyExample ref = new GroovyExample()
        expect:
        assert !ref
    }

    def "zero is false"() {
        given:
        def zero = 0
        expect:
        assert !zero
    }

    def "non-zero is true"() {
        given:
        def nonzero = 99
        expect:
        assert nonzero
    }

    def "empty collection is false"() {
        given:
        def empty = []
        expect:
        assert !empty
    }

    def "non-empty collection is true"() {
        given:
        def nonempty = ["item"]
        expect:
        assert nonempty
    }

}
