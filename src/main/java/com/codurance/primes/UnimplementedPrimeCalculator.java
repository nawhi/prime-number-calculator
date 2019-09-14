package com.codurance.primes;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class UnimplementedPrimeCalculator implements PrimeCalculator {

    @Override
    public long calculateLargestPrimeIn(Duration duration) {
        sleepFor(ofSeconds(1));
        return Long.MAX_VALUE;
    }

    private void sleepFor(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
