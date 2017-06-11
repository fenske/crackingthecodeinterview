package repetition;

import java.util.HashSet;
import java.util.Set;

public class ListUtils {

  public static void deleteDuplicates(Node n) {
    Set<Node> seenNodes = new HashSet<>();
    Node prev = null;
    while (n != null) {
      if (seenNodes.contains(n)) {
        prev.next = n.next;
      } else {
        seenNodes.add(n);
        prev = n;
      }
      n = n.next;
    }
  }

  public static class Node {
    public int val;
    public Node next;

    public Node(int val) {
      this.val = val;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Node)) return false;

      Node node = (Node) o;

      return val == node.val;
    }

    @Override
    public int hashCode() {
      return val;
    }

    @Override
    public String toString() {
      return "Node{" +
          "val=" + val +
          ", next=" + next +
          '}';
    }
  }

}
