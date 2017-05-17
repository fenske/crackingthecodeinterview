package io.fenske.crackinginterview.moderate;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {
  public static void shuffle(int[] cards) {
    for (int i = 0; i < cards.length; i++) {
      swap(cards, i, getRandomInteger(i, cards.length));
    }
  }

  public static int[] getRandomSubset(int[] arr, int m) {
    int[] copy = Arrays.copyOf(arr, arr.length);
    for (int i = 0; i < m; i++) {
      swap(copy, i, getRandomInteger(i, copy.length));
    }
    return Arrays.copyOf(copy, m);
  }

  private static void swap(int[] arr, int i, int j) {
    int swap = arr[j];
    arr[j] = arr[i];
    arr[i] = swap;
  }

  private static int getRandomInteger(int lo, int hi) {
    return new Random(System.nanoTime()).nextInt(hi - lo) + lo;
  }

  public static void main(String[] args) {
    int[] cards = {0,1,2,3,4,5};
    shuffle(cards);
    System.out.println(Arrays.toString(cards));
    System.out.println(Arrays.toString(getRandomSubset(cards, 3)));
  }
}
