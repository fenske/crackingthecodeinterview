package io.fenske.crackinginterview.chapter5;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DecimalConverterTest {

  @Test
  public void shouldConvertDecimalToBinary() throws Exception {
    String decimalStr = "5.5";
    assertThat(DecimalConverter.convertDecimalToBinary(decimalStr), equalTo("101.1"));
  }
}
