package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class matrixMultiplication {

    public static void main(String[] args) {

        int[][] a = { {1,2,1}, {2,1,2} };

        int[][] b = {{1,0,1,2}, {2,1,0,0}, {0,3,1,1}};

        for(int[] row : a) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int[] row : b) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Checking if the number of columns in matrix 'a' is equal to the number of rows in matrix 'b'
        if(a[0].length != b.length) System.out.println("Multiplication not possible");

        // In else means Multiplication is possible
        else {

            // Here, Creating the new result matrix with rows of 'a' and columns of 'b'
            int[][] ans = new int[a.length][b[0].length];

            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {

                    for (int k = 0; k < a[0].length; k++) {
                        ans[i][j] += (a[i][k] * b[k][j]);
                    }
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}

/*

1 2 1
2 1 2

1 0 1 2
2 1 0 0
0 3 1 1

5 5 2 3
4 7 4 6

*/
