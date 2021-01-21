package edu.ant.algorithms.math.prime;

import static edu.ant.algorithms.math.prime.PrimeFinder.isPrime;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Created by Matt on 06.11.2018 at 20:35.
 */

class PrimeFinderTest {

    @Test
    void shouldCheckIfPrimeCorrectly() {
        // arrange
        int n = 7;
        // act
        boolean result = isPrime(n);
        // assert
        assertTrue(result);
    }
}