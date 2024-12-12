package arrayAndArrayList.arrays.multiDimensionalArrays.basicsOf2DArray;

public class usingForEachLoop {

    public static void main(String[] args) {

        int[][] arr = { {10,20,30}, {40,50,60}, {70,80,90} };

        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
10 20 30
40 50 60
70 80 90

*/