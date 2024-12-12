/*
💥 Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.

LeetCode: https://leetcode.com/problems/set-matrix-zeroes/description/

*/

package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class setMatrixZeros_BruteForce {

    public static void main(String[] args) {

        int[][] arr = { {1,1,1}, {1,0,1}, {1,1,1} };

        printArray(arr);

        System.out.println();

        setMatrix(arr);

        printArray(arr);


    }

    public static void setMatrix(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;


        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if(row[i] == true) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if(col[j] == true) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
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
Before:
1 1 1
1 0 1
1 1 1

After:
1 0 1
0 0 0
1 0 1

*/
