package io.fenske.crackinginterview.chapter8;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void shouldProduceCorrectFibonacciNumbersRecursively() {
    assertThat(Fibonacci.fibRecursive(12), equalTo(144));
    assertThat(Fibonacci.fibRecursive(20), equalTo(6765));
  }

  @Test
  public void shouldProduceCorrectFibonacciNumbersIteratively() {
    assertThat(Fibonacci.fibIterative(12), equalTo(144));
    assertThat(Fibonacci.fibRecursive(20), equalTo(6765));
  }
}
