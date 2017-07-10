package repetition;

public class ThreeStacks {

  private final StackNode[] arr;
  private int pos = 0;
  private int top1 = -1;
  private int top2 = -1;
  private int top3 = -1;

  public ThreeStacks(int size) {
    arr = new StackNode[size];
  }

  public void push1(int e) {
    push(e, top1);
    top1 = pos - 1;
  }

  public void push2(int e) {
    push(e, top2);
    top2 = pos - 1;
  }

  public void push3(int e) {
    push(e, top3);
    top3 = pos - 1;
  }

  private void push(int e, int top) {
    if (pos >= arr.length) {
      throw new FullStackCapacityException();
    }
    arr[pos] = new StackNode(e, top);
    pos++;
  }

  public int pop1() {
    int e = pop(top1);
    int newTop1 = arr[top1].prevIndex;
    arr[top1] = null;
    top1 = newTop1;
    return e;
  }

  public int pop2() {
    int e = pop(top2);
    int newTop2 = arr[top2].prevIndex;
    arr[top2] = null;
    top2 = newTop2;
    return e;
  }

  public int pop3() {
    int e = pop(top3);
    int newTop3 = arr[top3].prevIndex;
    arr[top3] = null;
    top3 = newTop3;
    return e;
  }

  private int pop(int top) {
    if (top == -1) {
      throw new EmptyStackCapacityException();
    }
    int e = arr[top].val;
    return e;
  }

  private static class StackNode {
    final int val;
    final int prevIndex;

    StackNode(int val, int prevIndex) {
      this.val = val;
      this.prevIndex = prevIndex;
    }
  }

  public class FullStackCapacityException extends RuntimeException {}

  public class EmptyStackCapacityException extends RuntimeException {}
}
