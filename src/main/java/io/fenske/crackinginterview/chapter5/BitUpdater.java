package io.fenske.crackinginterview.chapter5;

public class BitUpdater {
  public static int getUpdatedBits(int n, int m, int i, int j) {
    return (n & getMask(i, j)) | (m << i);
  }

  private static int getMask(int i, int j) {
    return getRightPartOfMask(i) | getLeftPartOfMask(j);
  }

  private static int getRightPartOfMask(int i) {
    return (1 << i) - 1;
  }

  private static int getLeftPartOfMask(int j) {
    return ~0 - getRightPartOfMask(j);
  }
}
