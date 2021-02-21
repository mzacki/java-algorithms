package edu.ant.algorithms.math.converter

import spock.lang.Specification

class NumberConverterTest extends Specification {


    def "should convert binary to decimal"() {
        given:
        String binary = "1011101"

        when:
        long decimal = NumberConverter.binaryToDecimal(binary)

        then:
        decimal == 93L
    }

    def "should convert decimal to binary"() {
        given:
        long decimal = 94L

        when:
        String binary = NumberConverter.decimalToBinary(decimal)

        then:
        binary == "1011110"
    }

}
