package io.fenske.crackinginterview.chapter9;

public class MergeArrays {
  public static int[] mergeArrays(int[] first, int[] second) {
    int[] merged = new int[first.length + second.length];
    int k = merged.length - 1;
    int i = first.length - 1;
    int j = second.length - 1;

    while (i >= 0 && j >= 0) {
      if (first[i] > second[j]) {
        merged[k--] = first[i--];
      } else {
        merged[k--] = second[j--];
      }
    }
    while (i >= 0) {
      merged[k--] = first[i--];
    }
    while (j >= 0) {
      merged[k--] = second[j--];
    }
    return merged;
  }
}
