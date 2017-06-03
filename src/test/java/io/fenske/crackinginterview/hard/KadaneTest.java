package io.fenske.crackinginterview.hard;

import static io.fenske.crackinginterview.hard.Kadane.getMaxElementSum;
import static io.fenske.crackinginterview.hard.Kadane.getMaxSubmatrixSum;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class KadaneTest {

  @Test
  public void shouldFindMaxSumSubarray() {
    int[] arr = {1, -3, 2, 1, -1};
    assertThat(getMaxElementSum(arr), equalTo(3));
  }

  @Test
  public void shouldFindMaxSubmatrix() {
    int[][] matrix = new int[][] {
        {1, 2, -1, -4, -20},
        {-8, -3, 4, 2, 1},
        {3, 8, 10, 1, 3},
        {-4, -1, 1, 7, -6}
    };
    assertThat(getMaxSubmatrixSum(matrix), equalTo(29));
  }
}
