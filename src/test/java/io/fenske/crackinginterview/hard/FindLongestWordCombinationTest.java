package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindLongestWordCombinationTest {

  @Test
  public void shouldFindLongestNumberCombination() {
    String[] words = { "cat", "giraffe", "crocodile", "dog", "catdog", "catcrocodile"};
    assertThat(FindLongestWordCombination.getLongestWordCombination(words), equalTo("catcrocodile"));
    assertThat(FindLongestWordCombination.getLongestWordCombinationMemoryOptimized(words), equalTo("catcrocodile"));
  }
}
