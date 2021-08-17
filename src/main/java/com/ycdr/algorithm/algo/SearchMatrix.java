package com.ycdr.algorithm.algo;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==target){
                    return true;
                }

                if (matrix[i][j]>target) {
                    continue;
                }
            }
        }
        return false;
    }

    /**
     * [1,   4,  7, 11, 15],
     * [2,   5,  8, 12, 19],
     * [3,   6,  9, 16, 22],
     * [10, 13, 14, 17, 24],
     * [18, 21, 23, 26, 30]
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix1(int[][] matrix, int target) {
        int row_len = matrix[0].length;
        int len = matrix.length;

        if(target < matrix[0][0] || target > matrix[len-1][row_len-1]) return false;

        int left = 0, right = row_len - 1;
        for(int i = 0; i < len; i++) {
            left = 0;
            while (left <= right) {
                int mid = (left + right) >> 1;
                if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else if (matrix[i][mid] > target) {
                    right = mid - 1;
                } else{//matrix[i][mid] == target)
                    return true;
                }

                if((mid + 1 < row_len) && (matrix[i][mid] < target && matrix[i][mid+1] > target)){
                    right = mid + 1;
                    break;
                }
            }
        }
        return false;
    }

}
