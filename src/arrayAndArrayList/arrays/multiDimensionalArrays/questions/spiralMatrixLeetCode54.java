/*
💥 Given an m x n matrix, return all elements of the matrix in spiral order.

LeetCode: https://leetcode.com/problems/spiral-matrix/description/
*/

package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrixLeetCode54 {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };

        List<Integer> ans = spiralOrder(arr);

        System.out.println(ans);

    }

    public static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int minRow = 0, maxRow = m - 1;
        int minCol = 0, maxCol = n - 1;

        while (minRow <= maxRow && minCol <= maxCol) {
            //1️⃣ first loop to move from left to right and in this loop minRow is constant and col moving from minCol to maxCol.
            for (int j = minCol; j <= maxCol; j++) {
                ans.add(arr[minRow][j]);
            }
            minRow++;
            //2️⃣ second loop will move from top to bottom, and in this loop now our maxCol is constant and minRow is moving towards maxRow.
            if (minRow > maxRow || minCol > maxCol) break;
            for (int i = minRow; i <= maxRow; i++ ) {
                ans.add(arr[i][maxCol]);
            }
            maxCol--;
            //3️⃣ third loop will move from right to left and here again our maxRow is constant and maxCol is moving towards minCol
            if (minRow > maxRow || minCol > maxCol) break;
            for (int j = maxCol; j >= minCol; j--) {
                ans.add(arr[maxRow][j]);
            }
            maxRow--;
            //4️⃣ fourth loop will move from bottom to top and here minCol is constant and maxRow is moving towards minRow
            if (minRow > maxRow || minCol > maxCol) break;
            for (int i = maxRow; i >= minRow; i--) {
                ans.add(arr[i][minCol]);
            }
            minCol++;
        }
        return ans;
    }

}

// 🔸 o/p: [1, 2, 3, 6, 9, 8, 7, 4, 5]