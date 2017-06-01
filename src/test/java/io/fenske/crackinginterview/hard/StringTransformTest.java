package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.hasItems;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class StringTransformTest {

  @Test
  public void shouldTransformOneWordToAnother() {
    Set<String> dictionary = new HashSet<>();
    dictionary.add("lamp");
    dictionary.add("lime");
    dictionary.add("limp");
    dictionary.add("like");
    dictionary.add("damp");
    Assert.assertThat(StringTransformator.transform("damp", "like", dictionary), hasItems("damp", "lamp", "limp", "lime", "like"));
  }
}
