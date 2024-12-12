/*
🍁 Write a program to print the transpose of the matrix entered by user and store it in new matrix.
*/
package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class transposeOfMatrix {

    public static void main(String[] args) {

        int[][] arr = { {1,2,5}, {3,4,7}, {5,6,9} };

        int m = arr.length;
        int n = arr[0].length;

        //1️⃣ Taking an extra space means storing inside new 2D Array

        int[][] trans = new int[n][m];  // Empty Array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[i][j] = arr[j][i];
            }
        }

        for (int[] row : trans) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();

        //2️⃣ Without taking an extra space
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*

1 3 5
2 4 6
5 7 9

💥 Transpose ⇒ Row becomes column and column becomes row
*/
