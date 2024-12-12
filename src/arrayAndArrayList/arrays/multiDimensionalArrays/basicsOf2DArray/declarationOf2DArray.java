package arrayAndArrayList.arrays.multiDimensionalArrays.basicsOf2DArray;

import java.util.Scanner;

public class declarationOf2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of row: ");
        int m = sc.nextInt();

        System.out.print("Enter the size of columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the values of 2D Array: ");

        // Input of values for 2D Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of 2D Array
        for (int i = 0 ; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
