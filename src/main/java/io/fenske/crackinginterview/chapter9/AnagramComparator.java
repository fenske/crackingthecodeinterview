package io.fenske.crackinginterview.chapter9;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
  @Override
  public int compare(String str1, String str2) {
    return sortChars(str1).compareTo(sortChars(str2));
  }

  private String sortChars(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return String.valueOf(chars);
  }
}
