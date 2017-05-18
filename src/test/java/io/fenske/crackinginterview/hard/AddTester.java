package io.fenske.crackinginterview.hard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AddTester {

  @Test
  public void shouldAddNumbers() {
    assertThat(NoArithmetic.add(-123, 485), equalTo(362));
  }
}
