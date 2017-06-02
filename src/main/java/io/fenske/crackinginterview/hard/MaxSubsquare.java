package io.fenske.crackinginterview.hard;

public class MaxSubsquare {

  public static Subsquare findSquare(int[][] matrix) {
    int currentMaxSize = 0;
    Subsquare sq = null;
    int col = 0;
    while (currentMaxSize < matrix.length - col) {
      for (int row = 0; row < matrix.length; row++) {
        int size = matrix.length - Math.max(row, col);
        while (size > currentMaxSize) {
          if (isSquare(matrix, row, col, size)) {
            currentMaxSize = size;
            sq = new Subsquare(row, col, size);
            break;
          }
          size--;
        }
      }
      col++;
    }
    return sq;
  }

  private static boolean isSquare(int[][] matrix, int row, int col, int size) {
    for (int j = 0; j < size; j++) {
      if (matrix[row][col+j] == 0) {
        return false;
      }
      if (matrix[row+size-1][col+j] == 0) {
        return false;
      }
    }
    for (int i = 1; i < size-1; i++) {
      if (matrix[row+i][col] == 0) {
        return false;
      }
      if (matrix[row+i][col+size-1] == 0) {
        return false;
      }
    }
    return true;
  }

  public static class Subsquare {
    public int row;
    public int column;
    public int size;

    public Subsquare(int row, int column, int size) {
      this.row = row;
      this.column = column;
      this.size = size;
    }
  }
}
