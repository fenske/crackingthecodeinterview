package io.fenske.crackinginterview.hard;

public class CountNumberOf2s {
  public static int getCountOfTwosRecursive(int n) {
    if (n == 0) {
      return 0;
    }
    int power = getPower(n);
    int first = n / power;
    int remainder = n % power;
    return getNumberOfTwosFromFirstDigit(power, first, remainder)
        + first * getCountOfTwosRecursive(power - 1)
        + getCountOfTwosRecursive(remainder);
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

  public static int getCountOfTwosIterative(int num) {
    int countOf2s = 0;
    int seenDigits = 0;
    int position = 0;
    int pow10Position = 1;
    int j = num;
    while (j > 0) {
      int digit = j % 10;
      int pow10PositionMinus1 = pow10Position / 10;
      countOf2s += digit * position * pow10PositionMinus1;
      if (digit == 2) {
        countOf2s += seenDigits + 1;
      } else if (digit > 2) {
        countOf2s += pow10Position;
      }
      seenDigits += pow10Position * digit;
      pow10Position *= 10;
      position++;
      j /= 10;
    }
    return countOf2s;
  }

}
