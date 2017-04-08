package io.fenske.crackinginterview.chapter5;

public class DecimalConverter {
  public static String convertDecimalToBinary(String numberStr) {
    int integerPart = getIntegerPart(numberStr);
    double decimalPart = getDecimalPart(numberStr);
    return convertToBinary(integerPart) + "." + convertToBinary(decimalPart);
  }

  private static String convertToBinary(int integerPart) {
    String integerStr = "";
    while (integerPart > 0) {
      int r = integerPart % 2;
      integerPart >>= 1;
      integerStr += r;
    }
    return integerStr;
  }

  private static String convertToBinary(double decimalPart) {
    String decimalStr = "";
    while (decimalPart > 0) {
      if (decimalStr.length() > 32) {
        return "ERROR";
      }
      if (decimalPart == 1) {
        decimalStr += 1;
        break;
      }
      double r = decimalPart * 2;
      if (r >= 1) {
        decimalStr += + 1;
        decimalPart = r - 1;
      } else {
        decimalStr += 0;
        decimalPart = r;
      }
    }
    return decimalStr;
  }

  private static double getDecimalPart(String numberStr) {
    return Double.parseDouble(numberStr.substring(numberStr.indexOf("."), numberStr.length()));
  }

  private static int getIntegerPart(String numberStr) {
    return Integer.parseInt(numberStr.substring(0, numberStr.indexOf(".")));
  }
}
