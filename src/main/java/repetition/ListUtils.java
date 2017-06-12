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

  public static void deleteDuplicates2(Node head) {
    if (head == null) {
      throw new IllegalArgumentException();
    }
    Node prev = head;
    Node current = prev.next;
    while(current != null) {
      Node runner = head;
      while(runner != current) {
        if (runner.val == current.val) {
          prev.next = current.next;
          current = current.next;
          break;
        }
        runner = runner.next;
      }
      if (runner == current) {
        prev = current;
        current = current.next;
      }
    }
  }

  public static int getNthToLast(Node head, int n) {
    Node first = head;
    Node second = head;
    while (second != null && n > 0) {
      second = second.next;
      n--;
    }
    if (n != 0) {
      throw new IllegalArgumentException("n must be smaller than the list length.");
    }
    while (second != null) {
      second = second.next;
      first = first.next;
    }
    return first.val;
  }

  public static void deleteNode(Node node) {
    if (node == null) {
      throw new IllegalArgumentException("Input node cannot be null");
    }
    if (node.next == null) {
      throw new IllegalArgumentException("Last node cannot be removed");
    }
    node.val = node.next.val;
    node.next = node.next.next;
  }

  public static Node sumLists(Node a, Node b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("Both arguments have to be non-null.");
    }
    Node sumHead = null;
    Node c = null;
    int carry = 0;
    while (a != null || b != null) {
      int digit1 = 0;
      int digit2 = 0;
      if (a != null) {
        digit1 = a.val;
        a = a.next;
      }
      if (b != null) {
        digit2 = b.val;
        b = b.next;
      }
      int digitSum = digit1 + digit2 + carry;
      if (digitSum > 9) {
        carry = 1;
        digitSum -= 10;
      } else {
        carry = 0;
      }
      if (sumHead == null) {
        sumHead = new Node(digitSum);
        c = sumHead;
      } else {
        c.next = new Node(digitSum);
        c = c.next;
      }
    }
    if (carry == 1) {
      c.next = new Node(1);
    }
    return sumHead;
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
