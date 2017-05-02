package io.fenske.crackinginterview.chapter9;

public class StringSearcher {
  public static int searhIndex(String[] arr, String str) {
    int lo = 0;
    int hi = arr.length - 1;
    while (lo <= hi) {
      if (!hasNonEmptyStringFromTheRight(arr, hi)) {
        return -1;
      }
      int mid = getIndexOfNextNonEmptyString(arr, lo, hi);
      if (arr[mid].compareTo(str) == 0) {
        return mid;
      }
      else if (arr[mid].compareTo(str) < 0) {
        lo = mid + 1;
      }
      else {
        hi = mid - 1;
      }
    }
    return -1;
  }

  private static int getIndexOfNextNonEmptyString(String[] arr, int lo, int hi) {
    int mid = (lo + hi) / 2;
    while("".equals(arr[mid]) && mid <= hi) {
      mid++;
    }
    return mid;
  }

  private static boolean hasNonEmptyStringFromTheRight(String[] arr, int hi) {
    int k = hi;
    while (k > 0 && "".equals(arr[k])) k--;
    return k > 0;
  }
}
