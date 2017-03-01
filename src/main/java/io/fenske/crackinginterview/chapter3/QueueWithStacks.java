package io.fenske.crackinginterview.chapter3;

import java.util.LinkedList;

public class QueueWithStacks {

    private final LinkedList<Integer> stack1 = new LinkedList<>();
    private final LinkedList<Integer> stack2 = new LinkedList<>();

    public void add(int element) {
        stack1.push(element);
    }

    public int remove() {
        assertEmpty();
        prepareStack2();
        return stack2.pop();
    }

    public int peek() {
        assertEmpty();
        prepareStack2();
        return stack2.peek();
    }

    private void assertEmpty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new UnderflowException();
        }
    }

    private void prepareStack2() {
        if (stack2.isEmpty()) {
            moveElements(stack1, stack2);
        }
    }

    private void moveElements(LinkedList<Integer> source, LinkedList<Integer> destination) {
        while(!source.isEmpty()) {
            destination.push(source.pop());
        }
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public class UnderflowException extends RuntimeException {}
}
