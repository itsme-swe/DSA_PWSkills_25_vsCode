package Sorting.bubbleSorting.questions;

public class bubbleSortOptimizedSol {

  public static void main(String[] args) {

    int[] arr = { 5, 1, 3, 4, -1, 2 };

    System.out.println("Unsorted Array: ");
    printArray(arr);

    System.out.println();

    sortOptimizedSol(arr);

    System.out.println("Sorted Array: ");
    printArray(arr);

  }

  public static void printArray(int[] a) {

    for (int ele : a) {
      System.out.print(ele + " ");
    }
    System.out.println();

  }

  public static void sortOptimizedSol(int[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

      boolean isSorted = true;

      for (int j = 0; j < n - 1 - i; j++) {

        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSorted = false;
        }

      }

      if (isSorted)
        break;
    }

  }

}

/*
 * 
 * Unsorted Array:
 * 5 1 3 4 -1 2
 * 
 * Sorted Array:
 * -1 1 2 3 4 5
 */
