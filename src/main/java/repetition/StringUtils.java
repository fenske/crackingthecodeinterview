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
}
