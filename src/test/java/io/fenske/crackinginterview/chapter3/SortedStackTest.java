package io.fenske.crackinginterview.chapter3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class SortedStackTest {

    @Test
    void shouldSortStack() {
        LinkedList<Integer> unsortedStack = new LinkedList<>();
        unsortedStack.push(0);
        unsortedStack.push(1);
        unsortedStack.push(6);
        unsortedStack.push(4);
        unsortedStack.push(3);

        SortedStack sortedStack = new SortedStack(unsortedStack);
        Assert.assertEquals(6, sortedStack.pop());
        Assert.assertEquals(4, sortedStack.pop());
        Assert.assertEquals(3, sortedStack.pop());
        Assert.assertEquals(1, sortedStack.pop());
        Assert.assertEquals(0, sortedStack.pop());

    }
}
