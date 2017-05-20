package io.fenske.crackinginterview.hard;

import static io.fenske.crackinginterview.hard.Shuffler.shuffle;
import static java.util.Arrays.sort;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.stream.IntStream;

public class FindLargestNumbersTest {

  @Test
  public void shouldFindLargestNumbers() {
    int[] numbers = IntStream.range(0, 100).toArray();
    shuffle(numbers);
    int[] expected = {90,91,92,93,94,95,96,97,98,99};
    int[] actual = FindLargestNumbers.getLargestNumbers(numbers, 10);
    sort(actual);
    assertArrayEquals(expected, actual);
  }
}
