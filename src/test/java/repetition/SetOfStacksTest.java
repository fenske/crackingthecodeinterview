package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SetOfStacksTest {

  private SetOfStacks setOfStacks;

  @Before
  public void setUp() {
    setOfStacks = new SetOfStacks(3);

    setOfStacks.push(1);
    setOfStacks.push(2);
    setOfStacks.push(3);

    setOfStacks.push(4);
    setOfStacks.push(5);
    setOfStacks.push(6);

    setOfStacks.push(7);
    setOfStacks.push(8);
    setOfStacks.push(9);
  }

  @Test
  public void shouldDoPushesAndPopsWhileSlicingIntoStacks() {
    assertThat(setOfStacks.numberOfStacks(), equalTo(3));
    assertThat(setOfStacks.getStack(0).size(), equalTo(3));
    assertThat(setOfStacks.getStack(1).size(), equalTo(3));
    assertThat(setOfStacks.getStack(2).size(), equalTo(3));

    assertThat(setOfStacks.pop(), equalTo(9));
    assertThat(setOfStacks.pop(), equalTo(8));
    assertThat(setOfStacks.pop(), equalTo(7));
    assertThat(setOfStacks.pop(), equalTo(6));
    assertThat(setOfStacks.pop(), equalTo(5));
    assertThat(setOfStacks.pop(), equalTo(4));
    assertThat(setOfStacks.pop(), equalTo(3));
    assertThat(setOfStacks.pop(), equalTo(2));
    assertThat(setOfStacks.pop(), equalTo(1));

    assertThat(setOfStacks.isEmpty(), is(true));
  }

  @Test
  public void shouldPopAtParticularStack() {
    assertThat(setOfStacks.popAt(0), equalTo(3));
    assertThat(setOfStacks.popAt(1), equalTo(6));
    assertThat(setOfStacks.popAt(2), equalTo(9));

    assertThat(setOfStacks.popAt(0), equalTo(2));
    assertThat(setOfStacks.popAt(1), equalTo(5));
    assertThat(setOfStacks.popAt(2), equalTo(8));

    assertThat(setOfStacks.popAt(0), equalTo(1));
    assertThat(setOfStacks.popAt(0), equalTo(4));
    assertThat(setOfStacks.popAt(0), equalTo(7));

    assertThat(setOfStacks.isEmpty(), is(true));
  }
}
