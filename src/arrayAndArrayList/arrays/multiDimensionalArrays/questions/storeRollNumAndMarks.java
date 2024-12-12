/*
🍁 Write a program to store roll numbers and marks obtained by students side by side in the matrix.
*/
package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

import java.util.Scanner;

public class storeRollNumAndMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][2];

        int m = arr.length;
        int n = arr[0].length;

        System.out.println("Enter the rollNum and marks of students: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] row : arr) {

            for (int ele : row) {

                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
