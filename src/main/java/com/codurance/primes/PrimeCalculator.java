package com.codurance.primes;

import java.time.Duration;

public interface PrimeCalculator {

    long calculateLargestPrimeIn(Duration duration);

    static PrimeCalculator instance() {
        return new UnimplementedPrimeCalculator();
    }

}
