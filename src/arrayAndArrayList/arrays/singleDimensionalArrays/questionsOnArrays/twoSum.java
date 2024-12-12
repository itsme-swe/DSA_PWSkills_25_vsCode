/*
Find the doublet in the array whose sum is equal to the given value x.
*/
package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class twoSum {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,1};

        int x = 12;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);

                }
            }
        }

    }
}

