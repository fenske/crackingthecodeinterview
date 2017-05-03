package io.fenske.crackinginterview.chapter8;

public class Fibonacci {
  public static int fibRecursive(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibRecursive(n-2) + fibRecursive(n-1);
  }


  public static int fibIterative(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int f_n_2 = 0;
    int f_n_1 = 1;
    for (int i = 2; i <= n; i++) {
      int swap = f_n_1;
      f_n_1 += f_n_2;
      f_n_2 = swap;
    }
    return f_n_1;
  }
}
