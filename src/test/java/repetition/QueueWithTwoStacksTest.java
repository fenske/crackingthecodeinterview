package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class QueueWithTwoStacksTest {

  @Test
  public void shouldEnqueueAndDequeueCorrectly() {
    QueueWithTwoStacks queue = new QueueWithTwoStacks();
    queue.enqueue(0);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertThat(queue.dequeue(), equalTo(0));
    assertThat(queue.dequeue(), equalTo(1));
    queue.enqueue(4);
    queue.enqueue(5);
    assertThat(queue.dequeue(), equalTo(2));
    assertThat(queue.dequeue(), equalTo(3));
    assertThat(queue.dequeue(), equalTo(4));
    assertThat(queue.dequeue(), equalTo(5));

    assertThat(queue.size(), equalTo(0));
  }
}
