package io.fenske.crackinginterview.chapter9;

public class NumberOfCentCombinations {
  public static int makeChange(int n) {
    return makeChange(n, 25);
  }

  private static int makeChange(int n, int denomination) {
    int nextDenomination = 0;
    switch (denomination) {
      case 25:
        nextDenomination = 10;
        break;
      case 10:
        nextDenomination = 5;
        break;
      case 5:
        nextDenomination = 1;
        break;
      case 1:
        return 1;
    }
    int ways = 0;
    for (int i = 0; i * denomination <= n; i++) {
      ways += makeChange(n - i * denomination, nextDenomination);
    }
    return ways;
  }
}
