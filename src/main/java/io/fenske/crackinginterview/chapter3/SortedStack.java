package io.fenske.crackinginterview.chapter3;

import java.util.LinkedList;

public class SortedStack {
    private final LinkedList<Integer> mainStack;
    private final LinkedList<Integer> swapStack;

    public SortedStack(LinkedList<Integer> stack) {
        mainStack = new LinkedList<>(stack);
        swapStack = new LinkedList<>();
        sort();
    }

    private void sort() {
        while(!mainStack.isEmpty()) {
            int topElement = mainStack.pop();
            Integer secondTopElement = mainStack.peek();
            if (secondTopElement != null && topElement > secondTopElement) {
                secondTopElement = mainStack.pop();
                swapStack.push(topElement);
                while(!swapStack.isEmpty()) {
                    mainStack.push(swapStack.pop());
                }
                mainStack.push(secondTopElement);
            } else {
                swapStack.push(topElement);
            }
        }
        while(!swapStack.isEmpty()) {
            mainStack.push(swapStack.pop());
        }
    }

    public int pop() {
        return mainStack.pop();
    }
}
