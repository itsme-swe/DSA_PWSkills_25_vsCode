package Sorting.basicCommonSorting_Ques;

import java.util.Arrays;

public class builtInSortFunction {

  public static void main(String[] args) {

    int[] arr = { 3, 1, -2, 5, 10, 20, 12 };

    System.out.println("Unsorted Array : ");

    for (int ele : arr) {
      System.out.print(ele + " ");
    }

    System.out.println();

    Arrays.sort(arr);

    System.out.println("Sorted Array :");

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

/*
 * Unsorted Array :
 * 3 1 -2 5 10 20 12
 * Sorted Array :
 * -2 1 3 5 10 12 20
 * 
 */
