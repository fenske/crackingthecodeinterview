package io.fenske.crackinginterview.chapter3;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class SetOfStacks {
    private int activeStackIndex = 0;
    private List<LinkedList<Integer>> stackList = new ArrayList<>();

    private final int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
        stackList.add(new LinkedList<>());
    }

    public void push(int element) {
        if (!isAtCapacity()) {
            activeStack().push(element);
        } else {
            expandAndPush(element);
        }
    }

    private boolean isAtCapacity() {
        return activeStack().size() >= capacity;
    }

    private void expandAndPush(int element) {
        stackList.add(new LinkedList<>());
        ++activeStackIndex;
        activeStack().push(element);
    }

    public int pop() {
        if (activeStack().isEmpty()) {
            throw new UnderflowException();
        }
        int poppedElement = activeStack().pop();
        if (activeStack().isEmpty()) {
            shrink();
        }
        return poppedElement;
    }

    private void shrink() {
        stackList.remove(activeStackIndex);
        --activeStackIndex;
    }

    public int peek() {
        if (activeStack().isEmpty()) {
            throw new UnderflowException();
        }
        return activeStack().peek();
    }

    public boolean isEmpty() {
        return activeStack().isEmpty();
    }

    private LinkedList<Integer> activeStack() {
        return stackList.get(activeStackIndex);
    }

    public int piles() {
        return stackList.size();
    }

    public int popAt(int stackIndex) {
        if (stackIndex >= stackList.size()) {
            throw new IllegalElementException();
        }
        int poppedElement = getStack(stackIndex).pop();
        while(hasNextStackOf(stackIndex)) {
            leftShift(stackIndex);
            ++stackIndex;
            if (getStack(stackIndex).isEmpty()) {
                shrink();
            }
        }
        return poppedElement;
    }

    private void leftShift(int stackIndex) {
        int firstPoppedElementOfNextStack = getStack(stackIndex + 1).removeFirst();
        getStack(stackIndex).push(firstPoppedElementOfNextStack);
    }

    private LinkedList<Integer> getStack(int index) {
        return stackList.get(index);
    }

    private boolean hasNextStackOf(int index) {
        return index < stackList.size();
    }

    public static class UnderflowException extends RuntimeException {}

    public static class IllegalElementException extends RuntimeException {}
}
