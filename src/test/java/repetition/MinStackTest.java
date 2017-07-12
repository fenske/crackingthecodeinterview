package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MinStackTest {

  @Test
  public void shouldFindMinWhenPushAndPopOperationsAreCalled() {
    MinStack minStack = new MinStack();
    minStack.push(0);
    minStack.push(1);
    minStack.push(2);
    minStack.push(3);
    assertThat(minStack.min(), equalTo(0));
    minStack.pop();
    assertThat(minStack.min(), equalTo(0));
    minStack.pop();
    assertThat(minStack.min(), equalTo(0));
    minStack.pop();
    assertThat(minStack.min(), equalTo(0));
    minStack.pop();

    minStack.push(3);
    minStack.push(2);
    minStack.push(1);
    minStack.push(0);

    assertThat(minStack.min(), equalTo(0));
    minStack.pop();
    assertThat(minStack.min(), equalTo(1));
    minStack.pop();
    assertThat(minStack.min(), equalTo(2));
    minStack.pop();
    assertThat(minStack.min(), equalTo(3));
    minStack.pop();

  }
}
