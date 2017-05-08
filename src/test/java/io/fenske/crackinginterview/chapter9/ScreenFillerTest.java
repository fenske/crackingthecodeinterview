package io.fenske.crackinginterview.chapter9;

import static io.fenske.crackinginterview.chapter9.Color.BLACK;
import static io.fenske.crackinginterview.chapter9.Color.BLUE;
import static io.fenske.crackinginterview.chapter9.Color.GREEN;
import static io.fenske.crackinginterview.chapter9.Color.YELLOW;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ScreenFillerTest {

  @Test
  public void shouldFillInNeighbours() {
    Color[][] screen = {
        {BLACK, YELLOW, GREEN},
        {BLACK, GREEN, GREEN},
        {BLACK, YELLOW, GREEN},
    };
    Color[][] expected = {
        {BLACK, YELLOW, BLUE},
        {BLACK, BLUE, BLUE},
        {BLACK, YELLOW, BLUE},
    };
    ScreenFiller.paintFill(screen, 1, 1, BLUE);
    assertArrayEquals(expected, screen);
  }
}