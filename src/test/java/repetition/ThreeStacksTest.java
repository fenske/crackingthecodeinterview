package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ThreeStacksTest {

  @Test
  public void shouldPushAndPopForThreeStacks() {
    ThreeStacks threeStacks = new ThreeStacks(6);

    threeStacks.push1(7);
    threeStacks.push2(3);
    threeStacks.push1(4);
    threeStacks.push3(6);
    threeStacks.push3(5);
    threeStacks.push2(0);

    assertThat(threeStacks.pop1(), equalTo(4));
    assertThat(threeStacks.pop2(), equalTo(0));
    assertThat(threeStacks.pop3(), equalTo(5));
    assertThat(threeStacks.pop1(), equalTo(7));
    assertThat(threeStacks.pop2(), equalTo(3));
    assertThat(threeStacks.pop3(), equalTo(6));
  }
}
