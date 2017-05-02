package io.fenske.crackinginterview.chapter9;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SearchStringTest {

  @Test
  public void shouldSearchForString() {
    String[] arr = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
    assertThat(StringSearcher.searhIndex(arr, "ball"), equalTo(4));
  }
}
