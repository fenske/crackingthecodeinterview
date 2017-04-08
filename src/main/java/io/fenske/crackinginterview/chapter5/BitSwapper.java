package io.fenske.crackinginterview.chapter5;

public class BitSwapper {
  public static int swap(int num) {
    return num >> 1 & 0x55555555 | num << 1 & 0xaaaaaaaa;
  }
}
