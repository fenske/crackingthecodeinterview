package io.fenske.crackinginterview.chapter5;

import static io.fenske.crackinginterview.chapter5.BinaryTransformer.getRequiredNumberOfBits1;
import static io.fenske.crackinginterview.chapter5.BinaryTransformer.getRequiredNumberOfBits2;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTransformerTest {

  @Test
  public void shouldReturnNumberOfDigitsToTransformOneToAnother() {
    int a = 31;
    int b = 14;
    Assert.assertThat(getRequiredNumberOfBits1(a, b), equalTo(2));
    Assert.assertThat(getRequiredNumberOfBits2(a, b), equalTo(2));
  }
}
