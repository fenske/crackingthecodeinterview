package io.fenske.crackinginterview.hard;

public class NoArithmetic {
  public static int add(int first, int second) {
    if (second == 0) {
      return first;
    }
    int sum = first ^ second;
    int carrying = (first & second) << 1;
    return add(sum, carrying);
  }
}
