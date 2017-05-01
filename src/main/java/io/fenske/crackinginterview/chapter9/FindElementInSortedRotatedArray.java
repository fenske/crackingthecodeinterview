package io.fenske.crackinginterview.chapter9;

public class FindElementInSortedRotatedArray {
  public static int getIndex(int[] arr, int e) {
    int l = 0;
    int u = arr.length - 1;
    while (l <= u) {
      int m = (l + u) / 2;
      if (e == arr[m]) {
        return m;
      } else if (arr[l] <= arr[m]) {
        if (e > arr[m]) {
          l = m + 1;
        } else if (e >= arr[l]){
          u = m - 1;
        } else {
          l = m + 1;
        }
      } else if (e < arr[m]) {
        u = m - 1;
      } else if (e <= arr[u]) {
        l = m + 1;
      } else {
        u = m - 1;
      }
    }
    return -1;
  }
}
