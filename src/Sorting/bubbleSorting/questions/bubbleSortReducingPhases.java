package Sorting.bubbleSorting.questions;

public class bubbleSortReducingPhases {

  public static void main(String[] args) {

    int[] arr = { 5, 1, 3, 4, -1, 2 };

    System.out.println("Unsorted Array: ");
    printArray(arr);

    System.out.println();

    sortArray(arr, 0);

    System.out.println("Sorted Array: ");
    printArray(arr);

  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void sortArray(int[] arr, int i) {

    int n = arr.length;

    for (i = 0; i < n - 1; i++) {

      for (int j = 0; j < n - 1 - i; j++) {

        if (arr[j] > arr[j + 1]) {

          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

        }
      }
    }
  }

}

/*
 * Unsorted Array:
 * 5 1 3 4 -1 2
 * 
 * Sorted Array:
 * -1 1 2 3 4 5
 */
