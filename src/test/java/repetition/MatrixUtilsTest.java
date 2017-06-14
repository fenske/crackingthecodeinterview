package repetition;

import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilsTest {

  @Test
  public void shouldRotateMatrixBy90() {
    int[][] matrix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] expected = {
        {7,4,1},
        {8,5,2},
        {9,6,3}
    };
    MatrixUtils.rotateBy90Degrees(matrix);
    Assert.assertArrayEquals(expected, matrix);
  }

  @Test
  public void shouldRotateSmallerMatrixBy90() {
    int[][] matrix = {
        {1,2},
        {3,4}
    };
    int[][] expected = {
        {3,1},
        {4,2}
    };
    MatrixUtils.rotateBy90Degrees(matrix);
    Assert.assertArrayEquals(expected, matrix);
  }

  @Test
  public void shouldRotateEvenSmallerMatrixBy90() {
    int[][] matrix = {{1}};
    int[][] expected = {{1}};
    MatrixUtils.rotateBy90Degrees(matrix);
    Assert.assertArrayEquals(expected, matrix);
  }

  @Test
  public void shouldRotateBiggerMatrixBy90() {
    int[][] matrix = {
        { 1, 2, 3, 4},
        { 5, 6, 7, 8},
        { 9,10,11,12},
        {13,14,15,16}
    };
    int[][] expected = {
        {13,9,5,1},
        {14,10,6,2},
        {15,11,7,3},
        {16,12,8,4}
    };
    MatrixUtils.rotateBy90Degrees(matrix);
    Assert.assertArrayEquals(expected, matrix);
  }

  @Test
  public void shouldRotateEvenBiggerMatrixBy90() {
    int[][] matrix = {
        { 1, 2, 3, 4, 5},
        { 6, 7, 8, 9,10},
        {11,12,13,14,15},
        {16,17,18,20,21},
        {22,23,24,25,26}
    };
    int[][] expected = {
        {22,16,11,6,1},
        {23,17,12,7,2},
        {24,18,13,8,3},
        {25,20,14,9,4},
        {26,21,15,10,5}
    };
    MatrixUtils.rotateBy90Degrees(matrix);
    Assert.assertArrayEquals(expected, matrix);
  }

  @Test
  public void shouldZeroRowAndColumn() {
    int[][] matrix = {
        {1,1,0,1,1},
        {1,1,1,1,1},
        {1,1,1,1,1}
    };
    int[][] expected = {
        {0,0,0,0,0},
        {1,1,0,1,1},
        {1,1,0,1,1}
    };
    MatrixUtils.zeroRowAndColumn(matrix);
    Assert.assertArrayEquals(expected, matrix);
  }
}
