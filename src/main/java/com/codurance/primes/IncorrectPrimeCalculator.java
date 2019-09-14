package com.codurance.primes;

import java.math.BigInteger;
import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class IncorrectPrimeCalculator implements PrimeCalculator {

    private static final BigInteger OOPS_THIS_IS_NOT_A_PRIME_NUMBER = BigInteger.valueOf(Long.MAX_VALUE);

    @Override
    public BigInteger calculateLargestPrimeIn(Duration duration) {
        sleepForABit();
        return OOPS_THIS_IS_NOT_A_PRIME_NUMBER;
    }

    private void sleepForABit() {
        try {
            Thread.sleep(ofSeconds(1).toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
