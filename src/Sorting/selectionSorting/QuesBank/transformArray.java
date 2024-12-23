/*
 * Given an array with N distinct elements, convert the given array to a form where all elements are int he range from 0 to N-1.
 * The order of elementsis the same, i.e, 0 is palced int he place of the smallest element, 1 is placed for the second smallest element,..
 * N-1 is placed for the largest element. 
 * 
 */
package Sorting.selectionSorting.QuesBank;

public class transformArray {

  public static void main(String[] args) {

    int[] arr = { 54, 11, 28, 91, 47, 63 };

    int n = arr.length;

    int x = 0;

    for (int i = 1; i <= n; i++) {

      int minValue = Integer.MAX_VALUE;
      int minIndex = -1;
      for (int j = 0; j < n; j++) {
        if (arr[j] < minValue && arr[j] > 0) {
          minValue = arr[j];
          minIndex = j;
        }
      }
      arr[minIndex] = x;
      x--;
    }
    printArray(arr);

    for (int i = 0; i < arr.length; i++) {
      arr[i] *= (-1);
    }

    printArray(arr);

  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();

  }

}

// 3 0 1 5 2 4
