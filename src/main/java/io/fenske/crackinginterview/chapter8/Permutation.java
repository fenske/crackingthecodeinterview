package io.fenske.crackinginterview.chapter8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
  public static Set<String> getPermutations(String str) {
    Set<String> permutations = new HashSet<>();
    if (str.length() == 1) {
      return Collections.singleton(str);
    }
    for (String s : getPermutations(str.substring(1))) {
      for (int i = 0; i < s.length() + 1; i++) {
        permutations.add(insert(s, str.charAt(0), i));
      }
    }
    return permutations;
  }

  private static String insert(String str, char c, int position) {
    return str.substring(0, position) + c + str.substring(position);
  }
}
