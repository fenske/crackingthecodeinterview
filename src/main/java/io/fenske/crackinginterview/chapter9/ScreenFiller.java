package io.fenske.crackinginterview.chapter9;

enum Color {
  BLACK, YELLOW, GREEN, BLUE;
}

public class ScreenFiller {
  public static void paintFill(Color[][] screen, int i, int j, Color newColor) {
    paintFill(screen, i, j, screen[i][j], newColor);
  }

  private static void paintFill(Color[][] screen, int i, int j, Color oldColor, Color newColor) {
    if (i < 0 || i >= screen.length || j < 0 || j >= screen[0].length || screen[i][j] != oldColor) {
      return;
    }
    screen[i][j] = newColor;
    paintFill(screen, i, j-1, oldColor, newColor);
    paintFill(screen, i-1, j, oldColor, newColor);
    paintFill(screen, i, j+1, oldColor, newColor);
    paintFill(screen, i+1, j, oldColor, newColor);
  }
}