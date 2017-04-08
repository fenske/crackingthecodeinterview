package io.fenske.crackinginterview.chapter5;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class BitSwapperTest {

  @Test
  public void shouldSwapOddAndEvenBits() {
    Assert.assertThat(BitSwapper.swap(11), CoreMatchers.equalTo(7));
  }
}
