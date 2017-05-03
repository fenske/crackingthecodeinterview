package io.fenske.crackinginterview.chapter8;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class SubsetTest {

  @Test
  public void shouldReturnAllSubsetsOfSet() {
    List<Integer> set = new ArrayList<>();
    set.add(1);
    set.add(2);
    set.add(3);

    Assert.assertThat(Subset.getAllRecursively(set, 0).size(), equalTo(8));
    Assert.assertThat(Subset.getAllIteratively(set).size(), equalTo(8));
  }
}
