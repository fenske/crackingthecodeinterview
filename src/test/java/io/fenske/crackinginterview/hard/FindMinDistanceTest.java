package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindMinDistanceTest {

  @Test
  public void shouldFindMinDistance() {
    String[] words = {"h", "b", "c", "a", "c", "a", "d", "b"};
    assertThat(FindMinDistance.getMinDistance(words, "a", "b"), equalTo(1));
    assertThat(new FindMinDistance(words).getMinDistanceOptimized("a", "b"), equalTo(1));
    assertThat(FindMinDistance.getMinDistance(words, "d", "h"), equalTo(5));
    assertThat(new FindMinDistance(words).getMinDistanceOptimized("d", "h"), equalTo(5));
  }
}
