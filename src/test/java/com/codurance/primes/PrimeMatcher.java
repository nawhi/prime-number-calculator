package com.codurance.primes;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.math.BigInteger;

class PrimeMatcher extends BaseMatcher<Long> {
    @Override
    public boolean matches(Object actual) {
        return actual instanceof Long
                && BigInteger.valueOf((Long) actual)
                             .isProbablePrime(Integer.MAX_VALUE);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a prime number");
    }

    @Override
    public void describeMismatch(Object item, Description description) {
        description.appendText(item + " is not a prime number");
    }

    static Matcher<Long> isPrime() {
        return new PrimeMatcher();
    }
}
