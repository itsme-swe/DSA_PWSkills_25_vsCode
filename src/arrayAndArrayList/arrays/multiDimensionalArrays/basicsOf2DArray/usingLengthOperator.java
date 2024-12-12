package arrayAndArrayList.arrays.multiDimensionalArrays.basicsOf2DArray;

import java.util.Scanner;

public class usingLengthOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        int m = arr.length;     // this is for rows
        int n = arr[0].length;  // this is for columns

        System.out.println("Enter the values of an array: ");

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
