package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class largestElementIn2DArray {

    public static void main(String[] args) {

        int[][] arr = { {2,6,8}, {3,7,9}, {5,1,4} };

        int r = arr.length;
        int c = arr[0].length;

        int max = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;

        // Method-1
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.printf("The largest element in array is %d and the index value is arr[%d, %d] ", max,rowIndex, colIndex);

        // o/p: The largest element in an array is 9, and the index value is arr[1, 2]

        System.out.println();

        // Method-2

        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] > mx) {
                    mx = Math.max(mx, arr[i][j]);
                }
            }
        }
        System.out.println("Largest Element is " + mx);

        // o/p: Largest Element is 9
    }
}
