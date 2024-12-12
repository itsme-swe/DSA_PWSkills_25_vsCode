package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class sumOfAllElements {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of array elements is: " + sum);
    }
}
// Output: The sum of array elements is: 30
