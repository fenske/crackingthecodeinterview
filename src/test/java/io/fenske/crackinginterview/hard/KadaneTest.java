package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class KadaneTest {

  @Test
  public void shouldFindMaxSumSubarray() {
    int[] arr = {1, -3, 2, 1, -1};
    Assert.assertThat(Kadane.getMaxElementSum(arr), equalTo(3));
  }
}
