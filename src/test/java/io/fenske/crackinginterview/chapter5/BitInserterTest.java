package io.fenske.crackinginterview.chapter5;

import static io.fenske.crackinginterview.chapter5.BitUpdater.getUpdatedBits;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BitInserterTest {

  @Test
  public void shouldInsertSecondNumberIntoFirstNumber() {
    int n = Integer.valueOf("10000000000", 2);
    int m = Integer.valueOf("10101", 2);
    int i = 2;
    int j = 6;
    assertThat(Integer.toBinaryString(getUpdatedBits(n, m, i, j)), equalTo("10001010100"));
  }
}
