package io.fenske.crackinginterview.chapter9;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NumberOfCentCombinationsTest {

  @Test
  public void shouldReturnNumberOfCombinationToRepresentNCents() {
    assertThat(NumberOfCentCombinations.makeChange(10), equalTo(4));
  }
}
