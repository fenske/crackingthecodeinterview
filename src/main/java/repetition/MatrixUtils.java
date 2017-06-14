package repetition;

public class MatrixUtils {
  public static void rotateBy90Degrees(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0, hi = matrix.length; i < matrix.length / 2; i++, hi--) {
      for (int j = i; j < hi - 1; j++) {
        int swap = matrix[i][j];
        matrix[i][j] = matrix[n-1-j][i];
        matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
        matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
        matrix[j][n-1-i] = swap;
      }
    }
  }
}
