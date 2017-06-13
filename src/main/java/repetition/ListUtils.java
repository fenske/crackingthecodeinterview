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


  public static Node sumListsRecursively(Node a, Node b) {
    return sumListsRecursively(a, b, 0);
  }

  private static Node sumListsRecursively(Node a, Node b, int carry) {
    if (a == null && b == null) {
      return null;
    }
    Node sum = new Node(carry);
    int sumDigit = carry;
    if (a != null) {
      sumDigit += a.val;
    }
    if (b != null) {
      sumDigit += b.val;
    }
    sum.val = sumDigit % 10;
    Node more = sumListsRecursively(a == null ? null : a.next,
                                    b == null ? null : b.next,
                                    sumDigit / 10);
    sum.next = more;
    return sum;
  }


  public static Node sumLists(Node a, Node b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("Both arguments have to be non-null.");
    }
    Node sumHead = null;
    Node c = null;
    int carry = 0;
    while (a != null || b != null) {
      int term1 = 0;
      int term2 = 0;
      if (a != null) {
        term1 = a.val;
        a = a.next;
      }
      if (b != null) {
        term2 = b.val;
        b = b.next;
      }
      int sum = term1 + term2 + carry;
      int digit = sum % 10;
      carry = sum / 10;

      if (sumHead == null) {
        sumHead = new Node(digit);
        c = sumHead;
      } else {
        c.next = new Node(digit);
        c = c.next;
      }
    }
    if (carry == 1) {
      c.next = new Node(1);
    }
    return sumHead;
  }

  public static int getLoopStart(Node head) {
    if (head == null) {
      throw new IllegalArgumentException("Input list cannot be null");
    }
    Node slow = head;
    Node fast = head;
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    if (fast.next == null) {
      throw new IllegalArgumentException("No loop found");
    }
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow.val;
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
