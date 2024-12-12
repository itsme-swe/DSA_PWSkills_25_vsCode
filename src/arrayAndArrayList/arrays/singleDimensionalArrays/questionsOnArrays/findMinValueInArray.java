package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class findMinValueInArray {

    public static void main(String[] args) {

        int [] arr = {5, 3, 1, -1, 10};

        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < minValue) minValue = arr[i];
        }
        System.out.printf("The min value inside array is %d", minValue);
        // Output: The min value inside array is -1
    }
}
