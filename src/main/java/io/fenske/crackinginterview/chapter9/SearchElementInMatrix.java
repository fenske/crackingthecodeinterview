package io.fenske.crackinginterview.chapter9;

public class SearchElementInMatrix {
  public static boolean exists(char[][] matrix, char e) {
    int row = 0;
    int col = matrix[0].length - 1;
    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == e) {
        return true;
      } else if (matrix[row][col] > e) {
        col--;
      } else {
        row++;
      }
    }
    return false;
  }
}
