package repetition;

import java.util.LinkedList;

public class MinStack {
  private LinkedList<Integer> elements;
  private LinkedList<Integer> min;

  public MinStack() {
    elements = new LinkedList<>();
    min = new LinkedList<>();
  }

  public void push(int e) {
    elements.push(e);
    if (min.peek() == null || e < min.peek()) {
      min.push(e);
    }
  }

  public int pop() {
    if (elements.isEmpty()) {
      throw new Underflow();
    }
    if (elements.peek() == min.peek()) {
      min.pop();
    }
    return elements.pop();
  }

  public int min() {
    if (min.isEmpty()) {
      throw new Underflow();
    }
    return min.peek();
  }

  public class Underflow extends RuntimeException {}
}

