package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.LinkedList;

public class SortedStackTest {

  @Test
  public void shouldSortStack() {
    LinkedList<Integer> stack = new LinkedList<>();
    stack.push(3);
    stack.push(0);
    stack.push(2);
    stack.push(1);
    SortedStack sortedStack = new SortedStack(stack);

    assertThat(sortedStack.pop(), equalTo(3));
    assertThat(sortedStack.pop(), equalTo(2));
    assertThat(sortedStack.pop(), equalTo(1));
    assertThat(sortedStack.pop(), equalTo(0));
  }
}
