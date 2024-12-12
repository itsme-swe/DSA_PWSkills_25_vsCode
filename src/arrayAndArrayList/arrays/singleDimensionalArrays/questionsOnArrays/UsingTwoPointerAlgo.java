/*
Reverse the array without using an extra space
*/
package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class UsingTwoPointerAlgo {

    public static void main(String[] args) {

        int[] arr = {30, 40, 20, 10, 50};

        int n = arr.length;

        int i = 0;
        int j = n-1;

        while (i <= j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }

        System.out.println("The reversed array is: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        // Output: 50 10 20 40 30
    }
}
