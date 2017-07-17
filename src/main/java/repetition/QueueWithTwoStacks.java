package repetition;

import java.util.LinkedList;

public class QueueWithTwoStacks {
  private final LinkedList<Integer> stack1 = new LinkedList<>();
  private final LinkedList<Integer> stack2 = new LinkedList<>();

  public void enqueue(int e) {
    stack1.push(e);
  }

  public int dequeue() {
    if (stack1.isEmpty() && stack2.isEmpty()) {
      throw new UnderflowException();
    }
    if (!stack2.isEmpty()) {
      return stack2.pop();
    }
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
    return stack2.pop();
  }

  public int size() {
    return stack1.size() + stack2.size();
  }

  public static class UnderflowException extends RuntimeException {}
}
