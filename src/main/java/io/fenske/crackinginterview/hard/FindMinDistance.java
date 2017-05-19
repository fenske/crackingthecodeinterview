package io.fenske.crackinginterview.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMinDistance {

  private final Map<String, List<Integer>> index = new HashMap<>();
  private final String[] words;

  public FindMinDistance(String[] words) {
    this.words = words;
    buildIndex();
  }

  private void buildIndex() {
    for (int i = 0; i < words.length; i++) {
      if (!index.containsKey(words[i])) {
        index.put(words[i], new ArrayList<>(Arrays.asList(i)));
      } else {
        List<Integer> positions = index.get(words[i]);
        positions.add(i);
      }
    }
  }

  public int getMinDistanceOptimized(String word1, String word2) {
    List<Integer> word1Positions = index.get(word1);
    List<Integer> word2Positions = index.get(word2);
    return getClosestDifference(word1Positions, word2Positions);
  }

  private int getClosestDifference(List<Integer> word1Positions, List<Integer> word2Positions) {
    Integer closestDifference = null;
    for (int position1 : word1Positions) {
      int lo = 0;
      int hi = word2Positions.size() - 1;
      while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (position1 + 1 < word2Positions.get(mid)) {
          hi = mid - 1;
        } else if (position1 + 1 > word2Positions.get(mid)) {
          lo = mid + 1;
        } else {
          return 0;
        }
        if (closestDifference == null || Math.abs(word2Positions.get(mid) - position1) - 1 < closestDifference) {
          closestDifference = Math.abs(word2Positions.get(mid) - position1) - 1;
        }
      }
    }
    return closestDifference;
  }

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
