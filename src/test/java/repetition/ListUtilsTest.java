package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import repetition.ListUtils.Node;

public class ListUtilsTest {

  @Test
  public void shouldDeleteDuplicates() {
    Node a = new Node(4);
    Node b = new Node(3);
    Node c = new Node(0);
    Node d = new Node(3);
    Node e = new Node(5);
    Node f = new Node(1);
    Node g = new Node(5);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;

    ListUtils.deleteDuplicates2(a);

    assertThat(a.next, equalTo(b));
    assertThat(b.next, equalTo(c));
    assertThat(c.next, equalTo(e));
    assertThat(e.next, equalTo(f));


  }

  @Test
  public void shouldReturnNthToLast() {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    Node f = new Node(6);
    Node g = new Node(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;

    assertThat(ListUtils.getNthToLast(a, 3), equalTo(5));
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionWhenLengthIsSmallerThanN() {
    Node a = new Node(1);
    Node b = new Node(2);

    a.next = b;

    ListUtils.getNthToLast(a, 3);
  }
}
