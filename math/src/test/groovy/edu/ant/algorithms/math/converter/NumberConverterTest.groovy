package edu.ant.algorithms.math.converter

import spock.lang.Specification

class NumberConverterTest extends Specification {


    def "should convert binary to decimal"() {
        given:
        String binary = "01011101"

        when:
        long decimal = NumberConverter.binaryToDecimal(binary)

        then:
        decimal == 93L
    }

}
