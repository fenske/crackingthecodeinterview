package repetition;

import java.util.LinkedList;

public class SetOfStacks {

  private final int threshold;
  private final LinkedList<LinkedList<Integer>> stacks;

  public SetOfStacks(int threshold) {
    this.threshold = threshold;
    this.stacks = new LinkedList<>();
  }

  public void push(int e) {
    if (stacks.isEmpty() || stacks.getLast().size() >= threshold) {
      stacks.addLast(new LinkedList<>());
    }
    stacks.getLast().push(e);
  }

  public int pop() {
    if (stacks.isEmpty()) {
      throw new Underflow();
    }
    int e = stacks.getLast().pop();
    if (stacks.getLast().isEmpty()) {
      stacks.removeLast();
    }
    return e;
  }

  public int numberOfStacks() {
    return stacks.size();
  }

  public LinkedList<Integer> getStack(int index) {
    return new LinkedList<>(stacks.get(index));
  }

  public boolean isEmpty() {
    return stacks.isEmpty();
  }

  public class Underflow extends RuntimeException {}
}

