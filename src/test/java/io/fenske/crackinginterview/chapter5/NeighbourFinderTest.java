package io.fenske.crackinginterview.chapter5;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NeighbourFinderTest {

  @Test
  public void shouldFindNextSmallestNumberWithSameNumberOfOnes() throws Exception {
//    assertThat(NeighbourFinder.findNextSmallest(5), equalTo(3));
    assertThat(NeighbourFinder.findNextSmallest(11), equalTo(7));
  }

  @Test
  public void shouldFindNextBiggestNumberWithSameNumberOfOnes() throws Exception {
//    assertThat(NeighbourFinder.findNextBiggest(5), equalTo(6));
    assertThat(NeighbourFinder.findNextBiggest(11), equalTo(14));
  }
}
