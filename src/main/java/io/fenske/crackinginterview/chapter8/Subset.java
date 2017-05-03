package io.fenske.crackinginterview.chapter8;

import java.util.ArrayList;
import java.util.List;

public class Subset {
  public static List<List<Integer>> getAllRecursively(List<Integer> set, int index) {
    List<List<Integer>> allSubsets;
    if (index == set.size()) {
      allSubsets = new ArrayList<>();
      allSubsets.add(new ArrayList<>());
    } else {
      allSubsets = getAllRecursively(set, index + 1);
      int item = set.get(index);
      List<List<Integer>> moreSubsets = new ArrayList<>();
      for (List<Integer> subset : allSubsets) {
        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(item);
        moreSubsets.add(newSubset);
      }
      allSubsets.addAll(moreSubsets);
    }
    return allSubsets;
  }

  public static List<List<Integer>> getAllIteratively(List<Integer> set) {
    List<List<Integer>> allSubsets = new ArrayList<>();
    int max = 1 << set.size();
    for (int i = 0; i < max; i++) {
      List<Integer> subset = new ArrayList<>();
      int k = i;
      int index = 0;
      while (k > 0) {
        if ((k & 1) > 0) {
          subset.add(set.get(index));
        }
        k >>= 1;
        index++;
      }
      allSubsets.add(subset);
    }
    return allSubsets;
  }
}
