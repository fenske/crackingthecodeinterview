package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CountNumberOf2sTest {

  @Test
  public void shouldCountNumberOf2s() {
    assertThat(CountNumberOf2s.getCountOfTwosRecursive(513), equalTo(202));
    assertThat(CountNumberOf2s.getCountOfTwosIterative(513), equalTo(202));
  }
}
