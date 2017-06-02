package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import io.fenske.crackinginterview.hard.MaxSubsquare.Subsquare;
import org.junit.Test;

public class MaxSubsquareTest {

  @Test
  public void shouldFindMaxSubsquare() {
    int[][] matrix = {
        {0,0,0,0},
        {1,1,1,0},
        {1,0,1,0},
        {1,1,1,0}
    };
    Subsquare maxSubsquare = MaxSubsquare.findSquare(matrix);
    assertThat(maxSubsquare.row, equalTo(1));
    assertThat(maxSubsquare.column, equalTo(0));
    assertThat(maxSubsquare.size, equalTo(3));
  }
}
