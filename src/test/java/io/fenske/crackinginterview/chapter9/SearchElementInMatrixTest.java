package io.fenske.crackinginterview.chapter9;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SearchElementInMatrixTest {

  @Test
  public void shouldSearchForElementInMatrix() {
    char[][] matrix = new char[3][3];
    matrix[0] = new char[]{'a', 'b', 'c'};
    matrix[1] = new char[]{'b', 'd', 'e'};
    matrix[2] = new char[]{'c', 'f', 'g'};
    assertThat(SearchElementInMatrix.exists(matrix, 'd'), is(true));
    assertThat(SearchElementInMatrix.exists(matrix, 'z'), is(false));
  }
}
