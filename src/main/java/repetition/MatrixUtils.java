package repetition;

public class MatrixUtils {
  public static void rotateBy90Degrees(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0, hi = matrix.length; i < matrix.length / 2; i++, hi--) {
      for (int j = i; j < hi - 1; j++) {
        int swap = matrix[i][j];
        matrix[i][j] = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = swap;
      }
    }
  }

  public static void zeroRowAndColumn(int[][] matrix) {
    boolean[] rows = new boolean[matrix.length];
    boolean[] columns = new boolean[matrix[0].length];
    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < columns.length; j++) {
        if (matrix[i][j] == 0) {
          rows[i] = true;
          columns[j] = true;
        }
      }
    }
    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < columns.length; j++) {
        if (rows[i] || columns[j])
          matrix[i][j] = 0;
      }
    }
  }
}
