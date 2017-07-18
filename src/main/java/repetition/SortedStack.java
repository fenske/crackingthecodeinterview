package repetition;

import java.util.LinkedList;

public class SortedStack {

  private final LinkedList<Integer> stack;

  public SortedStack(LinkedList<Integer> stack) {
    final LinkedList<Integer> auxStack = new LinkedList<>();
    while (!stack.isEmpty()) {
      int e = stack.pop();
      while(!auxStack.isEmpty() && auxStack.peek() > e) {
        stack.push(auxStack.pop());
      }
      auxStack.push(e);
    }
    this.stack = auxStack;
  }

  public int pop() {
    return stack.pop();
  }
}
