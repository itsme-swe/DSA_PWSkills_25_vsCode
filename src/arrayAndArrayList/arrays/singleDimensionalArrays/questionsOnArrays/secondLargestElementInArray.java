package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class secondLargestElementInArray {

    public static void main(String[] args) {

        int [] arr = {5, 10, 30, 45, 25};

         int max = Integer.MIN_VALUE;
         int secMax = Integer.MIN_VALUE;

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max) max = arr[i];
         }
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > secMax && arr[i] != max) {
                 secMax = arr[i];
             }
         }
        System.out.printf("The second max value is %d", secMax);
         // Output: The second max value is 30
    }
}
