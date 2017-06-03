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
}
