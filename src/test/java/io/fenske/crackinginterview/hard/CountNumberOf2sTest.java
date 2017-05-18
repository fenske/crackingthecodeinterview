package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CountNumberOf2sTest {

  @Test
  public void shouldCountNumberOf2s() {
    assertThat(CountNumberOf2s.getCountOfTwos(513), equalTo(202));
  }
}
