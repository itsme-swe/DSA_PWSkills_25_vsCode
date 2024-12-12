/*
💥 Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.

LeetCode: https://leetcode.com/problems/set-matrix-zeroes/description/

*/

package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class setMatrixZeros_Optimized {

    public static void main(String[] args) {

        int[][] arr = { {1,1,1}, {1,0,1}, {1,1,1} };

        printArray(arr);

        setMatrix(arr);

        System.out.println();

        printArray(arr);


    }

    public static void setMatrix(int[][] arr){

        int m = arr.length;
        int n = arr[0].length;

        boolean zeroRow = false;
        boolean zeroCol = false;

        // Checking 0th row and 0th column
        for (int j = 0; j < n; j++) {
            if(arr[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }

        // column
        for (int i = 0; i < m; i++) {
            if(arr[i][0] == 0) {
                zeroCol = true;
                break;
            }
        }

        // Now traversing the submatrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;

                }
            }
        }

        if (zeroRow == true) {
            for (int j = 0; j < n; j++) {
             arr[0][j] = 0;
            }
        }

        if (zeroCol == true) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void printArray(int[][] arr) {
        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

/*

1 1 1
1 0 1
1 1 1

1 0 1
0 0 0
1 0 1

*/
