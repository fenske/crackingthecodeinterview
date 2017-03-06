package io.fenske.crackinginterview.chapter3;

import java.util.LinkedList;

public class SortedStack {
    private final LinkedList<Integer> sortedStack;

    public SortedStack(LinkedList<Integer> unsortedStack) {
        sortedStack = sort(unsortedStack);
    }

    private LinkedList<Integer> sort(LinkedList<Integer> stack) {
        LinkedList<Integer> swapStack = new LinkedList<>();
        while(!stack.isEmpty()) {
            int tmp = stack.pop();
            while(!swapStack.isEmpty() && swapStack.peek() > tmp) {
                stack.push(swapStack.pop());
            }
            swapStack.push(tmp);
        }
        return swapStack;
    }

    public int pop() {
        return sortedStack.pop();
    }
}
