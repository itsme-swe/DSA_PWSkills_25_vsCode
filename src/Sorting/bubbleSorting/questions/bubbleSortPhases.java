/*
 * In this problem we are running loop for multiple phases. The loop will break when i becomes greater than n-1. 
 */
package Sorting.bubbleSorting.questions;

public class bubbleSortPhases {

  public static void main(String[] args) {

    int[] arr = { 5, 1, 3, 4, 2 };

    System.out.println("Unsorted: ");

    printArray(arr);

    System.out.println();

    // Bubble Sort, here running loop for multiple passes till n-1
    for (int i = 0; i < arr.length - 1; i++) {

      swapArr(arr, 0);

    }

    System.out.println("Sorted Array: ");

    printArray(arr);

  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static void swapArr(int[] a, int i) {

    int n = a.length;

    for (i = 0; i < n - 1; i++) {

      if (a[i] > a[i + 1]) {
        int temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;

      }
    }

  }

}
