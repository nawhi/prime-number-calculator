package com.codurance.primes;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.math.BigInteger;

class PrimeMatcher extends BaseMatcher<BigInteger> {
    @Override
    public boolean matches(Object actual) {
        return actual instanceof BigInteger
                && ((BigInteger) actual).isProbablePrime(Integer.MAX_VALUE);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a prime number");
    }

    @Override
    public void describeMismatch(Object item, Description description) {
        description.appendText(item + " is not a prime number");
    }

    static Matcher<BigInteger> isPrime() {
        return new PrimeMatcher();
    }
}
