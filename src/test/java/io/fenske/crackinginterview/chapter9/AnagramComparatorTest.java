package io.fenske.crackinginterview.chapter9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AnagramComparatorTest {

  @Test
  public void shouldSortSoThatAnagramsNextToEachOther() {
    String[] arr = {"abc", "cba", "dbc", "bca", "bcd"};
    Arrays.sort(arr, new AnagramComparator());
    Assert.assertArrayEquals(new String[]{"abc", "cba", "bca", "dbc", "bcd"}, arr);
  }
}
