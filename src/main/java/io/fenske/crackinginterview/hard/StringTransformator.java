package io.fenske.crackinginterview.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringTransformator {

  public static List<String> transform(String startWord, String endWord, Set<String> dictionary) {
    LinkedList<String> actionQueue = new LinkedList<>();
    Set<String> visitedSet = new HashSet<>();
    Map<String, String> backtrackMap = new TreeMap<>();

    actionQueue.add(startWord);
    visitedSet.add(startWord);

    while(!actionQueue.isEmpty()) {
      String w = actionQueue.poll();
      for (String v : getOneEditWords(w)) {
        if (v.equals(endWord)) {
          List<String> transformations = new LinkedList<>();
          transformations.add(endWord);
          while (w != null) {
            transformations.add(0, w);
            w = backtrackMap.get(w);
          }
          return transformations;
        }
        if (dictionary.contains(v)) {
          if (!visitedSet.contains(v)) {
            actionQueue.add(v);
            visitedSet.add(v);
            backtrackMap.put(v, w);
          }
        }
      }
    }
    return null;
  }

  private static List<String> getOneEditWords(String word) {
    List<String> oneEditWords = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      char[] wordArray = word.toCharArray();
      for (char c = 'a'; c <= 'z'; c++) {
        if (c != word.charAt(i)) {
          wordArray[i] = c;
          oneEditWords.add(String.valueOf(wordArray));
        }
      }
    }
    return oneEditWords;
  }
}
