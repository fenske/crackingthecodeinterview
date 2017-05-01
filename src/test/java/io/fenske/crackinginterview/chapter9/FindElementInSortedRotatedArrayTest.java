package io.fenske.crackinginterview.chapter9;

import org.junit.Assert;
import org.junit.Test;

public class FindElementInSortedRotatedArrayTest {

  @Test
  public void shouldFindElementInSortedRotatedArray() {
    int[] a = {15,16,19,20,1,3,4,5,7,10,14};
    Assert.assertEquals(7, FindElementInSortedRotatedArray.getIndex(a, 5));
  }
}
