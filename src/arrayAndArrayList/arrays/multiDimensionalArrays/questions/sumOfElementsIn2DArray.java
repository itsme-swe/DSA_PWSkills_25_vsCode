package arrayAndArrayList.arrays.multiDimensionalArrays.questions;

public class sumOfElementsIn2DArray {

    public static void main(String[] args) {

        int[][] sm = { {1,2,3}, {4,5,6}, {7,8,20} };

        int sum = 0;

        for (int i = 0; i < sm.length; i++) {

            for (int j = 0; j < sm[0].length; j++) {

                sum += sm[i][j];
            }
        }

        System.out.println("The sum of all elements in array is " + sum);

        // o/p: The sum of all elements in array is 56
    }
}
