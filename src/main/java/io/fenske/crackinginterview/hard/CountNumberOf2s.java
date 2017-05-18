package io.fenske.crackinginterview.hard;

public class CountNumberOf2s {
  public static int getCountOfTwos(int n) {
    if (n == 0) {
      return 0;
    }
    int power = getPower(n);
    int first = n / power;
    int remainder = n % power;
    return getNumberOfTwosFromFirstDigit(power, first, remainder)
        + first * getCountOfTwos(power - 1)
        + getCountOfTwos(remainder);
  }

  private static int getPower(int n) {
    int power = 1;
    while (10 * power < n) {
      power *= 10;
    }
    return power;
  }

  private static int getNumberOfTwosFromFirstDigit(int power, int first, int remainder) {
    int nTwosFirst = 0;
    if (first > 2) {
      nTwosFirst += power;
    } else if (first == 2) {
      nTwosFirst += remainder + 1;
    }
    return nTwosFirst;
  }
}
