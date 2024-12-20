package Sorting.selectionSorting.QuesBank;

public class basicSorting {

  public static void main(String[] args) {

    int[] arr = { 10, -4, 20, 1, 8, -6 };

    int n = arr.length;

    System.out.print("Unsorted Array: ");
    printArray(arr);

    // Loop through the array (except the last element)
    for (int i = 0; i < n - 1; i++) {

      int minVal = Integer.MAX_VALUE; // Assume the smallest value is the largest possible number
      int minIndex = i; // Assume the first unsorted element is the smallest

      // Loop through the unsorted part of the array
      for (int j = i; j < n; j++) {

        if (arr[j] < minVal) {
          minVal = arr[j];
          minIndex = j;
        }  
      }

      swap(arr, i, minIndex); // Swap the smallest value with the first unsorted element

    }

    System.out.print("Sorted Array: ");
    printArray(arr);

  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();

  }

  public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;

  }

}

/*
 * Unsorted Array: 10 -4 20 1 8 -6
 * 
 * Sorted Array: -6 -4 1 8 10 20
 * 
 */
