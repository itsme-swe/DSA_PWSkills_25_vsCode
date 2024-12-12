/*
🍁 Transposing ⇒ Transposing an array means flipping it over its diagonal, effectively swapping its rows and columns.
*/

package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class transformIntoTranspose {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
        int m = arr.length;

        System.out.println("Original Array");
        printArray(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr,i,j);
            }
        }

        System.out.println("Transpose Array");
        printArray(arr);
    }

    public static void printArray(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void swap(int[][] a, int i, int j) {

        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
}

/*

Original Array
1 2 3
4 5 6
7 8 9

Transpose Array
1 4 7
2 5 8
3 6 9


*/
