package io.fenske.crackinginterview.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuffixTree {

  private SuffixTreeNode root = new SuffixTreeNode();

  public SuffixTree(String s) {
    for (int i = 0; i < s.length(); i++) {
      String suffix = s.substring(i);
      root.insertString(suffix, i);
    }
  }

  public List<Integer> getIndexes(String s) {
    return root.getIndexes(s);
  }

  class SuffixTreeNode {

    private char value;
    private Map<Character, SuffixTreeNode> children = new HashMap<>();
    private List<Integer> indexes = new ArrayList<>();

    public SuffixTreeNode() {
    }

    public void insertString(String s, int index) {
      indexes.add(index);
      if (s != null && s.length() > 0) {
        value = s.charAt(0);
        SuffixTreeNode child = null;
        if (children.containsKey(value)) {
          child = children.get(value);
        } else {
          child = new SuffixTreeNode();
          children.put(value, child);
        }
        String remainder = s.substring(1);
        child.insertString(remainder, index);
      }
    }

    public List<Integer> getIndexes(String s) {
      if (s == null || s.length() == 0) {
        return indexes;
      } else {
        char first = s.charAt(0);
        if (children.containsKey(first)) {
          String remainder = s.substring(1);
          return children.get(first).getIndexes(remainder);
        }
      }
      return null;
    }
  }

  public static void main(String[] args) {
    String testString = "mississippi";
    String[] stringList = {"is", "sip", "hi", "sis"};
    SuffixTree tree = new SuffixTree(testString);
    for (String s : stringList) {
      List<Integer> list = tree.getIndexes(s);
      if (list != null) {
        System.out.println(s + ": " + list.toString());
      }
    }
  }
}