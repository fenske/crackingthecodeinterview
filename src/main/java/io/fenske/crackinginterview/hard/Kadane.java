package io.fenske.crackinginterview.hard;

public class Kadane {
  public static int getMaxElementSum(int[] arr) {
    int maxCurrent = arr[0];
    int maxGlobal = arr[0];
    for (int i = 1; i < arr.length; i++) {
      maxCurrent = Math.max(arr[i], arr[i] + maxCurrent);
      if (maxCurrent > maxGlobal) {
        maxGlobal = maxCurrent;
      }
    }
    return maxGlobal;
  }


  public static int getMaxSubmatrixSum(int[][] matrix) {
    int width = matrix[0].length;
    int height = matrix.length;
    int currentResult;
    int maxSum = Integer.MIN_VALUE;

    for (int leftColumn = 0; leftColumn < width; leftColumn++) {
      int[] tmp = new int[height];
      for (int rightColumn = leftColumn; rightColumn < width; rightColumn++) {
        for (int i = 0; i < height; i++) {
          tmp[i] += matrix[i][rightColumn];
        }
        currentResult = getMaxElementSum(tmp);
        if (currentResult > maxSum) {
          maxSum = currentResult;
        }
      }
    }
    return maxSum;
  }
}
