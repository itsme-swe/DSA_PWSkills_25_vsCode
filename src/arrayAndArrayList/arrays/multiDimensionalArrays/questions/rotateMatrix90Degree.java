package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class rotateMatrix90Degree {

    public static void main(String[] args) {

        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };

        System.out.println("Original Array:");
        printArr(matrix);

        //1️⃣ Transposing an array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j);
            }
        }

        System.out.println("Array after transposing: ");
        printArr(matrix);

        //2️⃣ After transposing we'll rotate each array
        System.out.println("Rotated Array");
        for (int i = 0; i < matrix.length; i++) {

            int low = 0;
            int high = matrix.length - 1;

            while (low <= high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

        printArr(matrix);

    }

    public static void printArr(int[][] arr) {

        int m = arr.length;

        for(int[]row: arr) {
            for(int ele : row) {
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

Original Array:
1 2 3
4 5 6
7 8 9

Array after transposing:
1 4 7
2 5 8
3 6 9

Rotated Array
7 4 1
8 5 2
9 6 3


*/
