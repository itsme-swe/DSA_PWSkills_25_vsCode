package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class matrixInWaveForm {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}, {13,14,15} };

        //1️⃣ Method-1 ...Here we're checking if our row is not evener than reverse the elements. Condition for all odd rows
        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr[i].length - 1;

            if (i % 2 != 0) {
                while (low < high) {
                    int temp = arr[i][low];
                    arr[i][low] = arr[i][high];
                    arr[i][high] = temp;
                    low++;
                    high--;
                }
            }
        }

        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();

        //2️⃣ Method-2. Here we are checking if row is even, then print inner loop from left to right, and if row is odder, then print inner loop from right to left.
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for (int j = n - 1; j >= 0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
