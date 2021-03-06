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

    def "should convert n base number to decimal"() {
        expect:

        NumberConverter.baseToDecimal(number, n) == decimal

        where:
        number     | n | decimal
        "1011101" | 2   |   93
        "1011110" | 2   |   94
        "94"           | 10 |   94
        "112"         | 8   |   74
        "764"         | 8   |   500
        "1000"       | 4   |   64
        "FFFFFF"    | 16  |  16777215
    }

    def "should convert decimal to n base number"() {
        expect:
        NumberConverter.decimalToBase(decimal, n) == number

        where:
        number     | n | decimal
        "1011101" | 2   |   93
        "1011110" | 2   |   94
        "94"           | 10 |   94
        "112"         | 8   |   74
        "764"         | 8   |   500
        "1000"       | 4   |   64
    }

}
