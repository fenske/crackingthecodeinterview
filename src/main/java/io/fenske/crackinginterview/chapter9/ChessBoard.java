package io.fenske.crackinginterview.chapter9;

public class ChessBoard {

  private final int[] columnForRow = new int[8];

  public static void main(String[] args) {
    new ChessBoard().printAllCombinations();
  }

  public void printAllCombinations() {
    placeQueen(0);
  }

  private void placeQueen(int row) {
    if (row == 8) {
      printBoard();
      return;
    }
    for (int i = 0; i < 8; i++) {
      columnForRow[row] = i;
      if (check(row)) {
        placeQueen(row + 1);
      }
    }
  }

  private boolean check(int row) {
    for (int i = 0; i < row; i++) {
      int diff = Math.abs(columnForRow[i] - columnForRow[row]);
      if (diff == 0 || diff == row - i) {
        return false;
      }
    }
    return true;
  }

  private void printBoard() {
    for (int i = 0; i < 8; i++) {
      String row = "00000000";
      int pos = columnForRow[i];
      row = row.substring(0, pos) + "X" + row.substring(pos + 1, 8);
      System.out.println(row);
    }
    System.out.println();
  }
}
