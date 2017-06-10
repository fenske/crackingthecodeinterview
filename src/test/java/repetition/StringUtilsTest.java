package repetition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertArrayEquals;
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

  @Test
  public void shouldReturnTrueIfAnagrams() {
    assertThat(StringUtils.areAnagrams("abcda", "bcdaa"), equalTo(true));
    assertThat(StringUtils.areAnagrams("abcda", "bcdab"), equalTo(false));
  }

  @Test
  public void shouldReplaceWhitespaces() {
    char[] str = {'a','b','c',' ', 'd', 'e', ' ', 'f', '\0', '\\', '\\', '\\', '\\'};
    StringUtils.replaceWhitespaces(str, 8);
    assertArrayEquals(new char[]{'a','b','c', '%', '2', '0', 'd', 'e', '%', '2', '0', 'f', '\0'}, str);
  }
}
