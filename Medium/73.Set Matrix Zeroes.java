package Medium;
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

 

// Example 1:


// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]

class Solution {
    public void setZeroes(int[][] matrix) {
          boolean isFirstCol = false;
    int row = matrix.length;
    int col = matrix[0].length;

    for (int i = 0; i < row; i++) {
      if (matrix[i][0] == 0) {
        isFirstCol = true;
      }

      for (int j = 1; j < col; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    for (int i = 1; i < row; i++) {
      for (int j = 1; j < col; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if (matrix[0][0] == 0) {
      for (int j = 0; j < col; j++) {
        matrix[0][j] = 0;
      }
    }

    if (isFirstCol) {
      for (int i = 0; i < row; i++) {
        matrix[i][0] = 0;
      }
    }
    }
}