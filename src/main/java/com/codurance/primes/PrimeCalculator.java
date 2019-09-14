package com.codurance.primes;

import java.math.BigInteger;
import java.time.Duration;

public interface PrimeCalculator {

    BigInteger calculateLargestPrimeIn(Duration duration);

    static PrimeCalculator instance() {
        return new IncorrectPrimeCalculator();
    }

}
