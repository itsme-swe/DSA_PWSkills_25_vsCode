package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class addTwoMatrices {

    public static void main(String[] args) {

        int[][] arr = { {1,2}, {3,4}, {5,6} };

        int[][] brr = { {2,4}, {6,8}, {3,4} };

        int m = arr.length;
        int n = arr[0].length;

        //1️⃣ Method using extra space
        int res[][] = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
            }
        }

        System.out.println("Printing the res[] array: ");

        for (int row[] : res) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();

        //2️⃣ Method without using extra space
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] += brr[i][j];
            }
        }

        for (int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}

/*

3 6
9 12
8 10

*/