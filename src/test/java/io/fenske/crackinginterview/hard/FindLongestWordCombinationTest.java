package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindLongestWordCombinationTest {

  @Test
  public void shouldFindLongestNumberCombination() {
    String[] words = { "test", "tester", "testertest", "testing", "testingtester" };
    assertThat(FindLongestWordCombination.getLongestWordCombination(words), equalTo("testingtester"));
  }
}
