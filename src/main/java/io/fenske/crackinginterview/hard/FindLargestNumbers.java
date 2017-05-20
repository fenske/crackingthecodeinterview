package io.fenske.crackinginterview.hard;

public class FindLargestNumbers {
  public static int[] getLargestNumbers(int[] numbers, int limit) {
    if (numbers.length < limit) {
      throw new IllegalArgumentException("There must be more than " + limit + " numbers.");
    }
    MaxPQ<Integer> priorityQueue = new MaxPQ<>(numbers.length);
    for (int number : numbers) {
      priorityQueue.insert(number);
    }
    int[] largestMillionNumbers = new int[limit];
    for (int i = 0; i < limit; i++) {
      largestMillionNumbers[i] = priorityQueue.delMax();
    }
    return largestMillionNumbers;
  }

}
