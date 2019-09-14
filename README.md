# Prime Number Calculator
This is a small kata for practicing some basic topics around concurrent programming in Java.

## Instructions
You are given an interface, `PrimeCalculator`, an implementation, `IncorrectPrimeCalculator`, and two failing unit tests in `PrimeCalculatorTest`. 

Your task is to reimplement the interface (or correct and rename `IncorrectPrimeCalculator`) to pass the two given tests. 

You may create other objects or unit tests, but you should not change the `PrimeCalculator` interface nor the existing acceptance test.

You can implement it any way you like but try one or both of the following:
* Manually, using a volatile variable to hold the result and a separate `Thread` to do the work
* Using the [`CompletableFuture` API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)
