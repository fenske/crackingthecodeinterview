package io.fenske.crackinginterview.chapter8;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PermutationTest {

  @Test
  public void shouldFindAllPermutations() {
    Set<String> expected = new HashSet<>();
    expected.add("abc");
    expected.add("acb");
    expected.add("bac");
    expected.add("bca");
    expected.add("cab");
    expected.add("cba");
    Assert.assertThat(Permutation.getPermutations("abc").size(), equalTo(expected.size()));
  }
}
