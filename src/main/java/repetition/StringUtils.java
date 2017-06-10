package repetition;

import java.util.Arrays;

public class StringUtils {
//  public static boolean isAllUnique(String str) {
//    Set<Character> dict = new HashSet<>();
//    for (int i = 0; i < str.length(); i++) {
//      if (dict.contains(str.charAt(i))) {
//        return false;
//      }
//      dict.add(str.charAt(i));
//    }
//    return true;
//  }

  public static boolean isAllUnique(String str) {
    int checker = 0;
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i) - 'a';
      if ((checker & (1 << val)) != 0) {
        return false;
      } else {
        checker |= val;
      }
    }
    return true;
  }

//  public static String removeDuplicates(char[] str) {
//    int tail = 1;
//    for (int i = 1; i < str.length; i++) {
//      int j;
//      for (j = 0; j < tail; j++) {
//        if (str[i] == str[j]) {
//          break;
//        }
//      }
//      if (j == tail) {
//        str[tail] = str[i];
//        ++tail;
//      }
//    }
//    return String.valueOf(Arrays.copyOf(str, tail));
//  }

  public static String removeDuplicates(char[] str) {
    boolean[] hit = new boolean[256];
    hit[str[0]] = true;
    int tail = 1;
    for (int i = 1; i < str.length; i++) {
      if (!hit[str[i]]) {
        str[tail] = str[i];
        tail++;
        hit[str[i]] = true;
      }
    }
    return String.valueOf(Arrays.copyOf(str, tail));
  }

  public static boolean areAnagrams(String s1, String s2) {
    if (s1 == null || s2 == null) {
      throw new IllegalArgumentException("Input strings cannot be null");
    }
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] ascii1 = new int[128];
    for (int i = 0; i < s1.length(); i++) {
      ascii1[s1.charAt(i)]++;
    }
    int[] ascii2 = new int[128];
    for (int i = 0; i < s2.length(); i++) {
      ascii2[s2.charAt(i)]++;
    }
    for (int i = 0; i < 128; i++) {
      if (ascii1[i] != ascii2[i]) {
        return false;
      }
    }
    return true;
  }

  public static void replaceWhitespaces(char[] str, int length) {
    int whitespaceCount = 0;
    for (int i = 0; i < length; i++) {
      if (str[i] == ' ') {
        whitespaceCount++;
      }
    }
    int newLength = length + 2 * whitespaceCount;
    str[newLength] = '\0';
    for (int i = length - 1, j = newLength - 1; i >= 0; i--, j--) {
      if (str[i] == ' ') {
        str[j--] = '0';
        str[j--] = '2';
        str[j] = '%';
      } else {
        str[j] = str[i];
      }
    }
  }

  public static boolean isFirstRotationOfSecond(String first, String second) {
    return isSubstring(first, second + second);
  }

  private static boolean isSubstring(String substr, String str) {
    return str.indexOf(substr) > -1;
  }

}
