/*
💥Score After Flipping Matrix.

You are given an m x n binary matrix arr.

A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).

Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.

Return the highest possible score after making any number of moves (including zero moves).


Leetcode(861) - https://leetcode.com/problems/score-after-flipping-matrix/description/

*/

package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class flippingMatrix {

    public static void main(String[] args) {

        int[][] arr = { {0,0,1,1}, {1,0,1,0}, {1,1,0,0}};
    }

    public static void matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;


    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
