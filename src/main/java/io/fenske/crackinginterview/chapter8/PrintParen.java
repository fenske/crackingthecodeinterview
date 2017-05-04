package io.fenske.crackinginterview.chapter8;

public class PrintParen {

  public static void main(String[] args) {
    print(3);
  }

  public static void print(int count) {
    char[] str = new char[count * 2];
    print(count, count, str, 0);
  }

  private static void print(int l, int r, char[] str, int count) {
    if (l < 0 || r < l) return;
    if (l == 0 && r == 0) {
      System.out.println(str);
    } else {
      if (l > 0) {
        str[count] = '(';
        print(l - 1, r, str, count + 1);
      }
      if (r > 0) {
        str[count] = ')';
        print(l, r - 1, str, count + 1);
      }
    }

  }
}
