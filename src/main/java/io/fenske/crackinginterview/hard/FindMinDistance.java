package io.fenske.crackinginterview.hard;

public class FindMinDistance {

  public static int getMinDistance(String[] words, String word1, String word2) {
    Integer minDistance = null;
    Integer position1 = null;
    Integer position2 = null;
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(word1)) {
        position1 = i;
      }
      if (words[i].equals(word2)) {
        position2 = i;
      }
      if (position1 != null &&
          position2 != null &&
          (minDistance == null || Math.abs(position1 - position2) < minDistance)) {
        minDistance = Math.abs(position1 - position2) - 1;
      }
    }
    return minDistance;
  }
}
