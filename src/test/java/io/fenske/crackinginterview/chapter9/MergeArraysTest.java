package io.fenske.crackinginterview.chapter9;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeArraysTest {

  @Test
  public void shouldMergeTwoSortedArrays() {
    int[] a = {2,4,5,6,8};
    int[] b = {1,3,7};

    assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, MergeArrays.mergeArrays(a, b));
  }
}
