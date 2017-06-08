package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringUtilsTest {

  @Test
  public void shouldTellIfAllUnique() {
    assertThat(StringUtils.isAllUnique("abcd"), equalTo(true));
    assertThat(StringUtils.isAllUnique("abcda"), equalTo(false));
  }

  @Test
  public void shouldRemoveDuplicates() {
    assertThat(StringUtils.removeDuplicates("abcd".toCharArray()), equalTo("abcd"));
    assertThat(StringUtils.removeDuplicates("abcccda".toCharArray()), equalTo("abcd"));
  }
}
