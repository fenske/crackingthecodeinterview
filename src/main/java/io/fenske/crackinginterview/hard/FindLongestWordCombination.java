package io.fenske.crackinginterview.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindLongestWordCombination {
  public static String getLongestWordCombination(String[] words) {
    Set<String> dictionary = new HashSet<>();
    for (String word : words) {
      dictionary.add(word);
    }
    Arrays.sort(words, (s1, s2) -> sizeOrientedCompare(s1, s2));
    for (String word : words) {
      for (int i = 1; i < word.length() - 1; i++) {
        if (dictionary.contains(word.substring(i)) && dictionary.contains(word.substring(i, word.length()))) {
          return word;
        }
      }
    }
    throw new IllegalArgumentException("Should never get here.");
  }

  private static int sizeOrientedCompare(String s1, String s2) {
    if (s1.length() < s2.length()) {
      return 1;
    } else if (s1.length() > s2.length()) {
      return -1;
    } else {
      return 0;
    }
  }
}
