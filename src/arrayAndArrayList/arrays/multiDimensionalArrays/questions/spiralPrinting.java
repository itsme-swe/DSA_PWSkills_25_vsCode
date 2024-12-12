package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class spiralPrinting {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };

        int m = arr.length;
        int n = arr[0].length;

        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Spiral Printing
        int minRow = 0;
        int maxRow = m - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (minRow <= maxRow && minCol <= maxCol) {
            //1️⃣ Moving left to right
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(arr[minRow][j] + " ");
            }
            minRow++;

            //2️⃣ Moving top to bottom
            if (minRow > maxRow || minCol > maxCol) break;
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol] + " ");
            }
            maxCol--;

            //3️⃣ Moving right to left
            if (minRow > maxRow || minCol > maxCol) break;
            for (int j = maxCol; j >= minCol; j--) {
                System.out.print(arr[maxRow][j] + " ");
            }
            maxRow--;

            //4️⃣ Moving bottom to top
            if (minRow > maxRow || minCol > maxCol) break;
            for (int i = maxRow; i >= minRow; i--) {
                System.out.print(arr[i][minCol] + " ");
            }
            minCol++;

        }
    }
}

// o/p: 1 2 3 4 8 12 11 10 9 5 6 7
