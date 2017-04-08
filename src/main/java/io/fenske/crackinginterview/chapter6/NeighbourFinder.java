package io.fenske.crackinginterview.chapter6;

public class NeighbourFinder {

  public static int findNextSmallest(int number) {
    if (number <= 0) {
      throw new IllegalArgumentException("Number can't be less than 0");
    }

    int index = 0;
    int countZeroes = 0;

    while(isBitSet(number, index)) {
      index++;
    }

    while(!isBitSet(number, index)) {
      index++;
      countZeroes++;
    }
    number = unsetBit(number, index);

    index--;
    number = setBit(number, index);
    countZeroes--;

    for (int i = index - 1; i >= countZeroes; i--) {
      number = setBit(number, i);
    }
    for (int i = countZeroes - 1; i >= 0; i--) {
      number = unsetBit(number, i);
    }
    return number;
  }


  private static int setBit(int number, int index) {
    return number | (1 << index);
  }

  private static int unsetBit(int number, int index) {
    return number & ~(1 << index);
  }


  public static int findNextBiggest(int number) {
    if (number <= 0) {
      throw new IllegalArgumentException("Number can't be less than 0");
    }

    int index = 0;
    int countOnes = 0;

    while(!isBitSet(number, index)) {
      index++;
    }

    while(isBitSet(number, index)) {
      index++;
      countOnes++;
    }
    number = setBit(number, index);

    index--;
    number = unsetBit(number, index);
    countOnes--;

    for (int i = index - 1; i >= countOnes; i--) {
      number = unsetBit(number, i);
    }
    for (int i = countOnes - 1; i >= 0; i--) {
      number = setBit(number, i);
    }
    return number;
  }

  private static boolean isBitSet(int number, int index) {
    return (number & (1 << index)) > 0;
  }
}
