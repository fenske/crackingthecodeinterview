package io.fenske.crackinginterview.chapter4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

public class LinkedBstTest {

    @Test
    void shouldReturnNextInOrderSuccessor() {
        LinkedTreeNode a = new LinkedTreeNode(10);
        LinkedTreeNode b = new LinkedTreeNode(6);
        LinkedTreeNode c = new LinkedTreeNode(11);
        LinkedTreeNode d = new LinkedTreeNode(4);
        LinkedTreeNode e = new LinkedTreeNode(8);
        LinkedTreeNode f = new LinkedTreeNode(3);
        LinkedTreeNode g = new LinkedTreeNode(5);
        LinkedTreeNode h = new LinkedTreeNode(7);
        LinkedTreeNode i = new LinkedTreeNode(9);

        a.left = b;
        a.right = c;

        b.parent = a;
        b.left = d;
        b.right = e;

        c.parent = a;

        d.parent = b;
        d.left = f;
        d.right = g;

        e.parent = b;
        e.left = h;
        e.right = i;

        f.parent = d;

        g.parent = d;

        h.parent = e;
        i.parent = e;

        assertThat(LinkedBstUtilities.getNext(a), is(c));
        assertThat(LinkedBstUtilities.getNext(b), is(h));
        assertThat(LinkedBstUtilities.getNext(c), is(nullValue()));
        assertThat(LinkedBstUtilities.getNext(d), is(g));
        assertThat(LinkedBstUtilities.getNext(e), is(i));
        assertThat(LinkedBstUtilities.getNext(f), is(d));
        assertThat(LinkedBstUtilities.getNext(g), is(b));
        assertThat(LinkedBstUtilities.getNext(h), is(e));
        assertThat(LinkedBstUtilities.getNext(i), is(a));

    }
}
