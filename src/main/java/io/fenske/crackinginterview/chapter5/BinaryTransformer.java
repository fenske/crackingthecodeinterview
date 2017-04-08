package io.fenske.crackinginterview.chapter5;

public class BinaryTransformer {
  public static int getRequiredNumberOfBits1(int a, int b) {
    int num = 0;
    while (!(a == 0 && b == 0)) {
      if (a % 2 != b % 2) {
        num++;
      }
      a /= 2;
      b /= 2;
    }
    return num;
  }

  public static int getRequiredNumberOfBits2(int a, int b) {
    int num = 0;
    for (int c = a^b; c != 0; c >>= 1) {
      num += c & 1;
    }
    return num;
  }
}
