package repetition;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
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

    ListUtils.deleteDuplicates(a);

    Assert.assertThat(a.next, CoreMatchers.equalTo(b));
    Assert.assertThat(b.next, CoreMatchers.equalTo(c));
    Assert.assertThat(c.next, CoreMatchers.equalTo(e));
    Assert.assertThat(e.next, CoreMatchers.equalTo(f));


  }
}
