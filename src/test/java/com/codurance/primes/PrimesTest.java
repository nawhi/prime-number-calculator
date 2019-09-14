package com.codurance.primes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.Duration;

import static com.codurance.primes.PrimeMatcher.isPrime;
import static java.time.Duration.ofMillis;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

class PrimesTest {

    private static final Duration HALF_A_SECOND = Duration.ofMillis(500);
    private PrimeCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = PrimeCalculator.instance();
    }

    @Test
    void returns_a_prime_number() {
        BigInteger result = calculator.calculateLargestPrimeIn(HALF_A_SECOND);
        assertThat(result, isPrime());
    }

    @Test
    void does_not_take_longer_than_specified_time() {
        Duration actualDuration = executeAndTime(() -> calculator.calculateLargestPrimeIn(HALF_A_SECOND));
        assertThat(actualDuration, lessThanOrEqualTo(HALF_A_SECOND));
    }

    private Duration executeAndTime(Runnable function) {
        long start = System.currentTimeMillis();
        function.run();
        long end = System.currentTimeMillis();

        return ofMillis(end - start);
    }

}
