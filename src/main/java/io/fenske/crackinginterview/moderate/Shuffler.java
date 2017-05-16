package io.fenske.crackinginterview.moderate;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {
  public static void shuffle(int[] cards) {
    Random randomizer = new Random(System.nanoTime());
    for (int i = 0; i < cards.length; i++) {
      int position = randomizer.nextInt(cards.length - i) + i;
      int swap = cards[position];
      cards[position] = cards[i];
      cards[i] = swap;
    }
  }

  public static void main(String[] args) {
    int[] cards = {0,1,2,3,4,5};
    shuffle(cards);
    System.out.println(Arrays.toString(cards));
  }
}
