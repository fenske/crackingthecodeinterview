package io.fenske.crackinginterview.hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindLongestWordCombination {
  public static String getLongestWordCombination(String[] words) {
    Set<String> dictionary = new HashSet<>();
    Collections.addAll(dictionary, words);
    Arrays.sort(words, (s1, s2) -> sizeOrientedCompare(s1, s2));
    for (String word : words) {
      for (int i = 1; i < word.length() - 1; i++) {
        if (isValidPair(dictionary, word, i)) {
          return word;
        }
      }
    }
    throw new IllegalArgumentException("Should never get here.");
  }

  private static boolean isValidPair(Set<String> dictionary, String word, int boundary) {
    String first = word.substring(boundary);
    String second = word.substring(boundary, word.length());
    return dictionary.contains(first) && dictionary.contains(second);
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
